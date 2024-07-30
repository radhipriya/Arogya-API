package ap.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name ="PRODUCTS")
public class ProductsEO implements Serializable {
	


	@Id
	@Column(name="PRODUCT_ID")
	@GeneratedValue(generator = "custom-generator")
    @GenericGenerator(name = "custom-generator", strategy = "ap.util.CustomStringIdGenerator")
	private String product_id;
	
	@Column(name="PRODUCT_NAME")
	private String product_name;
	
	@Column(name="PRODUCT_DESC")
	private String product_desc;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name="PRICE")
	private String price;
	
	@Column(name="QUANTITY_INSTOCK")
	private Long quantity_instock;
	
	@Column(name="IMAGE")
	private byte[] image;
	
	@Column(name="GST")
	private Long gst;

	public ProductsEO() {
		super();
	}

	public ProductsEO(String product_id, String product_name, String product_desc, String category, String price,
			Long quantity_instock, byte[] image, Long gst) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_desc = product_desc;
		this.category = category;
		this.price = price;
		this.quantity_instock = quantity_instock;
		this.image = image;
		this.gst = gst;
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


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public Long getQuantity_instock() {
		return quantity_instock;
	}


	public void setQuantity_instock(Long quantity_instock) {
		this.quantity_instock = quantity_instock;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}

	public Long getGst() {
		return gst;
	}

	public void setGst(Long gst) {
		this.gst = gst;
	}
	@Override
	public String toString() {
		return "ProductsEO [product_id=" + product_id + ", product_name=" + product_name + ", product_desc="
				+ product_desc + ", category=" + category + ", price=" + price + ", quantity_instock="
				+ quantity_instock + ", image=" + Arrays.toString(image) + "]";
	}

}
