package ud7.jarduera1;

import ud7.jarduera1.controller.BuyController;
import ud7.jarduera1.controller.ClientController;
import ud7.jarduera1.controller.ProductController;
import ud7.jarduera1.model.ddbb.BuyConnect;
import ud7.jarduera1.model.ddbb.ClientConnect;
import ud7.jarduera1.model.ddbb.ProductConnect;
import ud7.jarduera1.view.StoreView;

public class Main {

	public static void main(String[] args) {
		
		ProductController pctrl = new ProductController();
		BuyController bctrl = new BuyController();
		ClientController cctrl = new ClientController();
		
		ProductConnect pcon = new ProductConnect();
		BuyConnect bcon = new BuyConnect();
		ClientConnect ccon = new ClientConnect();
		
		StoreView view = new StoreView();
		
		pctrl.setCon(pcon);
		pctrl.setView(view);
		
		bctrl.setCon(bcon);
		bctrl.setView(view);
		
		cctrl.setCon(ccon);
		cctrl.setView(view);
		
		view.setPctrl(pctrl);
		view.setBctrl(bctrl);
		view.setCctrl(cctrl);
		
		view.insertData();
		view.setVisible(true);
		
	}

}
