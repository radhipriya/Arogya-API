package ap.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="FEEDBACK")
public class FeedbackEO {
	@Id
	@Column(name="ID")
	@GeneratedValue(generator = "custom-generator")
    @GenericGenerator(name = "custom-generator", strategy = "ap.util.CustomStringIdGenerator")
	private String id;
	
	@Column(name="CUSTOMER_ID")
	private String customer_id;
	
	@CreationTimestamp
	@Column(name="GIVEN_ON")
	private Date date;
	
	@Column(name="FEEDBACK")
	private String feedback;
	
	@Column(name="RATING")
	private int rating;
	

	public FeedbackEO() {
		super();
	}


	public FeedbackEO(String id, String customer_id, Date date, String feedback, int rating) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.date = date;
		this.feedback = feedback;
		this.rating = rating;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	

}
