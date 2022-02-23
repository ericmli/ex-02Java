package entities;

public class Employee {

	public String Name;
	public double GrossSalary;
	public double Tax;

	
	public Double NetSalary() {
		
		return GrossSalary - Tax;
		
	}
	
	public void IncreaseSalary(double percentage) {
		
		GrossSalary += GrossSalary * percentage / 100.0;
		
	}
}
