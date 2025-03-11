package UD4.jarduera10.models;

import java.util.Date;

public class Soldatapekoa extends Langilea {
	
	private float finalSalary;
	private int extraHours;
	
	public Soldatapekoa() {
		
		super();
		this.finalSalary = this.getBaseSalary();
		this.extraHours = 0;
		
	}

	public Soldatapekoa(int id, String name, Date birthdate, float baseSalary, float finalSalary, int extraHours) {
		
		super(id, name, birthdate, baseSalary);
		this.finalSalary = finalSalary;
		this.extraHours = extraHours;
		
	}

	
	
	public float getFinalSalary() {
		return finalSalary;
	}

	public int getExtraHours() {
		return extraHours;
	}

	
	
	public void setFinalSalary(float finalSalary) {
		this.finalSalary = finalSalary;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}

	
	
	@Override
	public String toString() {
		return "Soldatapekoa [finalSalary=" + finalSalary + ", extraHours=" + extraHours + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getBirthdate()=" + getBirthdate() + ", getBaseSalary()="
				+ getBaseSalary() + "]";
	}
	
	public void calculateFinalSalary(float payExtra) {
		
		float extraHoursPay = this.extraHours * payExtra;
		
		this.finalSalary = this.getBaseSalary() + extraHoursPay;
		
	}
	
	
}
