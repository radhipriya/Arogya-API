package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.CustomersEO;

public interface Customers {
	public List<CustomersEO> getAllCustomerDetails();
	public void addCustomerDetails(CustomersEO cusEORef);
	public void updateCustomerDetails(CustomersEO cusEORef);
	public Optional<CustomersEO> findByCustomerId(String customerId);
	public Optional<CustomersEO> findByPhoneAndPassword(String phone, String password);
	public Optional<CustomersEO> findByCustomerIdAndPassword(String customerId, String password);
	public void deleteCustomerDetails(String customerId);
}
