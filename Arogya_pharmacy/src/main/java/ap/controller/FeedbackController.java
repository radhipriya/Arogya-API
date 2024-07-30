package ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ap.entities.FeedbackEO;
import ap.services.Feedback;



import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/feedback")
@CrossOrigin("http://localhost:3000")
public class FeedbackController {
	@Autowired
	private Feedback FeedbackService;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FeedbackController.class);
	
	@RequestMapping(value="/getAllFeedbackDetails", method=RequestMethod.GET)
	public List<FeedbackEO> getAllFeedbackDetails()
	{
		return FeedbackService.getAllFeedbackDetails();
	}
	
	@RequestMapping(value="/getFeedbackByCustID/{customerId}", method=RequestMethod.GET)
	public List<FeedbackEO> getFeedbackByCustID(@PathVariable String customerId)
	{
		LOGGER.info("Getting feedback by customer ID: {}", customerId);
		List<FeedbackEO> feedbackdetails = FeedbackService.getFeedbackByCustID(customerId); 
		return feedbackdetails;
	}
	
	@RequestMapping(value="/add-feedback", method=RequestMethod.POST)
	public void addFeedbackDetails(@RequestBody FeedbackEO fedEORef)
	{
		LOGGER.info("Posting feedback by customer ID: {}", fedEORef);
		FeedbackService.addFeedbackDetails(fedEORef);
	}
	
	@RequestMapping(value="/update-feedback", method=RequestMethod.PUT)
	public void updateFeedbackDetails(@RequestBody FeedbackEO fedEORef)
	{
		FeedbackService.updateFeedbackDetails(fedEORef);
	}
	
	@RequestMapping(value="/findById-feedback/{Id}", method=RequestMethod.PUT)
	public Optional<FeedbackEO> findByFeedbackId(@PathVariable String Id)
	{
		Optional<FeedbackEO> feedback = FeedbackService.findByFeedbackId(Id);
		return feedback;
	}
	
	@RequestMapping(value="/delete-feedback/{Id}", method=RequestMethod.DELETE)
	public void deleteFeedbackDetails(@PathVariable String Id){
		FeedbackService.deleteFeedbackDetails(Id);
	}



}
