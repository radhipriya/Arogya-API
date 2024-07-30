package ap.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.annotation.MultipartConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ap.entities.FeedbackEO;
import ap.entities.OrderDetailsEO;
import ap.entities.OrderItemsEO;
import ap.services.OrderDetails;

@RestController
@RequestMapping(value="/orders")
@CrossOrigin("http://localhost:3000")
public class OrderDetailsController {

	@Autowired
	private OrderDetails OrderDetailsService;
	
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderDetailsController.class);
	
	@RequestMapping(value="/getAllOrderDetails", method=RequestMethod.GET)
	public List<OrderDetailsEO> getAllOrderDetails()
	{
		return OrderDetailsService.getAllOrderDetails();
	}
	
	@RequestMapping(value="/add-orderdetails", method=RequestMethod.POST)
	@ResponseBody
	public OrderDetailsEO addOrderDetails(@RequestBody Map<String, Object> requestBody)
	{
	    LOGGER.info("HIT");
	    Map<String, Object> orderDetailsMap = (Map<String, Object>) requestBody.get("orderDetails");
	    OrderDetailsEO orderDetailsEO = new OrderDetailsEO();
	    orderDetailsEO.setCustomer_id(orderDetailsMap.get("customer_id").toString());
	    orderDetailsEO.setStatus(orderDetailsMap.get("status").toString());
	    orderDetailsEO.setTotal_price(Double.parseDouble(orderDetailsMap.get("total_price").toString()));

	    List<OrderItemsEO> orderItems = new ArrayList<>();
	    List<Map<String, Object>> orderItemsList = (List<Map<String, Object>>) requestBody.get("orderItems");
	    for (Map<String, Object> item : orderItemsList) {
	        OrderItemsEO orderItemsEO = new OrderItemsEO();
	        orderItemsEO.setProduct_id(item.get("product_id").toString());
	        orderItemsEO.setQuantity(Long.parseLong(item.get("quantity").toString()));
	        orderItemsEO.setTotal_item_price(Double.parseDouble(item.get("total_item_price").toString()));
	        orderItems.add(orderItemsEO);
	    }

	    OrderDetailsEO orderdetails = OrderDetailsService.addOrderDetails(orderDetailsEO, orderItems);
	    LOGGER.info("IN CONTROLLER: ORDER ID IS {}", orderdetails.getOrder_id());
	    return orderdetails;
	}

	@RequestMapping(value="/update-orderdetails", method=RequestMethod.PUT)
	public void updateOrderDetails(@RequestBody OrderDetailsEO orEORef)
	{
		OrderDetailsService.updateOrderDetails(orEORef);
	}
	
	@RequestMapping(value="/update-bill", method=RequestMethod.PUT, consumes = {"multipart/form-data"})
	public void updateOrderDetails(
		    @RequestPart("order_id") String orderId, 
		    @RequestPart("bill") MultipartFile bill
    ) throws IOException
	{
		OrderDetailsService.updateBillDetails(orderId, bill.getBytes());
	}
	
	@RequestMapping(value="/findById-orderdetails/{OrderId}", method=RequestMethod.GET)
	public Optional<OrderDetailsEO> findByOrderId(@PathVariable String OrderId)
	{
		Optional<OrderDetailsEO> orderdetails = OrderDetailsService.findByOrderId(OrderId);
		return orderdetails;
	}
	
	@RequestMapping(value="/findByCustomerId/{CustomerId}", method=RequestMethod.GET)
	public List<OrderDetailsEO> findByCustomerId(@PathVariable String CustomerId)
	{
		List<OrderDetailsEO> orderdetails = OrderDetailsService.findByCustomerId(CustomerId);
		return orderdetails;
	}
	
	@RequestMapping(value="/delete-orderdetails/{Id}", method=RequestMethod.DELETE)
	public void deleteOrderDetails(@PathVariable String OrderId){
		OrderDetailsService.deleteOrderDetails(OrderId);
	}

}
