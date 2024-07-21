package ap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsRequestsEO {
	@Id
	@Column(name="REQUEST_NUMBER")
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
	private int quantity;
	
	
	
	
	public ProductsRequestsEO() {
		super();
	}


	public ProductsRequestsEO(String request_number, String supplier_id, String pharmacy_id, String product_id,
			int quantity, String status) {
		super();
		this.request_number = request_number;
		this.supplier_id = supplier_id;
		this.pharmacy_id = pharmacy_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.status = status;
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


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}