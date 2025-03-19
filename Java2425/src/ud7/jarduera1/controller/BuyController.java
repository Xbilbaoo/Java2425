package ud7.jarduera1.controller;

import ud7.jarduera1.model.ddbb.BuyConnect;
import ud7.jarduera1.view.StoreView;

public class BuyController {
	
	private BuyConnect con;
	private StoreView view;
	
	public BuyController(BuyConnect con, StoreView view) {
		
		this.con = con;
		this.view = view;
		
	}
	
}
