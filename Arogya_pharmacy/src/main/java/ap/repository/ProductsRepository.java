package ap.repository;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<ap.entities.ProductsEO, String> {

}
