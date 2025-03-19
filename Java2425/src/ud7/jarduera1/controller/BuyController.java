package ud7.jarduera1.controller;

import ud7.jarduera1.model.ddbb.BuyConnect;
import ud7.jarduera1.view.StoreView;

public class BuyController {
	
	// ATTRIBUTES //
	
	private BuyConnect con;
	private StoreView view;
	
	
	
	// CONSTRUCTORS //
	
	public BuyController() {
		
	}
	
	public BuyController(BuyConnect con, StoreView view) {
		
		this.con = con;
		this.view = view;
		
	}

	
	
	// GETTERS //
	
	public BuyConnect getCon() {
		return con;
	}

	public StoreView getView() {
		return view;
	}

	
	
	// SETTERS //
	
	public void setCon(BuyConnect con) {
		this.con = con;
	}

	public void setView(StoreView view) {
		this.view = view;
	}
	
	
	
}
