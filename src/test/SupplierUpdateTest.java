package in.chainsys;

import java.util.List;

import in.chainsys.dao.imp.SupplierImpDAO;
import in.chainsys.model.SupplierTable;
import in.chainsys.service.SupplierService;

public class SupplierUpdateTest {
	public static void main(String[] args) throws Exception {
		

		String supplierEmail = "mac@gmail.com";
		String company = "MAC";
		boolean isSupplierUpdated = SupplierService.updateStatus(supplierEmail, company);
		System.out.println(isSupplierUpdated);
	}
}