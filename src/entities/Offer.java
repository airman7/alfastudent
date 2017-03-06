package entities;

public class Offer {
	public Offer() {
	}
	
	public Offer(int pid, int vid, int price, int discount, int sell_count) {
		super();
		this.pid = pid;
		this.vid = vid;
		this.price = price;
		this.discount = discount;
		this.sell_count = sell_count;
	}
	private int pid;
	private int vid;
	private int price;
	private int discount;
	private int sell_count;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getSell_count() {
		return sell_count;
	}
	public void setSell_count(int sell_count) {
		this.sell_count = sell_count;
	}
}

