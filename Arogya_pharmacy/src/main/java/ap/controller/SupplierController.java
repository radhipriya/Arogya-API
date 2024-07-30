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

import ap.entities.CustomersEO;
import ap.entities.SupplierEO;
import ap.services.Supplier;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value="/supplier")
@CrossOrigin("http://localhost:3000")
public class SupplierController {
	@Autowired
	private  Supplier SupplierService;
	
	
	@RequestMapping(value="/getAllSupplierDetails", method=RequestMethod.GET)
	public List<SupplierEO> getAllSupplierDetails()
	{
		return SupplierService.getAllSupplierDetails();
	}
	
	@RequestMapping(value="/add-supplierdetails", method=RequestMethod.POST)
	public void addSupplierDetails(@RequestBody SupplierEO supEORef)
	{
		SupplierService.addSupplierDetails(supEORef);
	}
	
	@RequestMapping(value="/update-supplierdetails", method=RequestMethod.PUT)
	public void updateSupplierDetails(@RequestBody SupplierEO supEORef)
	{
		SupplierService.updateSupplierDetails(supEORef);
	}
	
	@RequestMapping(value="/findById-supplierdetails/{supplierId}", method=RequestMethod.GET)
	public Optional<SupplierEO> findBySupplierId(@PathVariable String supplierId)
	{
		Optional<SupplierEO> supplierdetails = SupplierService.findBySupplierId(supplierId);
		return supplierdetails;
	}
	
	@RequestMapping(value="/findById-supplierdetails/{supplierId}/{password}", method=RequestMethod.GET)
	public Optional<SupplierEO> findBySupplierIdAndPassword(@PathVariable String supplierId,@RequestParam String password)
	{
		
	    Optional<SupplierEO> supdetails = SupplierService.findBySupplierIdAndPassword(supplierId, password);
	    return supdetails;
	}
	
	@RequestMapping(value="/delete-supplierdetails/{supplierId}", method=RequestMethod.DELETE)
	public void deleteSupplierDetails(@PathVariable String supplierId)
	{
		SupplierService.deleteSupplierDetails(supplierId);
	}

}
