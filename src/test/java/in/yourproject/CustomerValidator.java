package in.yourproject;

public class CustomerValidator {

	public static void validator(Customers customer) throws Exception{
		
		if (customer.CustomerId <= 0) {
			throw new Exception ("Invalid CustomerId");
		}
		else if (customer.CustomerName == null || customer.CustomerName.trim().equals("")) {
			throw new Exception ("Invalid Customer Name");
		
		}
	}
}