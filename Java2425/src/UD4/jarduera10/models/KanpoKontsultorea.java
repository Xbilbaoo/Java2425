package UD4.jarduera10.models;

import java.util.Date;

public class KanpoKontsultorea extends Langilea {

	private int hours;
	private float finalSalary;
	
	
	
	public KanpoKontsultorea() {
		
		super();
		super.setBaseSalary(0);
		this.hours = 0;
		this.finalSalary = this.getBaseSalary();
		
	}
	
	public KanpoKontsultorea(int id, String name, Date birthdate, float baseSalary, int hours, float finalSalary) {
		
		super(id, name, birthdate, baseSalary);
		super.setBaseSalary(0);
		this.hours = 0;
		this.finalSalary = baseSalary;
		
	}

	
	
	public int getHours() {
		return hours;
	}

	public float getFinalSalary() {
		return finalSalary;
	}

	
	
	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setFinalSalary(float finalSalary) {
		this.finalSalary = finalSalary;
	}
	
	public void calculateFinalSalary(float payAmount) {
		
		this.finalSalary = this.hours * payAmount;
		
	}
}
