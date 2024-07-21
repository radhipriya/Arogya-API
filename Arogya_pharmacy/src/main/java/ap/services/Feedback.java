package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.FeedbackEO;

public interface Feedback {
	public List<FeedbackEO> getAllFeedbackDetails();
	public void addFeedbackDetails(FeedbackEO fedEORef);
	public void updateFeedbackDetails(FeedbackEO fedEORef);
	public Optional<FeedbackEO> findByFeedbackId(String Id);
	public void deleteFeedbackDetails(String Id);
}

