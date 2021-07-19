package in.chainsys;

import in.chainsys.service.SupplierService;

public class SupplierAddingTest {
	/**
	 * Hardcode to add supplier
	 * 
	 * @param args
	 * @throws Throwable
	 */

	public static void main(String[] args) throws Throwable {
		int supplierId = 12345;
		String supplierName = "Poorni";
		String supplierCompany = "Lenovo";
		String supplierEmail = "mac@gmail.com";
		long supplierPhno = 9988776651L;
	
		boolean isSupplierAdded = SupplierService.addSupplier(supplierId, supplierName, supplierCompany, supplierEmail, supplierPhno);
	System.out.println(isSupplierAdded);

	}

}