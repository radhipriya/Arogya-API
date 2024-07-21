package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.PharmacyEO;

public interface Pharmacy {
	public List<PharmacyEO> getAllPharmacyDetails();
	public void addPharmacyDetails(PharmacyEO phEORef);
	public void updatePharmacyDetails(PharmacyEO phEORef);
	public Optional<PharmacyEO> findByPharmacyId(String pharmacyId);
	public void deletePharmacyDetails(String pharmacyId);

}
