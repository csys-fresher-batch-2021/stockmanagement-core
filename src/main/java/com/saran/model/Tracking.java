package com.saran.model;
import java.time.LocalDate;

public class Tracking {
public int productid;
public String productname;
public int trackingid;
public LocalDate Deliverydate;
public String Handlername;
public long PhoneNo;

public Tracking() {
	System.out.println("default constructor");
}



public Tracking(int productid, String productname, int trackingid, LocalDate deliverydate, String handlername,
		long phoneNo) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.trackingid = trackingid;
	Deliverydate = deliverydate;
	Handlername = handlername;
	PhoneNo = phoneNo;
}






@Override
public String toString() {
	return "Tracking [productid=" + productid + ", productname=" + productname + ", trackingid=" + trackingid
			+ ", Deliverydate=" + Deliverydate + ", Handlername=" + Handlername + ", PhoneNo=" + PhoneNo + "]";
}

}
