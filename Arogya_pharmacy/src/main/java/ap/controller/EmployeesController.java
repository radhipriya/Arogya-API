package ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ap.entities.EmployeesEO;
import ap.services.Employees;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value="/employees")
@CrossOrigin("http://localhost:3000")
public class EmployeesController {
	@Autowired
	private Employees EmployeesService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FeedbackController.class);
	
	
	@RequestMapping(value="/getAllEmployeesDetails", method=RequestMethod.GET)
	public List<EmployeesEO> getAllEmployeesDetails()
	{
		return EmployeesService.getAllEmployeesDetails();
	}
	
	@RequestMapping(value="/add-empdetails", method=RequestMethod.POST)
	public void addEmployeesDetails(@RequestBody EmployeesEO empEORef)
	{
		EmployeesService.addEmployeesDetails(empEORef);
	}
	
	@RequestMapping(value="/update-empdetails", method=RequestMethod.PUT)
	public void updateEmployeesDetails(@RequestBody EmployeesEO empEORef)
	{
		EmployeesService.updateEmployeesDetails(empEORef);
	}
	
	@RequestMapping(value="/findById-empdetails/{employee_id}", method=RequestMethod.GET)
	public Optional<EmployeesEO> findByEmployeesId(@PathVariable String employee_id)
	{
		Optional<EmployeesEO> empdetails = EmployeesService.findByEmployeesId(employee_id);
		return empdetails;
	}
	
	@RequestMapping(value="/findById-empdetails/{employee_id}/{password}" , method=RequestMethod.GET)
	public Optional<EmployeesEO> findByEmployeeIdAndPassword(@PathVariable String employee_id, @RequestParam String password)
	{
		LOGGER.info("Login by Employee ID: {}", employee_id);
	    Optional<EmployeesEO> empdetails = EmployeesService.findByEmployeeIdAndPassword(employee_id, password);
	    return empdetails;
	}
	
	@RequestMapping(value="/delete-empdetails/{Id}", method=RequestMethod.DELETE)
	public void deleteEmployeesDetails(@PathVariable String employee_Id){
		EmployeesService.deleteEmployeesDetails(employee_Id);
	}


}
