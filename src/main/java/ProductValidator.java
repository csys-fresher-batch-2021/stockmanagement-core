package com.venkat.model;

public class ProductValidator {

	public static  void validator(ProductDetails Product)throws
	Exception{
		if(Product.productid <=0) {
			throw new Exception ("Invalid Productid");
			
		}
		
		else if (Product.productname == null || Product.productname.trim().equals("")) {
			throw new Exception("Invalid ProductName");
		}
	}

}
