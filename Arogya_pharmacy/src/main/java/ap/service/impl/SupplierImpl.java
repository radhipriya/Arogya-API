package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ap.entities.SupplierEO;
import ap.services.Supplier;

@Service
public class SupplierImpl implements Supplier {

	@Override
	public List<SupplierEO> getAllSupplierDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSupplierDetails(SupplierEO cusEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSupplierDetails(SupplierEO cusEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<SupplierEO> findBySupplierId(String supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSupplierDetails(String supplierId) {
		// TODO Auto-generated method stub
		
	}

	
}