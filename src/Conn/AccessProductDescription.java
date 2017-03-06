package Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.BagDescription;
import entities.BookDescription;
import entities.FurnitureDescription;
import entities.ToysDescription;
import entities.StationaryDescription;
import entities.SportsDescription;

public class AccessProductDescription {
	
	PreparedStatement stmt;
	ResultSet rs;
	
	public ArrayList<BookDescription> getBookDescription(Connection con,int pid) throws SQLException {
		stmt = con.prepareStatement("SELECT catid FROM products where pid ="+pid);
		rs = stmt.executeQuery();
		int catid= rs.getInt("catid");
		ArrayList<BookDescription> List = new ArrayList<BookDescription>();
		stmt = con.prepareStatement("SELECT * FROM Book_Desc where did ="+catid);
		rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				BookDescription Obj = new BookDescription();
				Obj.setDid(rs.getInt("did"));
				Obj.setClass1(rs.getString("class"));
				Obj.setBoard(rs.getString("board"));
				Obj.setAuthor(rs.getString("author"));
				Obj.setPublications(rs.getString("publications"));
				Obj.setSubject(rs.getString("subject"));
				Obj.setLanguage(rs.getString("language"));
				Obj.setPages(rs.getInt("pages"));
				Obj.setEdition(rs.getString("edition"));
				Obj.setPublishing_year(rs.getInt("publishing_year"));
				Obj.setBinding(rs.getString("binding"));
				Obj.setDetails(rs.getString("details"));
				List.add(Obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return List;
	}
		
	public ArrayList<BagDescription> getBagDescription(Connection con,int pid) throws SQLException {
		stmt = con.prepareStatement("SELECT catid FROM products where pid ="+pid);
		rs = stmt.executeQuery();
		int catid= rs.getInt("catid");
		ArrayList<BagDescription> bList = new ArrayList<BagDescription>();
		stmt = con.prepareStatement("SELECT * FROM Bag_Desc where did ="+catid);
		rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				BagDescription Obj = new BagDescription();
				Obj.setDid(rs.getInt("did"));
				Obj.setBrand(rs.getString("brand"));
				Obj.setType(rs.getString("type"));
				Obj.setColor(rs.getString("color"));
				Obj.setMaterial(rs.getString("material"));
				Obj.setCharacter(rs.getString("character"));
				Obj.setDimension(rs.getString("dimension"));
				Obj.setDetails(rs.getString("details"));
				bList.add(Obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
	}
	
	public ArrayList<StationaryDescription> getStationeryDescription(Connection con,int pid) throws SQLException {
		stmt = con.prepareStatement("SELECT catid FROM products where pid ="+pid);
		rs = stmt.executeQuery();
		int catid= rs.getInt("catid");
		ArrayList<StationaryDescription> sList = new ArrayList<StationaryDescription>();
		stmt = con.prepareStatement("SELECT * FROM Stationery_Desc where did ="+catid);
		rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				StationaryDescription Obj = new StationaryDescription();
				Obj.setDid(rs.getInt("did"));
				Obj.setBrand(rs.getString("brand"));
				Obj.setType(rs.getString("type"));
				Obj.setColor(rs.getString("color"));
				Obj.setPack_of(rs.getInt("pack_of"));
				sList.add(Obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sList;
	}
	
	public ArrayList<FurnitureDescription> getFurnitureDescription(Connection con,int pid) throws SQLException {
		stmt = con.prepareStatement("SELECT catid FROM products where pid ="+pid);
		rs = stmt.executeQuery();
		int catid= rs.getInt("catid");
		ArrayList<FurnitureDescription> fList = new ArrayList<FurnitureDescription>();
		stmt = con.prepareStatement("SELECT * FROM Furniture_Desc where did ="+catid);
		rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				FurnitureDescription Obj = new FurnitureDescription();
				Obj.setDid(rs.getInt("did"));
				Obj.setBrand(rs.getString("brand"));
				Obj.setType(rs.getString("type"));
				Obj.setColor(rs.getString("color"));
				Obj.setMaterial(rs.getString("material"));
				Obj.setDimension(rs.getString("dimension"));
				Obj.setDetails(rs.getString("details"));
				fList.add(Obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fList;
	}
	
	public ArrayList<SportsDescription> getSportsDescription(Connection con,int pid) throws SQLException {
		stmt = con.prepareStatement("SELECT catid FROM products where pid ="+pid);
		rs = stmt.executeQuery();
		int catid= rs.getInt("catid");
		ArrayList<SportsDescription> spList = new ArrayList<SportsDescription>();
		stmt = con.prepareStatement("SELECT * FROM Sports_Desc where did ="+catid);
		rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				SportsDescription Obj = new SportsDescription();
				Obj.setDid(rs.getInt("did"));
				Obj.setGame(rs.getString("game"));
				Obj.setBrand(rs.getString("brand"));
				Obj.setColor(rs.getString("color"));
				Obj.setMaterial(rs.getString("material"));
				Obj.setDimension(rs.getString("dimension"));
				Obj.setIncludes(rs.getString("includes"));
				spList.add(Obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return spList;
	}

	public ArrayList<ToysDescription> getToysDescription(Connection con,int pid) throws SQLException {
		stmt = con.prepareStatement("SELECT catid FROM products where pid ="+pid);
		rs = stmt.executeQuery();
		int catid= rs.getInt("catid");
		ArrayList<ToysDescription> spList = new ArrayList<ToysDescription>();
		stmt = con.prepareStatement("SELECT * FROM Toys_Desc where did ="+catid);
		rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				ToysDescription Obj = new ToysDescription();
				Obj.setDid(rs.getInt("did"));
				Obj.setType(rs.getString("type"));
				Obj.setBrand(rs.getString("brand"));
				Obj.setAge(rs.getString("age"));
				Obj.setIncludes(rs.getString("includes"));
				spList.add(Obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return spList;
	}
}
