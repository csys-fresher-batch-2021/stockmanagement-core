package in.yourproject;

public class CustomerValidatorTest {

	public static void main(String[] args) {
		public static void Test1() {
			Customers Customer = new Customers(12345, 001, "Venkat", "SAP", "Chennai", "Ambattur", "venkat@gmail.com", 8220312450L);
			try
			{
				CustomersValidator.validator(Customer);
				System.out.println("Validation Success");
			}
			catch (Exception e) {
				String errorMessage = e.getMessage();
				System.out.println("Validation Failed:"+errorMessage);
				e.printStackTrace();
			}
		}
	
	}

}