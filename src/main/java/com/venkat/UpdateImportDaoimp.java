package com.venkat.model;



	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import com.venkat.model.ConnectionUtil;
	import com.venkat.model.Import;

	public class UpdateImportDaoimp implements UpdateImportDao{
		public boolean UpdateImport(int Productid,int Importcost) throws Exception {
			
					
					Connection connection = null;
					PreparedStatement pst = null;
					try {
						String sql = "Update Import set Importcost = ? where Productid = ?";
						connection = ConnectionUtil.getConnection();
						pst = connection.prepareStatement(sql);
						pst.setInt(1, Importcost );// 1st ?
						pst.setInt(2, Productid);
						int rows = pst.executeUpdate();
						System.out.println("No of rows updated :" + rows);
					} catch (SQLException e) {
						e.printStackTrace();
						throw new Exception( "Unable to update");
					}
					finally {
						
						
						ConnectionUtil.close(pst, connection);
						
					}
			return false;
		}

		public static void main(String[] args) {

		}

	}

