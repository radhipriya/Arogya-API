package ap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import ap.entities.SupplierEO;

public interface SupplierRepository extends CrudRepository<ap.entities.SupplierEO, String>{


	@Query("SELECT c FROM SupplierEO c WHERE c.supplier_id = :supplierId AND c.password = :password")
	Optional<SupplierEO> findBySupplierIdAndPassword(@Param("supplierId") String supplierId, @Param("password") String password);

}
