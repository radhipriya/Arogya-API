package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ap.controller.OrderDetailsController;
import ap.entities.EmployeesEO;
import ap.entities.OrderDetailsEO;
import ap.entities.OrderItemsEO;
import ap.repository.OrderDetailsRepository;
import ap.repository.OrderItemsRepository;
import ap.repository.ProductsRepository;
import ap.services.OrderDetails;

@Service
public class OrderDetailsImpl implements OrderDetails {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderDetailsController.class);
	
	@Autowired
	private OrderDetailsRepository orderdetailsrepositoryref;
    
	@Autowired
    private OrderItemsRepository orderItemsRepository;
	
	@Autowired
	ProductsRepository productssrepositoryref;

	@Override
	public List<OrderDetailsEO> getAllOrderDetails() {
		// TODO Auto-generated method stub
		List<OrderDetailsEO> listoforders = (List<OrderDetailsEO>) orderdetailsrepositoryref.findAll();
		return listoforders;
	}

	@Override
	public OrderDetailsEO addOrderDetails(OrderDetailsEO orEORef, List<OrderItemsEO> orderItems) {
	    OrderDetailsEO orderdetails = orderdetailsrepositoryref.save(orEORef);
	    
        for (OrderItemsEO orderItem : orderItems) {
            orderItem.setOrder_id(orderdetails.getOrder_id());
            orderItemsRepository.save(orderItem);
            
            String product_id = orderItem.getProduct_id();
            Long quantity = orderItem.getQuantity();
            productssrepositoryref.updateProductQuantity(product_id, quantity);
        }
	    return orderdetails;
	}

	@Override
	public void updateOrderDetails(OrderDetailsEO orEORef) {
		// TODO Auto-generated method stub
		orderdetailsrepositoryref.save(orEORef);
	}
	
	@Override
	public void updateBillDetails(String orderId, byte[] bill) {
		orderdetailsrepositoryref.updateBillDetails(orderId, bill);
	}

	@Override
	public Optional<OrderDetailsEO> findByOrderId(String OrderId) {
		Optional<OrderDetailsEO> orderdetails = orderdetailsrepositoryref.findById(OrderId);
		return orderdetails;
	}

	@Override
	public List<OrderDetailsEO> findByCustomerId(String CustomerId) {
		List<OrderDetailsEO> orderdetails = orderdetailsrepositoryref.findByCustomerId(CustomerId);
		return orderdetails;
	}
	
	
	@Override
	public void deleteOrderDetails(String OrderId) {
		// TODO Auto-generated method stub
		
	}
	
}
