package Task3;
// creating a class employee
public class Employee implements Taxable{
	
	int EmployeeId;
	String name;
	float salary;
	
// creating a parameterized constructor
	public Employee(int employeeId, String name, float salary) {
		super();
		EmployeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

// implementing the abstract method to calculate incomeTax
	@Override
	public void calcTax() {
		float calcTax = (incomeTax * salary) / 100;
		System.out.println("The IncomeTax of the employee is : " + calcTax);
	}
}
