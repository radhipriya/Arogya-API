package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ap.entities.PharmacyEO;
import ap.services.Pharmacy;


@Service
public class PharmacyImpl implements Pharmacy {

	@Override
	public List<PharmacyEO> getAllPharmacyDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPharmacyDetails(PharmacyEO phEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePharmacyDetails(PharmacyEO phEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PharmacyEO> findByPharmacyId(String pharmacyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePharmacyDetails(String pharmacyId) {
		// TODO Auto-generated method stub
		
	}
}