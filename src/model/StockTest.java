package stockmanagement;
import java.time.LocalDate;
public class StockTest {

	public static void main(String[] args) {
		LocalDate OrderedDate=LocalDate.parse("2021-07-12");
Stock Stock1=new Stock(12346,"Asian Paints",OrderedDate,100);
System.out.println(Stock1.toString() );
	}

}
