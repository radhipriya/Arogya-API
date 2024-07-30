package ap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ap.entities.ProductsRequestsEO;

public interface ProductsRequestsRepository extends CrudRepository<ap.entities.ProductsRequestsEO, String>{

	@Query("SELECT pr FROM ProductsRequestsEO pr WHERE pr.supplier_id = :supplierId")
	List<ProductsRequestsEO> findAllProductsRequestsToSupplier(@Param("supplierId") String supplierId);
}
