package ud7.jarduera1.controller;

import java.util.ArrayList;

import ud7.jarduera1.model.ddbb.ProductConnect;
import ud7.jarduera1.view.StoreView;

public class ProductController {

	private ProductConnect con;
	private StoreView view;

	public ProductController() {

	}

	public ProductController(ProductConnect con, StoreView view) {

		this.con = con;
		this.view = view;

	}

	// GETTERS //

	public ProductConnect getCon() {
		return con;
	}

	public StoreView getView() {
		return view;
	}

	// SETTER //

	public void setCon(ProductConnect con) {
		this.con = con;
	}

	public void setView(StoreView view) {
		this.view = view;
	}

	// METHODS //

	public void addProduct() {

		con.createProduct(Integer.parseInt(view.getTfProductID().getText()),
				view.getTfProductName().getText().toUpperCase(), Integer.parseInt(view.getTfProductPrice().getText()));

	}

	public void clearData() {

		view.getTfProductID().setText("");
		view.getTfProductName().setText("");
		view.getTfProductPrice().setText("");

	}

	public String[] getNames() {

		return con.getNames();

	}

}
