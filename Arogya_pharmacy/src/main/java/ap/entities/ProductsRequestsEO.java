package ap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PRODUCTS_REQUESTS")
public class ProductsRequestsEO {
	@Id
	@Column(name="REQUEST_NUMBER")
	@GeneratedValue(generator = "custom-generator")
    @GenericGenerator(name = "custom-generator", strategy = "ap.util.CustomStringIdGenerator")
	private String request_number;
	
	@Column(name="SUPPLIER_ID")
	private String supplier_id;
	
	@Column(name="PHARMACY_ID")
	private String pharmacy_id;
	
	@Column(name="PRODUCT_ID")
	private String product_id;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="QUANTITY")
	private Long quantity;
	
	@Column(name="EMPLOYEE_ID")
	private String employee_id;
	
	public ProductsRequestsEO() {
		super();
	}
	
	public ProductsRequestsEO(String request_number, String supplier_id, String pharmacy_id, String product_id,
			String status, Long quantity, String employee_id) {
		super();
		this.request_number = request_number;
		this.supplier_id = supplier_id;
		this.pharmacy_id = pharmacy_id;
		this.product_id = product_id;
		this.status = status;
		this.quantity = quantity;
		this.employee_id = employee_id;
	}

	public String getRequest_number() {
		return request_number;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public void setRequest_number(String request_number) {
		this.request_number = request_number;
	}


	public String getSupplier_id() {
		return supplier_id;
	}


	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}


	public String getPharmacy_id() {
		return pharmacy_id;
	}


	public void setPharmacy_id(String pharmacy_id) {
		this.pharmacy_id = pharmacy_id;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
}
