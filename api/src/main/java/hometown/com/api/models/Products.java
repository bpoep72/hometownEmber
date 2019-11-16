package hometown.com.api.models;

import java.awt.Image;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Products {

	public Products() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	public ObjectId id;
	
	public String name;
	public String manufacture;
	public String description;
	public float pricePerUnit;
	public float pricePerItem;
	public int units;
	
	public String material;
	public String color;
	public String edition;
	public String releaseDate;
	public Image picture;
	public String size;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(float pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public float getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(float pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Image getPicture() {
		return picture;
	}
	public void setPicture(Image picture) {
		this.picture = picture;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}	

}
