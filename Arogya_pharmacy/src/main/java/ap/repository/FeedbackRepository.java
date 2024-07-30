package ap.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ap.entities.FeedbackEO;

public interface FeedbackRepository extends CrudRepository<ap.entities.FeedbackEO,String>{

	@Query("SELECT e FROM FeedbackEO e WHERE e.customer_id = :customerId")
	List<FeedbackEO> findFeedbackByCustomerID(@Param("customerId") String customerId);
}
