package entities;

public class Product {
	private int pid;
	private String pname;
	private int pstock;
	private int price;
	private int vid;
	private int catid;

	public Product() {

	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPstock() {
		return pstock;
	}

	public void setPstock(int pstock) {
		this.pstock = pstock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public Product(int pid, String pname, int pstock, int price, int vid, int catid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstock = pstock;
		this.price = price;
		this.vid = vid;
		this.catid = catid;
	}
}
