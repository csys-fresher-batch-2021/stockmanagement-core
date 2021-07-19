package com.saran.model;
import java.time.LocalDate;
public class ExportTest {

	public static void main(String[] args) {
		LocalDate Export_date1 = LocalDate.parse("2021-06-12");
		Export_Details Export1= new Export_Details (12346, 1267, Export_date1, "Pondicherry", 34890);
		System.out.println(Export1.toString());
		
		LocalDate Export_date2 = LocalDate.parse("2021-06-07");
		Export_Details Export2= new Export_Details (12347, 3645, Export_date2, "Chennai", 15870);
		System.out.println(Export2.toString());
		
		LocalDate Export_date3 = LocalDate.parse("2021-06-09");
		Export_Details Export3= new Export_Details (12348, 3648 , Export_date3 , "Chennai", 15090);
		System.out.println(Export3.toString());
	}
}