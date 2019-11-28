package br.com.blockone;

public class EmployeeTest {
	
	public static void main(String[] args) {
		/*************************** Employee One ***************************/
		Employee e1 = new Employee(1, "Mary", "Smith", 3000);
		
		System.out.println("Employeer = " + e1.getName());
		System.out.println("The salary of " + e1.getLastName() + " is equals to " + e1.getSalary());
		System.out.println("The annual salary of " + e1.getName() + " is " + e1.getAnnualSalary());
		System.out.println("The increase salary of " + e1.getName() + " is " + e1.raiseSalary(3));
		System.out.println("General data = " + e1.toString() + "\n");
		
		/*************************** Employee Two ***************************/ 
		Employee e2 = new Employee(2, "Charles", "Hill", 5000);
		
		System.out.println("Employeer = " + e2.getName());
		System.out.println("The salary of " + e2.getLastName() + " is equals to " + e2.getSalary());
		System.out.println("The annual salary of " + e2.getName() + " is " + e2.getAnnualSalary());
		System.out.println("The increase salary of " + e2.getName() + " is " + e2.raiseSalary(3));
		System.out.println("General data = " + e2.toString());

	}
}