package hometown.com.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hours")
public class Hours {

	public Hours() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public String id;
	
	public String dayOfTheWeek;
	public String openingTime;
	public String closingTime;
	
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}
	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}
	public String getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}
	public String getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

}
