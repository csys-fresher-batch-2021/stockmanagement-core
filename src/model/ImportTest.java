package com.venkat.model;
import java.time.LocalDate;
public class ImportTest {

	public static void main(String[] args) {
		LocalDate ImportDate1=LocalDate.parse("2021-04-28");
		Import Import1=new Import(12346,02432,ImportDate1,"Coimbatore",34260);
		System.out.println(Import1.toString());
		LocalDate ImportDate2=LocalDate.parse("2021-04-30");
		Import Import2=new Import(12347,01005,ImportDate2,"Bangalore",32089);
		System.out.println(Import2.toString());
		LocalDate ImportDate3=LocalDate.parse("2021-06-05");
		Import Import3=new Import(12348,03120,ImportDate3,"Chennai",12830);
		System.out.println(Import3.toString());
		
		
	}

}
