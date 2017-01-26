package Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Product;

public class Access
{
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