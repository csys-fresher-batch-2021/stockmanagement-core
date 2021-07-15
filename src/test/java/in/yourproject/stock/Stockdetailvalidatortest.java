package in.yourproject.stock;
import java.time.LocalDate;
public class Stockdetailvalidatortest {

	public static void main(String[] args) {
		
			
				test1();
		}

	private static void test1() {
		LocalDate 	OrderedDate1 = LocalDate.parse("2021-04-28");
		stockdetail stockdetail= new stockdetail(12346,"Britannia Inds",OrderedDate1,140);

try {
		Stockdetailvalidator.validator(stockdetail);
		System.out.println("Validation Success");
} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
}
//test2();
	}

	private static void test2() {
		LocalDate 	OrderedDate2 = LocalDate.parse("2021-07-12");
		stockdetail stockdetail= new stockdetail(12347,"",OrderedDate2,340);
		
		try {
		Stockdetailvalidator.validator(stockdetail);
		System.out.println("Validation Success");
		} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
		}
	}

	}


