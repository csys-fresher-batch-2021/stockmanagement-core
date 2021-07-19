package com.saran.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.saran.connectionUtil.ConnectionUtil;
import com.saran.model.Export;

public class ExportDaompl implements ExportDao {
	
	@Override
	public boolean save(Export export) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into Export(productid,exportid,Exportdate,exportDestination,exportcost) values(" + export.productid + "," + export.exportid + ",'"
				+ export.Exportdate + "','" + export.exportDestination + "'," + export.exportcost +");";
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
