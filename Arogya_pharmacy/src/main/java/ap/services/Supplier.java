package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.SupplierEO;

public interface Supplier {
	public List<SupplierEO> getAllSupplierDetails();
	public void addSupplierDetails(SupplierEO supEORef);
	public void updateSupplierDetails(SupplierEO supEORef);
	public Optional<SupplierEO> findBySupplierId(String supplierId);
	public void deleteSupplierDetails(String supplierId);

}
