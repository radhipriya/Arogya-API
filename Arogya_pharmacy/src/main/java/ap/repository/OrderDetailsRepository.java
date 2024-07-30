package ap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ap.entities.OrderDetailsEO;

public interface OrderDetailsRepository extends CrudRepository<ap.entities.OrderDetailsEO,String> {
	
	@Query("SELECT o FROM OrderDetailsEO o WHERE o.customer_id = :customerId")
	List<OrderDetailsEO> findByCustomerId(@Param("customerId") String customerId);
	
	@Modifying
	@Transactional
	@Query("UPDATE OrderDetailsEO o SET o.bill = :bill WHERE o.order_id = :orderId")
	void updateBillDetails(@Param("orderId") String orderId, @Param("bill") byte[] bill);

}
