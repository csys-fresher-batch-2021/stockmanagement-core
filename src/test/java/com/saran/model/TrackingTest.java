package com.saran.model;
import java.time.LocalDate;

public class TrackingTest {

	public static void main(String[] args) {
		
		LocalDate Deliverydate1= LocalDate.parse("2021-06-10");
		Tracking Tracking1 = new Tracking (12346, "Britannia Inds", 54378, Deliverydate1, "Raj", 6345789231L);
		System.out.println(Tracking1.toString());
		
		LocalDate Deliverydate2= LocalDate.parse("2021-06-10");
		Tracking Tracking2 = new Tracking (12347, "Wipro", 76548,Deliverydate2, "Prasad", 9867543290L);
		System.out.println(Tracking2.toString());
		
		
	}
}