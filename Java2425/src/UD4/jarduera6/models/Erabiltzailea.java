package UD4.jarduera6.models;

public class Erabiltzailea {
	
	private int id;
	private String firstName;
	private String secondName;
	private String username;
	private String password;
	private boolean active;
	
	
	
	public Erabiltzailea() {
		
	}

	public Erabiltzailea(int id, String firstName, String secondName, String username, String password,
			boolean active) {
		
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.username = username;
		this.password = password;
		this.active = active;
		
	}

	
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isActive() {
		return active;
	}

	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Erabiltzailea [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", username="
				+ username + ", password=" + password + ", active=" + active + "]";
	}
	
	public String saveData() {
		
		return id + ":" + firstName + ":" + secondName + ":" + username + ":" + active;
		
	}
}
