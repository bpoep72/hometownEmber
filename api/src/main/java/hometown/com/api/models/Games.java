package hometown.com.api.models;

import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

public class Games {

	public Games() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public ObjectId _id;
	
	public String title;
	public String description;
	
	public ObjectId[] events;
	public ObjectId[] formats;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ObjectId[] getEvents() {
		return events;
	}
	public void setEvents(ObjectId[] events) {
		this.events = events;
	}
	public ObjectId[] getFormats() {
		return formats;
	}
	public void setFormats(ObjectId[] formats) {
		this.formats = formats;
	}

}
