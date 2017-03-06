package services;
import java.sql.Connection;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import Conn.Connect;
import entities.BagDescription;
import entities.BookDescription;
import entities.FurnitureDescription;
import entities.ToysDescription;
import entities.StationaryDescription;
import entities.SportsDescription;

import Conn.AccessProductDescription;
import Conn.Connect;

@Path("/descriptionService")
public class ProductDescriptionService {
	Connect db;
	Connection con;
	AccessProductDescription access;
	
	public ProductDescriptionService() throws Exception {
		db = new Connect();
		con = db.getConnection();
		access = new AccessProductDescription();
	}
	
	@GET
	@Path("/book_desc/{pid}")
	@Produces("application/json")
	public String book_desc(@PathParam("pid") int pid) {
		String desc = null;
		ArrayList<BookDescription> bList = new ArrayList<BookDescription>();
		try {
			bList = access.getBookDescription(con, pid);
			Gson gson = new Gson();
			desc = gson.toJson(bList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desc;
	}
	
	@GET
	@Path("/bag_desc/{pid}")
	@Produces("application/json")
	public String bag_desc(@PathParam("pid") int pid) {
		String desc = null;
		ArrayList<BagDescription> bList = new ArrayList<BagDescription>();
		try {
			bList = access.getBagDescription(con, pid);
			Gson gson = new Gson();
			desc = gson.toJson(bList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desc;
	}
	
	@GET
	@Path("/stationary_desc/{pid}")
	@Produces("application/json")
	public String stationary_desc(@PathParam("pid") int pid) {
		String desc = null;
		ArrayList<StationaryDescription> bList = new ArrayList<StationaryDescription>();
		try {
			bList = access.getStationeryDescription(con, pid);
			Gson gson = new Gson();
			desc = gson.toJson(bList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desc;
	}
	
	@GET
	@Path("/furniture_desc/{pid}")
	@Produces("application/json")
	public String furniture_desc(@PathParam("pid") int pid) {
		String desc = null;
		ArrayList<FurnitureDescription> bList = new ArrayList<FurnitureDescription>();
		try {
			bList = access.getFurnitureDescription(con, pid);
			Gson gson = new Gson();
			desc = gson.toJson(bList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desc;
	}
	
	@GET
	@Path("/sports_desc/{pid}")
	@Produces("application/json")
	public String sports_desc(@PathParam("pid") int pid) {
		String desc = null;
		ArrayList<SportsDescription> bList = new ArrayList<SportsDescription>();
		try {
			bList = access.getSportsDescription(con, pid);
			Gson gson = new Gson();
			desc = gson.toJson(bList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desc;
	}
	
	@GET
	@Path("/toys_desc/{pid}")
	@Produces("application/json")
	public String toys_desc(@PathParam("pid") int pid) {
		String desc = null;
		ArrayList<ToysDescription> bList = new ArrayList<ToysDescription>();
		try {
			bList = access.getToysDescription(con, pid);
			Gson gson = new Gson();
			desc = gson.toJson(bList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desc;
	}
}
