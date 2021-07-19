package com.saran.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import in.yourproject.stock.stockdetail;

public class StockdetailDaoImpl implements stockdetailDao {

	@Override
	public stockdetail findOne(int productId)throws Exception {

		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		// 4. Iterate results and get row and column values
	stockdetail stockdetail;
		try {
			// 1. Get DB connection
			connection = Connectionutil.getConnection();

			String sql = "select ProductId,ProductName,OrderedDate,ProductQuantity from stockdetail where ProductId = ?";

			// 2. Prepare Query
			pst = connection.prepareStatement(sql);
			pst.setInt(12346, productId);

			// 3. Execute Query and get results
			rs = pst.executeQuery();

			stockdetail = null;
			if (rs.next()) {
				// Get Column values
				int ProductId = rs.getInt("ProductId");
				String ProductName = rs.getString("ProductName");
				LocalDate OrderedDate = LocalDate.parse("OrderedDate");
				int ProductQuantity = rs.getInt("ProductQuantity");

				stockdetail = new stockdetail(ProductId, ProductName,OrderedDate,ProductQuantity);

				// System.out.println(id + "-" + name + "-" + price);
				System.out.println(stockdetail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception( "Unable to find product details");
		}
		finally {
			Connectionutil.close(pst, rs, connection);
		}

		return stockdetail;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
	

	