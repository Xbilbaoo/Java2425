package ud7.jarduera1.model;

public class Client {
	
	// ATTRIBUTES //
	
	private int clientID;
	private String name;
	private String surname;
	
	
	
	// CONSTRUCTORS //
	
	public Client() {
		
	}
	
	
	
	// GETTERS //
	
	public int getClientID() {
		
		return clientID;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String getSurname() {
		
		return surname;
		
	}
	
	
	
	// SETTERS //
	
	public void setClientID(int clientID) {
		
		this.clientID = clientID;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setSurname(String surname) {
		
		this.surname = surname;
		
	}
	
}
