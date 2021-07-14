package com.venkat.model;

public class ProductDetailsTest {

	public static void main(String[] args) {
		ProductDetails ProductDetails1=new ProductDetails(12346,"Britannia Inds",243200);
		System.out.println(ProductDetails1.toString());
		ProductDetails ProductDetails2=new ProductDetails(12347,"Wipro",543200);
		System.out.println(ProductDetails2.toString());
		ProductDetails ProductDetails3=new ProductDetails(12348,"Trends",376670);
		System.out.println(ProductDetails3.toString());
	}

}
