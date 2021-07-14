package com.venkat.model;
import java.time.LocalDate;
public class ProductDetails {

	public int productid;
	public String productname;
	public int productcost;
	
	public ProductDetails() {
		System.out.println("default constructor");
	}


	


/**
 * @param productid
 * @param productname
 * @param productcost
 */
public ProductDetails(int productid, String productname, int productcost) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.productcost = productcost;
}





@Override
public String toString() {
	return "ProductDetails [productid=" + productid + ", productname=" + productname + ", productcost=" + productcost
			+ "]";
}

	}

