package ap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ap.entities.OrderItemsEO;

public interface OrderItemsRepository extends CrudRepository<ap.entities.OrderItemsEO, String>{

	@Query("SELECT o FROM OrderItemsEO o WHERE o.order_id = :order_Id")
	List<OrderItemsEO> findByOrderIDDetails(@Param("order_Id") String order_Id);
}
