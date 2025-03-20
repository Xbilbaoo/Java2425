package ud7.jarduera1.controller;

import ud7.jarduera1.model.ddbb.ClientConnect;
import ud7.jarduera1.view.StoreView;

public class ClientController {
	
	private ClientConnect con;
	private StoreView view;
	
	public ClientController() {
	
	}

	public ClientController(ClientConnect con, StoreView view) {
		
		this.con = con;
		this.view = view;
		
	}

	public void setCon(ClientConnect con) {
		this.con = con;
	}

	public void setView(StoreView view) {
		this.view = view;
	}
	
	
	
	
}
