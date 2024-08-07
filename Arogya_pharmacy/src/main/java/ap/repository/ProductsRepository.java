package ap.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ap.entities.ProductsEO;

public interface ProductsRepository extends CrudRepository<ap.entities.ProductsEO, String> {

	@Modifying
	@Transactional
	@Query("UPDATE ProductsEO p SET p.quantity_instock = p.quantity_instock - :quantity WHERE p.product_id = :product_id")
	void updateProductQuantity(@Param("product_id") String product_id, @Param("quantity") Long quantity);
}
