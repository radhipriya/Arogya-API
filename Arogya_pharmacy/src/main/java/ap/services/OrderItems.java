package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.OrderItemsEO;

public interface OrderItems {
	public List<OrderItemsEO> getAllOrderitemsDetails();
	public void addOrderitemsDetails(OrderItemsEO oritEORef);
	public void updateOrderitemsDetails(OrderItemsEO oritEORef);
	public Optional<OrderItemsEO> findByOrderitemsDetails(String order_itemsId);
	public void deleteOrderitemsDetails(String order_itemsId);

}
