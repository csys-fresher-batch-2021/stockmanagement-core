package in.chainsys.dao;

import in.chainsys.exception.DbException;
import in.chainsys.model.SupplierTable;

public interface SupplierDAO {

	static void addSupplier(SupplierTable supplier) throws DbException {
	}

	/**
	 * This method delete the supplier detail .
	 * 
	 * @param supplierIdnumber
	 * @throws DBException
	 */

	static void deleteSupplier(SupplierTable supplierId) throws DbException {
	}
 void updateSupplierStatus(int supplierId) throws DbException;

}