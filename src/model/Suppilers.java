package com.venkat.model;

public class Suppilers {

	
		public int ProductId;
		public int SupplerId;
		public String SupplierName;
		public String SupplierCompany;
		public String SupplierCity;
		public String SupplierArea;
		public String SupplierEmail;
		public Long PhNo;

	   public Suppilers() {
		   System.out.println("default constructor");
			
		}
	

	

	/**
	 * @param productId
	 * @param supplerId
	 * @param supplierName
	 * @param supplierCompany
	 * @param supplierCity
	 * @param supplierArea
	 * @param supplierEmail
	 * @param phNo
	 */
	public Suppilers(int productId, int supplerId, String supplierName, String supplierCompany, String supplierCity,
			String supplierArea, String supplierEmail, Long phNo) {
		super();
		ProductId = productId;
		SupplerId = supplerId;
		SupplierName = supplierName;
		SupplierCompany = supplierCompany;
		SupplierCity = supplierCity;
		SupplierArea = supplierArea;
		SupplierEmail = supplierEmail;
		PhNo = phNo;
	}

	@Override
	public String toString() {
		return "Suppilers [ProductId=" + ProductId + ", SupplerId=" + SupplerId + ", SupplierName=" + SupplierName
				+ ", SupplierCompany=" + SupplierCompany + ", SupplierCity=" + SupplierCity + ", SupplierArea="
				+ SupplierArea + ", SupplierEmail=" + SupplierEmail + ", PhNo=" + PhNo + "]";
	}

}
