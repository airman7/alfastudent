package entities;

public class FurnitureDescription {
	int did;
	String brand;
	String type;
	String color;
	String material;
	String dimension;
	String details;

	public FurnitureDescription(int did, String brand, String type, String color, String material, String dimension,
			String details) {
		super();
		this.did = did;
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.material = material;
		this.dimension = dimension;
		this.details = details;
	}
	public FurnitureDescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
