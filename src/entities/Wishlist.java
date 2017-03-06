package entities;

public class Wishlist {
	int uid;
	int pid;
	String dateOrder;
	
	public Wishlist(int uid, int pid, String dateOrder)
	{
		super();
		this.uid = uid;
		this.pid = pid;
		this.dateOrder = dateOrder;
	}
	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getdateOrder() {
		return dateOrder;
	}
	public void setdateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}
}
