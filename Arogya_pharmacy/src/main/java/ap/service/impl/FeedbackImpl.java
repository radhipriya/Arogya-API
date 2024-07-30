package ap.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap.entities.FeedbackEO;
import ap.repository.FeedbackRepository;
import ap.services.Feedback;


@Service
public class FeedbackImpl implements Feedback{

	@Autowired
	FeedbackRepository feedbackrepositoryref;
	
	@Override
	public List<FeedbackEO> getAllFeedbackDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<FeedbackEO> getFeedbackByCustID(String customerId) {
		List<FeedbackEO> returnedfeedback = feedbackrepositoryref.findFeedbackByCustomerID(customerId);
		return returnedfeedback;
	}

	@Override
	public void addFeedbackDetails(FeedbackEO fedEORef) {
		// TODO Auto-generated method stub
		feedbackrepositoryref.save(fedEORef);
	}

	@Override
	public void updateFeedbackDetails(FeedbackEO fedEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<FeedbackEO> findByFeedbackId(String Id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFeedbackDetails(String Id) {
		// TODO Auto-generated method stub
		
	}

}
