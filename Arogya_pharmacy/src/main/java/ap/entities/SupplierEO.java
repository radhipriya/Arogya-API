package ap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="SUPPLIER")
public class SupplierEO {
	
	@Id
	@Column(name="SUPPLIER_ID")
	@GeneratedValue(generator = "custom-generator")
    @GenericGenerator(name = "custom-generator", strategy = "ap.util.CustomStringIdGenerator")
	private String supplier_id;
	
	@Column(name="BRANCH")
	private String branch;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PHONE")
	private Long phone;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	public SupplierEO(String supplier_id, String branch, String address, Long phone, String email, String password) {
		super();
		this.supplier_id = supplier_id;
		this.branch = branch;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	public SupplierEO() {
		super();
	}

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
