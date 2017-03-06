package entities;

public class SportsDescription {
	int did;
	String game;
	String brand;
	String color;
	String material;
	String dimension;
	String includes;

	public SportsDescription(int did, String game, String brand, String color, String material, String dimension,
			String includes) {
		super();
		this.did = did;
		this.game = game;
		this.brand = brand;
		this.color = color;
		this.material = material;
		this.dimension = dimension;
		this.includes = includes;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getIncludes() {
		return includes;
	}

	public void setIncludes(String includes) {
		this.includes = includes;
	}

	public SportsDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
