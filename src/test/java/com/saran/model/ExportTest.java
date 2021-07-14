package com.saran.model;
import java.time.LocalDate;
public class ExportTest {

	public static void main(String[] args) {
		LocalDate Exportdate1 = LocalDate.parse("2021-06-12");
		Export Export1= new Export (12346, 1267, Exportdate1, "Pondicherry", 34890);
		System.out.println(Export1.toString());
		
		LocalDate Exportdate2 = LocalDate.parse("2021-06-07");
		Export Export2= new Export (12347, 3645, Exportdate2, "Chennai", 15870);
		System.out.println(Export2.toString());
		
		LocalDate Exportdate3 = LocalDate.parse("2021-06-09");
		Export Export3= new Export (12348, 3648 , Exportdate3 , "Chennai", 15090);
		System.out.println(Export3.toString());
	}
}