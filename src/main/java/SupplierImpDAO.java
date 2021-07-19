package in.chainsys.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.chainsys.dao.SupplierDAO;
import in.chainsys.exception.DbException;
import in.chainsys.model.SupplierTable;
import in.chainsys.util.ConnectionUtil;

public abstract class SupplierImpDAO implements SupplierDAO {
	private static final String INSERT_SUPPLIER_QUERY = "INSERT INTO SUPPLIERS_TABLE (SUPPLIER_ID, SUPPLIER_NAME, SUPPLIER_COMPANY, SUPPLIER_EMAIL, SUPPLIER_PH_NO) values(?,?,?,?,?)";
	private static final String DISPLAY_ALL_SUPPLIER_QUERY = "SELECT * FROM SUPPLIERS_TABLE";
	private static final String UPDATE_SUPPLIER_QUERY = "UPDATE SUPPLIERS_TABLE set SUPPLIER_COMPANY =?  where SUPPLIER_EMAIL=?";
	private static final String DISPLAY_REQUIRED_SUPPLIER_QUERY = "SELECT * FROM SUPPLIERS_TABLE WHERE SUPPLIER_ID = 12345";
	

	/**
	 * This Method is to Add supplier.
	 * 
	 * @param supplier
	 * @throws ClassNotFoundException
	 * @throws DbException
	 */
	public static void addMember(SupplierTable supplierDetails) throws DbException {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = INSERT_SUPPLIER_QUERY;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, supplierDetails.getSupplierId());
			pst.setString(2, supplierDetails.getSupplierName());
			pst.setString(3, supplierDetails.getSupplierCompany());
			pst.setString(4, supplierDetails.getSupplierEmail());
			pst.setLong(5, supplierDetails.getSupplierPhno());
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new DbException("Can't insert user.");
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}

	public static List<SupplierTable> getAllSupplier() throws DbException {
		List<SupplierTable> supplierList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DISPLAY_ALL_SUPPLIER_QUERY;
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int supplierId = rs.getInt("SUPPLIER_ID");
				String supplierName = rs.getString("SUPPLIER_NAME");
				String supplierCompany = rs.getString("SUPPLIER_COMPANY");
				String supplierEmail = rs.getString("SUPPLIER_EMAIL");
				long supplierPhno = rs.getLong("SUPPLIER_PH_NO");
				SupplierTable supplierTable = new SupplierTable(supplierId, supplierName, supplierCompany, supplierEmail, supplierPhno);
				supplierList.add(supplierTable);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DbException("Can't get the active member status");
		} finally {
			ConnectionUtil.close(pst, connection);
		}
		return supplierList;
	}



	

	public static void updateStatus(String status, String supplierEmail) throws DbException {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = UPDATE_SUPPLIER_QUERY;
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, status);
			pst.setString(2, supplierEmail);
			pst.executeUpdate();
		} catch (SQLException e) {

			throw new DbException("can't update the user status");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
	}

	

}