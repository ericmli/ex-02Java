package application;

import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee Emp = new Employee();
		
		System.out.println("Name: ");
		Emp.Name=sc.nextLine();
		
		System.out.println("Gross Salary: ");
		Emp.GrossSalary=sc.nextDouble();

		
		System.out.println("Tax: ");
		Emp.Tax=sc.nextDouble();
		
		System.out.printf("Employee: " + Emp.Name + ", $ %.2f\n" , Emp.NetSalary());
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		Emp.IncreaseSalary(percentage);
		
		
		System.out.printf("Update data: %s $%.2f" , Emp.Name, Emp.NetSalary());
		
		sc.close();
		
	}
}
