package Task3;
// creating a class class that implements taxable
public class Product implements Taxable{
	// creating attributes
	int pId;
	float price;
	int quantity;
	public Product(int pId, float price, int quantity) {
		super();
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;
	}
	// implementing abstract method to calculate salesTax
	@Override
	public void calcTax() {
		 float calTax=(salesTax*price)/100;
		 System.out.println("Sales Tax For The Product is : "+calTax);
		
	}
	
	
	

}
