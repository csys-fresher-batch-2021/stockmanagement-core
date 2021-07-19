package in.chainsys.service;

import in.chainsys.dao.imp.SupplierImpDAO;
import in.chainsys.exception.DbException;
import in.chainsys.exception.SupplierExistException;
import in.chainsys.exception.ServiceException;
import in.chainsys.model.SupplierTable;
import in.chainsys.validator.SupplierValidator;

public class SupplierService {

	public static boolean addSupplier(int supplierId, String supplierName, String supplierCompany, String supplierEmail,
			long supplierPhno) throws DbException, ServiceException, SupplierExistException {
		boolean added = false;
		int id = supplierId;
		String name = supplierName;
		String company = supplierCompany;
		String email = supplierEmail;
		long mobileno = supplierPhno;
		boolean isSupliedValid =SupplierValidator.isValidSupplierName(supplierName, email) ;
		boolean test= SupplierValidator.isSupplierExists(company);
		if (isSupliedValid && test) {
			SupplierTable supplierDetails = new SupplierTable(id, name, company, email, mobileno);
			SupplierImpDAO.addMember(supplierDetails);
			added = true;
		} else {
			added = false;
		}
		return added;
	}
	public static boolean updateStatus(String companyEmail ,String compannyName ) throws DbException {
		boolean isValid = false;
		String name =compannyName;
		String email=companyEmail;
		boolean isMailExist = SupplierValidator.isEmailExists(email);
		if(isMailExist) {
			SupplierImpDAO.updateStatus(name, email);
			isValid=true;
		}
		return isValid;
	}

}