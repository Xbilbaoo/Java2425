package ud7.jarduera1.model;

public class Product {

	// ATTRIBUTES //
	
	private int productID;
	private String name;
	private int price;
	private int stock;
	
	
	
	// CONSTRUCTORS //
	
	public Product() {
		
	}



	// GETTERS //
	
	public int getProductID() {
		
		return productID;
		
	}



	public String getName() {
		
		return name;
		
	}
	
	public int getPrice() {
		
		return price;
		
	}
	
	public int getStock() {
		
		return stock;
		
	}
	
	
	
	// SETTERS //
	
	public void setProductID(int productID) {
		
		this.productID = productID;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setPrice(int price) {
		
		this.price = price;
		
	}
	
	public void setStock(int stock) {
		
		this.stock = stock;
		
	}
	
}
