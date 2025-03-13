package ud7.jarduera1.model;

public class Buy {
	
	// ATTRIBUTES //
	
	private int buyID;
	private int clientID;
	private int productID;
	
	
	
	// CONSTRUCTORS //
	
	public Buy() {
		
	}



	// GETTERS //
	
	public int getBuyID() {
		
		return buyID;
		
	}
	
	public int getClientID() {
		
		return clientID;
		
	}
	
	public int getProductID() {
		
		return productID;
		
	}
	
	
	
	// SETTERS //
	
	public void setBuyID(int buyID) {
		
		this.buyID = buyID;
		
	}
	
	public void setClientID(int clientID) {
		
		this.clientID = clientID;
		
	}

	public void setProductID(int productID) {
		
		this.productID = productID;
		
	}

}
