package UD4.jarduera10.models;

import java.util.Date;

public class Langilea {
	
	private int id;
	private String name;
	private Date birthdate;
	private float baseSalary;
	
	
	
	public Langilea() {
		
	}



	public Langilea(int id, String name, Date birthdate, float baseSalary) {
		
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.baseSalary = baseSalary;
		
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public Date getBirthdate() {
		return birthdate;
	}



	public float getBaseSalary() {
		return baseSalary;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}



	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
	@Override
	public String toString() {
		return "Langilea [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", baseSalary=" + baseSalary
				+ "]";
	}
	
	
	
	
	
}
