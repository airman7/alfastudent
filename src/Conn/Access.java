package Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Product;

public class Access
{
	//productService/products/
	public ArrayList<Product> getProducts(Connection con) throws SQLException {
		ArrayList<Product> productList = new ArrayList<Product>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM products");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Product productObj = new Product();
				productObj.setPid(rs.getInt("pid"));
				productObj.setPname(rs.getString("pname"));
				productObj.setPstock(rs.getInt("pstock"));
				productObj.setPrice(rs.getInt("price"));
				productObj.setVid(rs.getInt("vid"));
				productObj.setCatid(rs.getInt("catid"));
				productList.add(productObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	//productService/trending
	public ArrayList<Product> getTrending(Connection con) throws SQLException {
		ArrayList<Product> productList = new ArrayList<Product>();
		PreparedStatement stmt = con.prepareStatement("SELECT pid, pname, price FROM products where pid in("
				+ "Select pid from offers where sell_count>0 order by sell_count desc) ");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Product productObj = new Product();
				productObj.setPid(rs.getInt("pid"));
				productObj.setPname(rs.getString("pname"));
				productObj.setPrice(rs.getInt("price"));
				productList.add(productObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	//productService/discounts
	public ArrayList<Product> getDiscounted(Connection con) throws SQLException {
		ArrayList<Product> productList = new ArrayList<Product>();
		PreparedStatement stmt = con.prepareStatement("SELECT pid, pname, price FROM products where pid in("
				+ "Select pid from offers order by discount desc) ");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Product productObj = new Product();
				productObj.setPid(rs.getInt("pid"));
				productObj.setPname(rs.getString("pname"));
				productObj.setPrice(rs.getInt("price"));
				productList.add(productObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	//productService/product/{id}
	public ArrayList<Product> getProductById(Connection con, int id) throws SQLException {
		ArrayList<Product> productList = new ArrayList<Product>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM products WHERE pid = "+id);
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Product productObj = new Product();
				productObj.setPid(rs.getInt("pid"));
				productObj.setPname(rs.getString("pname"));
				productObj.setPstock(rs.getInt("pstock"));
				productObj.setPrice(rs.getInt("price"));
				productObj.setVid(rs.getInt("vid"));
				productObj.setCatid(rs.getInt("catid"));
				productList.add(productObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	//productService/product/cat/{id}
	public ArrayList<Product> getProductsByCat(Connection con, int catid) throws SQLException {
		ArrayList<Product> productList = new ArrayList<Product>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM products WHERE catid = "+catid);
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Product productObj = new Product();
				productObj.setPid(rs.getInt("pid"));
				productObj.setPname(rs.getString("pname"));
				productObj.setPstock(rs.getInt("pstock"));
				productObj.setPrice(rs.getInt("price"));
				productObj.setVid(rs.getInt("vid"));
				productObj.setCatid(rs.getInt("catid"));
				productList.add(productObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	//productService/product/pname/{name}
	public ArrayList<Product> getProductByName(Connection con, String name) throws SQLException {
		ArrayList<Product> productList = new ArrayList<Product>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM products cross join vendors cross join categories WHERE pname = "+name+" or vname = "+name+" or catname = "+name);
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Product productObj = new Product();
				productObj.setPid(rs.getInt("pid"));
				productObj.setPname(rs.getString("pname"));
				productObj.setPstock(rs.getInt("pstock"));
				productObj.setPrice(rs.getInt("price"));
				productObj.setVid(rs.getInt("vid"));
				productObj.setCatid(rs.getInt("catid"));
				productList.add(productObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	//productService/product/vendor/{id}
	public ArrayList<Product> getProductsByVendor(Connection con, int vid) throws SQLException {
		ArrayList<Product> productList = new ArrayList<Product>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM products WHERE vid = "+vid);
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Product productObj = new Product();
				productObj.setPid(rs.getInt("pid"));
				productObj.setPname(rs.getString("pname"));
				productObj.setPstock(rs.getInt("pstock"));
				productObj.setPrice(rs.getInt("price"));
				productObj.setVid(rs.getInt("vid"));
				productObj.setCatid(rs.getInt("catid"));
				productList.add(productObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

}