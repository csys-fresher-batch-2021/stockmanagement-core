package com.saran.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.saran.connectionUtil.ConnectionUtil;
import com.saran.model.Export_Details;


public class Export_DetailsDaompl implements Export_DetailsDao {
	
	@Override
	public boolean save(Export_Details export_Details) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into Export_Details(product_id,export_id,Export_date,export_Destination,export_cost) values(" + export_Details.product_id + "," + export_Details.export_id + ",'"
				+ export_Details.Export_date + "','" + export_Details.export_Destination + "'," + export_Details.export_cost +");";
				System.out.println(sql);
				Connection connection = null;
				PreparedStatement pst = null;
				try {
					connection = ConnectionUtil.getConnection();
					pst = connection.prepareStatement(sql);
					int rows = pst.executeUpdate();
					System.out.println("No of rows inserted :" + rows);
				} catch (SQLException e) {
					e.printStackTrace();
					throw new Exception( "Unable to add products");
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
