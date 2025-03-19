package ud7.jarduera1.controller;

import ud7.jarduera1.model.ddbb.ProductConnect;
import ud7.jarduera1.view.StoreView;

public class ProductController {

	private ProductConnect con;
	private StoreView view;

	public ProductController(ProductConnect con, StoreView view) {

		this.con = con;
		this.view = view;

	}

	public void addProduct(int id, String name, int price) {

		con.createProduct(id, name, price);
		
	}
}
