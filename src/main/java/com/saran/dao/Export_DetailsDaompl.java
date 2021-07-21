package com.saran.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.saran.connectionUtil.ConnectionUtil;
import com.saran.model.Export_Details;

public class Export_DetailsDaompl implements Export_DetailsDao {

	@Override
	public boolean save(Export_Details export_Details) throws Exception {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into Export_Details(product_id,export_id,Export_date,export_Destination,export_cost) values(?,?,?,?,?)";
			pst = connection.prepareStatement(sql);
			Date exportDate = java.sql.Date.valueOf(export_Details.getExport_date());
			pst.setInt(1, export_Details.getProduct_id());
			pst.setInt(2, export_Details.getExport_id());
			pst.setDate(3, (java.sql.Date) exportDate);
			pst.setString(4, export_Details.getExport_Destination());
			pst.setInt(5, export_Details.getExport_cost());

			int rows = pst.executeUpdate();
			System.out.println("No of rows inserted :" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to add products");
		} finally {
			/*
			 * if(pst !=null) { pst.close(); } if(connection !=null) { connection.close(); }
			 */
			ConnectionUtil.close(pst, connection);

		}
		return false;
	}

}
