package Task3;

import java.util.Scanner;
// creating a class main to implement main method
public class Main {
	public static void main(String[]args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Employee Details");
			System.out.println("=============================================");
			System.out.println("Enter EmployeeId");
			int empId = sc.nextInt();
			System.out.println("Enter Employee Name");
			String name = sc.next();
			System.out.println("Enter Employee Salary");
			float salary = sc.nextFloat();
			Taxable tax = new Employee(empId, name, salary);
			System.out.println(" ");
			tax.calcTax();
			System.out.println("=============================================");
			System.out.println("Enter Employee Details");
			System.out.println("=============================================");
			System.out.println("Enter PID");
			int pId = sc.nextInt();
			System.out.println("Enter Price");
			float price = sc.nextFloat();
			System.out.println("Enter Quantity");
			int quantity  =sc.nextInt();
			Taxable gst = new Product(pId,price,quantity);
			System.out.println(" ");
			gst.calcTax();
			System.out.println("=============================================");
		}
		}
	}
