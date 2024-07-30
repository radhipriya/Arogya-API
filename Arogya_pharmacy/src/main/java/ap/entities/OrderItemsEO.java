package ap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ORDER_ITEMS")
public class OrderItemsEO {
	@Id
	@Column(name="ORDER_ITEM_ID")
	@GeneratedValue(generator = "custom-generator")
    @GenericGenerator(name = "custom-generator", strategy = "ap.util.CustomStringIdGenerator")
	private String order_item_id;
	
	@Column(name="ORDER_ID")
	private String order_id;
	
	@Column(name="QUANTITY")
	private Long quantity;
	
	@Column(name="TOTAL_ITEM_PRICE")
	private Double total_item_price;
	
	@Column(name="PRODUCT_ID")
	private String product_id;
	
	
	public OrderItemsEO() {
		super();
	}


	public OrderItemsEO(String order_item_id, String order_id, Long quantity, Double total_item_price, String product_id) {
		super();
		this.order_item_id = order_item_id;
		this.order_id = order_id;
		this.quantity = quantity;
		this.total_item_price = total_item_price;
		this.product_id = product_id;
	}


	public String getOrder_item_id() {
		return order_item_id;
	}


	public void setOrder_item_id(String order_item_id) {
		this.order_item_id = order_item_id;
	}


	public String getOrder_id() {
		return order_id;
	}


	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	public Double getTotal_item_price() {
		return total_item_price;
	}


	public void setTotal_item_price(Double total_item_price) {
		this.total_item_price = total_item_price;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	
	
	
	

}
