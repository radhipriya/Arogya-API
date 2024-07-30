package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.CustomersEO;
import ap.entities.EmployeesEO;

public interface Employees {
	public List<EmployeesEO> getAllEmployeesDetails();
	public void addEmployeesDetails(EmployeesEO empEORef);
	public void updateEmployeesDetails(EmployeesEO empEORef);
	public Optional<EmployeesEO> findByEmployeesId(String employee_Id);
	public Optional<EmployeesEO> findByEmployeeIdAndPassword(String employee_Id, String password);
	public void deleteEmployeesDetails(String employee_Id);

}
