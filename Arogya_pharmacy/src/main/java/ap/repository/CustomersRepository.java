package ap.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ap.entities.CustomersEO;

public interface CustomersRepository extends CrudRepository<ap.entities.CustomersEO,String>{

	@Query("SELECT c FROM CustomersEO c WHERE c.customer_id = :customerId AND c.password = :password")
	Optional<CustomersEO> findByCustomerIdAndPassword(@Param("customerId") String customerId, @Param("password") String password);

}
