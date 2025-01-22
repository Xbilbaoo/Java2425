package ud5.jarduera5_2.models;

public class Langilea {
	
	private int id;
	private String firstName;
	private String lastName;
	private String department;
	private float salario;
	
	// CONSTRUCTORS //
	
	public Langilea() {
		
	}
	
	public Langilea(int id, String firstName, String lastName, String department, float salario) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salario = salario;
		
	}
	
	// GETTERS //

	public int getId() {
		
		return id;
		
	}
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	
	public String getDepartment() {
		
		return department;
		
	}
	
	public float getSalario() {
		
		return salario;
		
	}
	
	// SETTERS //
	
	public void setId(int id) {
		
		this.id = id;
		
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}
	
	public void setDepartment(String department) {
		
		this.department = department;
		
	}
	
	public void setSalario(float salario) {
		
		this.salario = salario;
		
	}

	@Override
	public String toString() {
		return "Langilea [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", salario=" + salario + "]";
	}
	
	
	
}
