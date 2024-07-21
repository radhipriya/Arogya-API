package ap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsEO {
	@Id
	@Column(name="PRODUCT_ID")
	private String product_id;
	
	@Column(name="PRODUCT_NAME")
	private String product_name;
	
	@Column(name="PRODUCT_DESC")
	private String product_desc;
	
	@Column(name="CATEGORY")
	private String cateogry;
	
	@Column(name="PRICE")
	private String price;
	
	@Column(name="QUANTITY_INSTOCK")
	private int quantity_instock;
	
	@Column(name="IMAGE")
	private byte[] image;
	
	
	public ProductsEO() {
		super();
	}


	public ProductsEO(String product_id, String product_name, String product_desc, String cateogry, String price,
			int quantity_instock, byte[] image) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_desc = product_desc;
		this.cateogry = cateogry;
		this.price = price;
		this.quantity_instock = quantity_instock;
		this.image = image;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getProduct_desc() {
		return product_desc;
	}


	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}


	public String getCateogry() {
		return cateogry;
	}


	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public int getQuantity_instock() {
		return quantity_instock;
	}


	public void setQuantity_instock(int quantity_instock) {
		this.quantity_instock = quantity_instock;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}	

}
