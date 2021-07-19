package in.chainsys.validator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.chainsys.dao.imp.SupplierImpDAO;
import in.chainsys.exception.SupplierExistException;
import in.chainsys.exception.DbException;
import in.chainsys.exception.ServiceException;
import in.chainsys.model.SupplierTable;

public class SupplierValidator {
	private SupplierValidator() {
		// Default Constructor
	}

	public static boolean isSupplierExists(String company) throws SupplierExistException, DbException {
		boolean isExist = false;
		List<SupplierTable> supplierList = SupplierImpDAO.getAllSupplier();
		for (SupplierTable supplier : supplierList) {
			if (company.equals(supplier.getSupplierCompany())) {
				throw new SupplierExistException(company + "Already Company Exist");
			}
			 else {
				isExist = true;
			}
		}
		
		return isExist;
	}

	/**
	 * This method validates the member name avoids special characters, numbers,null
	 * value,white space and length of the movie name must not exceed 30 characters.
	 * 
	 * @param memberName
	 * @return boolean value
	 * @throws Exception
	 */

	public static boolean isValidSupplierName(String supplierName, String message) throws ServiceException {

		if (supplierName != null && !supplierName.trim().equals("")) {
			return true;
		} else {
			throw new ServiceException(message);
		}
	}


	/**
	 * This method validates mobileNumber whether it is valid number or not
	 * 
	 * @param mobileno
	 */
	public static boolean isValid(long supplierPhno) {
		boolean isValid = false;
		String supplierphno = Long.toString(supplierPhno);
		if (supplierphno != null) {
			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m = p.matcher(supplierphno);
			return (m.find() && m.group().equals(supplierphno));
		}
		return isValid;

	}
	public static boolean isEmailExists(String email) throws DbException {
		boolean isExist=false;
		String supplierEmail="";
		List<SupplierTable> tableList = SupplierImpDAO.getAllSupplier();
		for (SupplierTable supplierTable : tableList) {
			supplierEmail=supplierTable.getSupplierEmail();
			if(supplierEmail.equalsIgnoreCase(email)){
				isExist=true;
		}
		}
		return isExist;
	}

}