package hometown.com.api.models;

import org.springframework.data.annotation.Id;

public class SocialMediaGroups {

	public SocialMediaGroups() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public String id;
	
	public String name;
	public String link;
	public String photo;
	public String game;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
}
