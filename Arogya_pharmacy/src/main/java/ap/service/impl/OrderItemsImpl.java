package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap.entities.OrderItemsEO;
import ap.repository.OrderItemsRepository;
import ap.services.OrderItems;


@Service
public class OrderItemsImpl implements OrderItems{
	
	@Autowired
	OrderItemsRepository orderitemsrepositoryref;

	@Override
	public List<OrderItemsEO> getAllOrderitemsDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOrderitemsDetails(OrderItemsEO oritEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrderitemsDetails(OrderItemsEO oritEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<OrderItemsEO> findByOrderitemsDetails(String order_itemsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrderitemsDetails(String order_itemsId) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<OrderItemsEO> findByOrderIDDetails(String order_Id) {
		return orderitemsrepositoryref.findByOrderIDDetails(order_Id);
	}
	
}
