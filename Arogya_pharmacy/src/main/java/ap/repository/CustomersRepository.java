package ap.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ap.entities.CustomersEO;

public interface CustomersRepository extends CrudRepository<ap.entities.CustomersEO,String>{
	
	Optional<CustomersEO> findByPhoneAndPassword(Long phone, String password);

}