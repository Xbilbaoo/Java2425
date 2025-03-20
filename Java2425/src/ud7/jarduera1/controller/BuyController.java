package ud7.jarduera1.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ud7.jarduera1.model.ddbb.BuyConnect;
import ud7.jarduera1.view.StoreView;

public class BuyController {

	// ATTRIBUTES //

	private BuyConnect con;
	private static StoreView view;

	// CONSTRUCTORS //

	public BuyController() {

	}

	public BuyController(BuyConnect con, StoreView view) {

		this.con = con;
		BuyController.view = view;

	}

	// SETTERS //

	public void setCon(BuyConnect con) {
		this.con = con;
	}

	public void setView(StoreView view) {
		BuyController.view = view;
	}

	// METHODS //

	public void addBuy() {

		con.createBuy(Integer.parseInt(view.getTfClientID().getText()), view.getTfClientName().getText(),
				view.getComboBoxProducts().getSelectedItem().toString(),
				Integer.parseInt(view.getTfQuantity().getText()));
		
	}

	public String[] getIDs() {

		return con.getIDs();

	}
	
	public static void clearData() {
		
		view.getTfQuantity().setText(null);
		view.getTfClientID().setText("");
		view.getTfClientName().setText("");
	}

	public static void showClientError() {
		
		JOptionPane.showMessageDialog(view, "Bezeroaren datuak ez dira zuzenak!!", "", JOptionPane.WARNING_MESSAGE);
		
	}
}
