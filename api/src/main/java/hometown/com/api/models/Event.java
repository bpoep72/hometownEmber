package hometown.com.api.models;

import java.awt.Image;

import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

public class Event {
	
	public Event() {
		//TODO: add constructor
	}

	@Id
	public ObjectId _id;
	
	public String title;
	public boolean recurrent;
	public String startTime;
	public int duration;
	public int participants;
	public Image eventImage;
	public String description;
	
	
	/* AUTOGENERATED */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isRecurrent() {
		return recurrent;
	}
	public void setRecurrent(boolean recurrent) {
		this.recurrent = recurrent;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	public Image getEventImage() {
		return eventImage;
	}
	public void setEventImage(Image eventImage) {
		this.eventImage = eventImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
