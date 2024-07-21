package ap.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap.entities.CustomersEO;
import ap.repository.CustomersRepository;
import ap.services.Customers;

@Service
public class CustomersImpl implements Customers   {
	@Autowired
	CustomersRepository customersrepositoryref;

	@Override
	public List<CustomersEO> getAllCustomerDetails() {
		List<CustomersEO> returnedClaimQueryList = new ArrayList();
		returnedClaimQueryList=(List<CustomersEO>) customersrepositoryref.findAll();
		return returnedClaimQueryList;
	}

	@Override
	public void addCustomerDetails(CustomersEO cusEORef) {
		// TODO Auto-generated method stub
		customersrepositoryref.save(cusEORef);
	}

	@Override
	public void updateCustomerDetails(CustomersEO cusEORef) {
		// TODO Auto-generated method stub
		customersrepositoryref.save(cusEORef);
	}

	@Override
	public Optional <CustomersEO> findByCustomerId(String customerId) {

		// TODO Auto-generated method stub
		Optional<CustomersEO> customerdetails = customersrepositoryref.findById(customerId);
		return customerdetails;
		
	}
	
	public Optional<CustomersEO> findByPhoneAndPassword(Long phone, String password) {
		Optional<CustomersEO> customerdetails = customersrepositoryref.findByPhoneAndPassword(phone, password);
		return customerdetails;
	}

	@Override
	public void deleteCustomerDetails(String customerId) {
		// TODO Auto-generated method stub
		customersrepositoryref.deleteById(customerId);
	}

	
	

}