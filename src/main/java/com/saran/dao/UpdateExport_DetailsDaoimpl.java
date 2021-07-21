package com.saran.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.saran.connectionUtil.ConnectionUtil;

public class UpdateExport_DetailsDaoimpl implements updateExport_DetailsDao {

	@Override
	public boolean UpdateExport_Details(int productid,int exportcost) throws Exception {
		
				
				Connection connection = null;
				PreparedStatement pst = null;
				try {
					String sql = "update Export_Details set export_cost = ? where product_id = ?";
					connection = ConnectionUtil.getConnection();
					pst = connection.prepareStatement(sql);
					pst.setInt(1, exportcost );// 1st ?
					pst.setInt(2, productid);
					int rows = pst.executeUpdate();
					System.out.println("No of rows updated :" + rows);
				} catch (SQLException e) {
					e.printStackTrace();
					throw new Exception( "Unable to update");
				}
				finally {
					/*if(pst !=null) {
						pst.close();
					}
					if(connection !=null) {
						connection.close();
					}*/
					ConnectionUtil.close(pst, connection);
					
				}
		return false;
	}

}
