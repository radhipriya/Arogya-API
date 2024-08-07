package ap.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap.entities.CustomersEO;
import ap.entities.EmployeesEO;
import ap.repository.EmployeesRepository;
import ap.services.Employees;



@Service
public class EmployeesImpl implements Employees{
	@Autowired
	EmployeesRepository employeesrepositoryref;

	@Override
	public List<EmployeesEO> getAllEmployeesDetails() {
		// TODO Auto-generated method stub
		List<EmployeesEO> returnedClaimQueryList = new ArrayList();
		returnedClaimQueryList=(List<EmployeesEO>) employeesrepositoryref.findAll();
		return returnedClaimQueryList;
	}

	@Override
	public void addEmployeesDetails(EmployeesEO empEORef) {
		// TODO Auto-generated method stub
		employeesrepositoryref.save(empEORef);
	}

	@Override
	public void updateEmployeesDetails(EmployeesEO empEORef) {
		// TODO Auto-generated method stub
		employeesrepositoryref.save(empEORef);
	}

	@Override
	public Optional<EmployeesEO> findByEmployeesId(String employee_Id) {

		// TODO Auto-generated method stub
		Optional<EmployeesEO> employeedetails = employeesrepositoryref.findById(employee_Id);
		return employeedetails;
		
	}
	
	public Optional<EmployeesEO> findByEmployeeIdAndPassword(String employeeId, String password) {
		Optional<EmployeesEO> employeedetails = employeesrepositoryref.findByEmployeeIdAndPassword(employeeId, password);
		return employeedetails;
	}

	@Override
	public void deleteEmployeesDetails(String employee_Id) {
		employeesrepositoryref.deleteById(employee_Id);
		
	}
	

}
