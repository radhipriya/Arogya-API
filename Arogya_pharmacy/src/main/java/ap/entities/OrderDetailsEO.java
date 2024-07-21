package ap.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetailsEO {
	@Id
	@Column(name="ORDER_ID")
   	private String Order_id;
	
	@Column(name="CUSTOMER_ID")
   	private String Customer_id;
	
	@Column(name="STATUS")
   	private String Status;
	
	@Column(name="ORDER_DATE")
   	private Date order_date;
	
	@Column(name="DELIVERY_DATE")
   	private Date delivery_date;
	
	@Column(name="TOTAL_PRICE")
   	private int total_price;
	
	@Column(name="BILL")
   	private byte[] bill;
	
	public OrderDetailsEO() {
		super();
	}
	public OrderDetailsEO(String order_id, String customer_id, String status, Date order_date, Date delivery_date,
			int total_price, byte[] bill) {
		super();
		Order_id = order_id;
		Customer_id = customer_id;
		Status = status;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
		this.total_price = total_price;
		this.bill = bill;
	}
	public String getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public byte[] getBill() {
		return bill;
	}
	public void setBill(byte[] bill) {
		this.bill = bill;
	}
}
