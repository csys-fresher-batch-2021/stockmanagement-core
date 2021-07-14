package com.saran.validator;

import java.time.LocalDate;

import com.saran.model.Export;

public class ExportValidatorTest {
	
	public static void testcase1() {
		LocalDate Exportdate1 = LocalDate.parse("2021-06-12");
	    Export export= new Export(12346, 1267, Exportdate1, "Pondicherry", 34890);
	
	try {
		ExportValidator.validator(export);
		System.out.println("Validation Success");
	} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
	}
}
	
	public static void testcase2() {
		
		LocalDate Exportdate2 = LocalDate.parse("2021-06-07");	
	    Export export = new Export(0, 0, Exportdate2, "Chennai", 15870);
		
	try {
		ExportValidator.validator(export);
		System.out.println("Validation Success");
	} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
	}
	}
	public static void testcase3() {
		LocalDate Exportdate3 = LocalDate.parse("2021-06-07");	
	    Export export = new Export(12348, 3648 , Exportdate3 , "", 15090);
	    try {
			ExportValidator.validator(export);
			System.out.println("Validation Success");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Validation Failed:" + errorMessage);			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	//testcase1(); //valid productid,exportid,ExportDestination
	testcase2(); // invalid productid,exportid and valid ExportDestination
	testcase3(); // valid productid,exportid and invalid ExportDestination
}
}
