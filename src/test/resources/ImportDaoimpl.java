package com.venkat.model;

import com.venkat.model.Import;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.venkat.model.ConnectionUtil;
import com.venkat.model.ImportDao;

	

		

	

		

		public class ImportDaoimpl implements ImportDao {
			
			public boolean save(Import Import) throws Exception {
			String sql = "insert into Import(Productid,Importid,ImportDate,ImportDestination,Importcost) values(" + Import.Productid + "','" + Import.Importid + "','"
					+ Import.ImportDate + "','" + Import.ImportDestination + "'," + Import.Importcost +")";
					
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
					
public static void main(String[]args)
{
	
}
			}

			
			
			
			
			

		

	

