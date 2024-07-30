package ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ap.entities.PharmacyEO;
import ap.services.Pharmacy;

@RestController
@RequestMapping("/Pharmacy")
@CrossOrigin("http://localhost:3000")
public class PharmacyController {
	@Autowired
	private Pharmacy PharmacyService;
	
	
	@RequestMapping(value="/getAllPharmacyDetails", method=RequestMethod.GET)
	public List<PharmacyEO> getAllPharmacyDetails()
	{
		return PharmacyService.getAllPharmacyDetails();
	}
	
	@RequestMapping(value="/add-pharmacy", method=RequestMethod.POST)
	public void addPharmacyDetails(@RequestBody PharmacyEO phEORef)
	{
		PharmacyService.addPharmacyDetails(phEORef);
	}
	
	@RequestMapping(value="/update-pharmacy", method=RequestMethod.PUT)
	public void updatePharmacyDetails(@RequestBody PharmacyEO phEORef)
	{
	
		PharmacyService.updatePharmacyDetails(phEORef);
	}
	
	@RequestMapping(value="/findById-pharmacy/{pharmacyId}", method=RequestMethod.GET)
	public Optional<PharmacyEO> findByPharmacyId(@PathVariable String pharmacyId)
	{
		Optional<PharmacyEO> pharmacy = PharmacyService.findByPharmacyId(pharmacyId);
		return pharmacy;
	}
	
	@RequestMapping(value="/delete-pharmacy/{pharmacyId}", method=RequestMethod.DELETE)
	public void deletePharmacyDetails(@PathVariable String pharmacyId)
	{
		PharmacyService.deletePharmacyDetails(pharmacyId);
	}


}
