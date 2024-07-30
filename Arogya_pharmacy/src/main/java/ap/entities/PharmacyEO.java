package ap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PHARMACY")
public class PharmacyEO {
	@Id
	@Column(name="PHARMACY_ID")
	@GeneratedValue(generator = "custom-generator")
    @GenericGenerator(name = "custom-generator", strategy = "ap.util.CustomStringIdGenerator")
	private String pharmacy_id;
	
	@Column(name="BRANCH")
	private String branch;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PHONE")
	private int phone;
	
	@Column(name="EMAIL")
	private String email;
	
	
	public PharmacyEO() {
		super();
	}

	public PharmacyEO(String pharmacy_id, String branch, String address, int phone, String email) {
		super();
		this.pharmacy_id = pharmacy_id;
		this.branch = branch;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getPharmacy_id() {
		return pharmacy_id;
	}

	public void setPharmacy_id(String pharmacy_id) {
		this.pharmacy_id = pharmacy_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
