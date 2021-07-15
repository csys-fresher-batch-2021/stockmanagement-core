package in.yourproject;

public class SupplierValidator {

	public static void validator(Suppliers Supplier) throws Exception{
		
		if (Supplier.SupplierId <= 0) {
			throw new Exception ("Invalid SupplierId");
		}
		else if (Supplier.SupplierCompany == null || Supplier.SupplierCompany.trim().equals("")) {
			throw new Exception ("Invalid Company Name");
		
		}
	}
}


