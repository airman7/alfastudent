package services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import entities.Product;
import Controller.AccessManager;

@Path("/productService")
public class ProductService {
	@GET
	@Path("/products")
	@Produces("application/json")
	public String products() {
		String products = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			productList = new AccessManager().getProducts();
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
			productList = new AccessManager().getProductById(id);
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
			productList = new AccessManager().getProductsByCat(id);
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
			productList = new AccessManager().getProductsByVendor(id);
			Gson gson = new Gson();
			products = gson.toJson(productList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
}
