package in.yourproject;
import in.yourproject.Customers;

public class CustomersTest {

	public static void main(String[] args) {
	Customers Customers1 = new Customers (12345, 201, "Arun", "TrichY", "Asian Paints", 54362, 151);
	System.out.println(Customers1.toString());
	
	Customers Customers2 = new Customers (12346, 202, "Avinash", "Chennai", "Britannia Inds", 63540, 100);
	System.out.println(Customers2.toString());
	
	Customers Customers3 = new Customers (12347, 203, "Manoj", "Kanniyakumari", "Wipro", 73645, 250);
	System.out.println(Customers3.toString());
	
	Customers Customers4 = new Customers (12348, 204, "Raja", "Pondicherry", "Trends", 45637, 190);
	System.out.println(Customers4.toString());
	
	Customers Customers5 = new Customers (12349, 205, "Chandru", "Villupuram", "Nippon", 76453, 176);
	System.out.println(Customers5.toString());

	}

}
