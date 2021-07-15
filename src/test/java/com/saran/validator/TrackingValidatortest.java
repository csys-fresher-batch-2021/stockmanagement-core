package com.saran.validator;

import java.time.LocalDate;

import com.saran.model.Tracking;

public class TrackingValidatortest {
	
/**
 * developed by saran
 */
	public static void testcase1() {
		LocalDate Deliverydate1 = LocalDate.parse("2021-06-10");
	    Tracking Track= new Tracking(12346, "Britannia Inds", 54378, Deliverydate1, "Raj", 6345789231L);
	
	try {
		TrackingValidator.validator(Track);
		System.out.println("Validation Success");
	} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
	}
}
	
	public static void testcase2() {
		
		LocalDate Deliverydate2 = LocalDate.parse("2021-06-10");	
	   Tracking Track = new Tracking(0, "Wipro", 0,Deliverydate2, "Prasad", 9867543290L);
		
	try {
		TrackingValidator.validator(Track);
		System.out.println("Validation Success");
	} catch (Exception e) {
		String errorMessage = e.getMessage();
		System.out.println("Validation Failed:" + errorMessage);
		e.printStackTrace();
	}
	}
	public static void testcase3() {
		LocalDate Deliverydate1 = LocalDate.parse("2021-06-10");	
	    Tracking Track = new Tracking(12346, "", 54378, Deliverydate1, "Raj", 6345789231L);
	    try {
			TrackingValidator.validator(Track);
			System.out.println("Validation Success");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Validation Failed:" + errorMessage);			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	testcase1(); //valid productid,trackingid,productname
	//testcase2(); // invalid productid,trackingid and valid productname
	//testcase3(); // valid productid,trackingid and invalid productname
}
}