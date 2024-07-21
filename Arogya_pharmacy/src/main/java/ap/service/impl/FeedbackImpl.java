package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ap.entities.FeedbackEO;
import ap.services.Feedback;


@Service
public class FeedbackImpl implements Feedback{

	@Override
	public List<FeedbackEO> getAllFeedbackDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFeedbackDetails(FeedbackEO fedEORef) {
		// TODO Auto-generated method stub
		
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
