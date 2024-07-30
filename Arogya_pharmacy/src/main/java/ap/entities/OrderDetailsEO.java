package ap.entities;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ORDER_DETAILS")
public class OrderDetailsEO {
	@Id
	@Column(name="ORDER_ID")
	@GeneratedValue(generator = "custom-order-id")
	@GenericGenerator(name = "custom-order-id", strategy = "ap.util.CustomOrderIdGenerator")
   	private String order_id;
	
	@Column(name="CUSTOMER_ID")
   	private String customer_id;
	
	@Column(name="STATUS")
   	private String status;
	
	@CreationTimestamp
	@Column(name="ORDER_DATE", columnDefinition = "TIMESTAMP")
	private LocalDateTime order_date;
	
	@Column(name="DELIVERY_DATE", columnDefinition = "TIMESTAMP")
   	private LocalDateTime delivery_date;
	
	@Column(name="TOTAL_PRICE")
   	private Double total_price;
	
	@Column(name="BILL")
   	private byte[] bill;
	
	@Column(name="BILL_NO")
   	private String bill_no;
	
	public OrderDetailsEO() {
		super();
	}
	public OrderDetailsEO(String order_id, String customer_id, String status, LocalDateTime order_date, LocalDateTime delivery_date,
			Double total_price, byte[] bill, String bill_no) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.status = status;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
		this.total_price = total_price;
		this.bill = bill;
		this.bill_no = bill_no;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getOrder_date() {
		return order_date;
	}
	public void setOrder_date(LocalDateTime order_date) {
		this.order_date = order_date;
	}
	public LocalDateTime getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(LocalDateTime delivery_date) {
		this.delivery_date = delivery_date;
	}
	public Double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}
	public byte[] getBill() {
		return bill;
	}
	@Lob
	public void setBill(byte[] bill) {
		this.bill = bill;
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}
	
	@Override
	public String toString() {
		return "OrderDetailsEO [order_id=" + order_id + ", customer_id=" + customer_id + ", status=" + status
				+ ", order_date=" + order_date + ", delivery_date=" + delivery_date + ", total_price=" + total_price
				+ ", bill=" + Arrays.toString(bill) + "]";
	}

}
