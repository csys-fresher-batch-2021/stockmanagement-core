package in.yourproject;

public class SupplierValidatorTest {

	public static void main(String[] args) {
		Test1();
	}
		public static void Test1() {
			Suppliers Supplier = new Suppliers(12345, 001, "Venkat", "SAP", "Chennai", "Ambattur", "venkat@gmail.com", 8220312450L);
			try
			{
				SupplierValidator.validator(Supplier);
				System.out.println("Validation Success");
			}
			catch (Exception e) {
				String errorMessage = e.getMessage();
				System.out.println("Validation Failed:"+errorMessage);
				e.printStackTrace();
			}
		}
	
	}


