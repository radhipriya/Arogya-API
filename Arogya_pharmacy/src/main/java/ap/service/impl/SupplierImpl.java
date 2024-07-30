package ap.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap.entities.CustomersEO;
import ap.entities.SupplierEO;
import ap.repository.SupplierRepository;
import ap.services.Supplier;

@Service
public class SupplierImpl implements Supplier {
	@Autowired
	SupplierRepository supplierrepositoryref;

	@Override
	public List<SupplierEO> getAllSupplierDetails() {
		// TODO Auto-generated method stub
		List<SupplierEO> returnedSupplierList = new ArrayList();
		returnedSupplierList=(List<SupplierEO>) supplierrepositoryref.findAll();
		return returnedSupplierList;
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
		Optional<SupplierEO> supplierdetails = supplierrepositoryref.findById(supplierId);
		return supplierdetails;
	}

	@Override
	public void deleteSupplierDetails(String supplierId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<SupplierEO> findBySupplierIdAndPassword(String supplierId, String password){
		Optional<SupplierEO> details = supplierrepositoryref.findBySupplierIdAndPassword(supplierId, password);
		return details;
	}

	
}
