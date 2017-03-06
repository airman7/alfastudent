package services;

import java.sql.Connection;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import Conn.Access;
import Conn.Connect;
import entities.Product;
import Conn.Access;
import Conn.Connect;


@Path("/productService")
public class ProductService {
	Connect db;
	Connection con;
	Access access;
	
	public ProductService() throws Exception {
		db = new Connect();
		con = db.getConnection();
		access = new Access();
	}
	
	@GET
	@Path("/products")
	@Produces("application/json")
	public String products() {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = access.getProducts(con);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@GET
	@Path("/product/{id}")
	@Produces("application/json")
	public String productById(@PathParam("id") int id) {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = access.getProductById(con,id);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	@GET
	@Path("/product/cat/{id}")
	@Produces("application/json")
	public String productsByCat(@PathParam("id") int id) {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = access.getProductsByCat(con,id);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	@GET
	@Path("/product/pname/{name}")
	@Produces("application/json")
	public String productsByName(@PathParam("name") String name) {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = access.getProductByName(con,name);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	@GET
	@Path("/product/vendor/{id}")
	@Produces("application/json")
	public String productsByVendor(@PathParam("id") int id) {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = access.getProductsByVendor(con,id);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	@GET
	@Path("/trending")
	@Produces("application/json")
	public String trending() {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = access.getTrending(con);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	@GET
	@Path("/discounts")
	@Produces("application/json")
	public String discounts() {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = access.getDiscounted(con);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
}
