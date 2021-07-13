package in.yourproject.stock;
import java.time.LocalDate;
public class Stockdetailtest {

	public static void main(String[] args) {
		LocalDate OrderedDate1=LocalDate.parse("2021-04-28");
		stockdetail stock1=new stockdetail(12346,"Britannia Inds",OrderedDate1,140);
		System.out.println(stock1.toString()); 
		
		LocalDate OrderedDate2=LocalDate.parse("2021-07-12");
		stockdetail stock2=new stockdetail(12347,"Wipro",OrderedDate2,340);
		System.out.println(stock2.toString()); 
	
		LocalDate OrderedDate3=LocalDate.parse("2021-06-10");
		stockdetail stock3=new stockdetail(12348,"Trends",OrderedDate3,358);
		System.out.println(stock3.toString()); 

		LocalDate OrderedDate4=LocalDate.parse("2021-06-05");
		stockdetail stock4=new stockdetail(12349,"Nippon",OrderedDate4,180);
		System.out.println(stock4.toString()); 

}
}