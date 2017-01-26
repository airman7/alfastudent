package Controller;

import java.sql.Connection;
import java.util.ArrayList;

import Conn.Access;
import Conn.Connect;
import entities.Product;

public class AccessManager {
	Connect db;
	Connection con;
	Access access;
	
	public AccessManager() throws Exception {
		db = new Connect();
		con = db.getConnection();
		access = new Access();
	}
	
	public ArrayList<Product> getProducts() throws Exception {
		ArrayList<Product> productList = new ArrayList<Product>();
		productList = access.getProducts(con);
		return productList;
	}
	public ArrayList<Product> getProductById(int id) throws Exception {
		ArrayList<Product> productList = new ArrayList<Product>();
		productList = access.getProductById(con,id);
		return productList;
	}
	public ArrayList<Product> getProductsByCat(int catid) throws Exception {
		ArrayList<Product> productList = new ArrayList<Product>();
		productList = access.getProductsByCat(con,catid);
		return productList;
	}
	public ArrayList<Product> getProductsByVendor(int vid) throws Exception {
		ArrayList<Product> productList = new ArrayList<Product>();
		productList = access.getProductsByCat(con,vid);
		return productList;
	}
}