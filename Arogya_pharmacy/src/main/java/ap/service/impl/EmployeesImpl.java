package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ap.entities.EmployeesEO;
import ap.services.Employees;



@Service
public class EmployeesImpl implements Employees{

	@Override
	public List<EmployeesEO> getAllEmployeesDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployeesDetails(EmployeesEO empEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeesDetails(EmployeesEO empEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<EmployeesEO> findByEmployeesId(String employee_Id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeesDetails(String employee_Id) {
		// TODO Auto-generated method stub
		
	}
	

}