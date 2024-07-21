package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.OrderDetailsEO;

public interface OrderDetails {
	public List<OrderDetailsEO> getAllOrderDetails();
	public void addOrderDetails(OrderDetailsEO orEORef);
	public void updateOrderDetails(OrderDetailsEO orEORef);
	public Optional<OrderDetailsEO> findByOrderId(String OrderId);
	public void deleteOrderDetails(String OrderId);
}



