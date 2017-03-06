package entities;

public class StationaryDescription {
	int did;
	String brand;
	String type;
	String color;
	int pack_of;
	
	public StationaryDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StationaryDescription(int did, String brand, String type, String color, int pack_of) {
		super();
		this.did = did;
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.pack_of = pack_of;
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
	public int getPack_of() {
		return pack_of;
	}
	public void setPack_of(int pack_of) {
		this.pack_of = pack_of;
	}
}