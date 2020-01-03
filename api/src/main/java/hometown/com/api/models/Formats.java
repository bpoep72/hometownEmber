package hometown.com.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "formats")
public class Formats {

	public Formats() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public String id;
	
	public String name;
	public int minNumberOfCards;
	public int maxNumberOfCards;
	public String banList;
	public int maxCopies;
	public String description;
	public String officialPage;

	//relationships
	public String game;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinNumberOfCards() {
		return minNumberOfCards;
	}

	public void setMinNumberOfCards(int minNumberOfCards) {
		this.minNumberOfCards = minNumberOfCards;
	}

	public int getMaxNumberOfCards() {
		return maxNumberOfCards;
	}

	public void setMaxNumberOfCards(int maxNumberOfCards) {
		this.maxNumberOfCards = maxNumberOfCards;
	}

	public String getBanList() {
		return banList;
	}

	public void setBanList(String banList) {
		this.banList = banList;
	}

	public int getMaxCopies() {
		return maxCopies;
	}

	public void setMaxCopies(int maxCopies) {
		this.maxCopies = maxCopies;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOfficialPage() {
		return officialPage;
	}

	public void setOfficialPage(String officialPage) {
		this.officialPage = officialPage;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

}
