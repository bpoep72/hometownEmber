package hometown.com.api.models;

import org.springframework.data.annotation.Id;

public class Games {

	public Games() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public String id;
	
	public String title;
	public String description;
	
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

}
