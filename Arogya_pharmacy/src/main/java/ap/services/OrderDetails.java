package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.OrderDetailsEO;
import ap.entities.OrderItemsEO;

public interface OrderDetails {
	public List<OrderDetailsEO> getAllOrderDetails();
	public OrderDetailsEO addOrderDetails(OrderDetailsEO orEORef, List<OrderItemsEO> orderItems);
	public void updateOrderDetails(OrderDetailsEO orEORef);
	public void updateBillDetails(String orderId, byte[] bill);
	public Optional<OrderDetailsEO> findByOrderId(String OrderId);
	public List<OrderDetailsEO> findByCustomerId(String CustomerId);
	public void deleteOrderDetails(String OrderId);
}




