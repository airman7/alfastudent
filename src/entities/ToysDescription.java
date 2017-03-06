package entities;

public class ToysDescription {
	int did;
	String type;
	String brand;
	String age;
	String includes;
	public ToysDescription(int did, String type, String brand, String age, String includes) {
		super();
		this.did = did;
		this.type = type;
		this.brand = brand;
		this.age = age;
		this.includes = includes;
	}
	public ToysDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getIncludes() {
		return includes;
	}
	public void setIncludes(String includes) {
		this.includes = includes;
	}
}
