package ud6.jarduera3.model;

public class Client {

	
	// ATRIBUTTES //
	
	private String id;
	private String name;
	private String dir;
	private String codPostal;
	private String tlf;
	
	
	
	// CONSTRUCTORS //
	
	public Client() {
		
	}
	
	public Client(String id, String name, String dir, String codPostal, String tlf) {
		
		this.id = id;
		this.name = name;
		this.dir = dir;
		this.codPostal = codPostal;
		this.tlf = tlf;
		
	}
	
	
	
	// GETTERS //

	public String getId() {
		
		return id;
		
	}

	public String getName() {
		
		return name;
		
	}

	public String getDir() {
		
		return dir;
		
	}

	public String getCodPostal() {
		
		return codPostal;
		
	}

	public String getTlf() {
		
		return tlf;
		
	}
	
	
	
	// SETTERS //
	
	public void setId(String id) {
		
		this.id = id;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public void setDir(String dir) {
		
		this.dir = dir;
		
	}

	public void setCodPostal(String codPostal) {
		
		this.codPostal = codPostal;
		
	}

	public void setTlf(String tlf) {
		
		this.tlf = tlf;
		
	}
	
	
	
	// TO STRING //
	
	@Override
	public String toString() {
		
		return "Client [id=" + id + ", name=" + name + ", dir=" + dir + ", codPostal=" + codPostal + ", tlf=" + tlf
				+ "]";
		
	}
	
	
}
