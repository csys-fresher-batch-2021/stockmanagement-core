package com.saran.validator;

import java.time.LocalDate;
import com.saran.model.Export_Details;

public class Export_DetailsValidatorTest {
	
	public static void testcase1() {
		LocalDate Export_date1 = LocalDate.parse("2021-06-12");
	    Export_Details export= new Export_Details(12346, 1267, Export_date1, "Pondicherry", 34890);
	
	try {
		Export_DetailsValidator.validator(export);
		System.out.println("Validation Success");
	} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
	}
}
	
	public static void testcase2() {
		
		LocalDate Export_date2 = LocalDate.parse("2021-06-07");	
	    Export_Details export = new Export_Details(0, 0, Export_date2, "Chennai", 15870);
		
	try {
		Export_DetailsValidator.validator(export);
		System.out.println("Validation Success");
	} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
	}
	}
	public static void testcase3() {
		LocalDate Export_date3 = LocalDate.parse("2021-06-07");	
	    Export_Details export = new Export_Details(12348, 3648 , Export_date3 , "", 15090);
	    try {
			Export_DetailsValidator.validator(export);
			System.out.println("Validation Success");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Validation Failed:" + errorMessage);			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	//testcase1(); //valid product_id,export_id,Export_Destination
	testcase2(); // invalid product_id,export_id and valid Export_Destination
	//testcase3(); // valid product_id,export_id and invalid Export_Destination
}
}
