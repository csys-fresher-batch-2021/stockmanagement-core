package com.saran.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import in.yourproject.stock.stockdetail;

public class StockdetailDaoImpl implements stockdetailDao {

	public static List<stockdetail> fineOneProduct(int productId) throws Exception {

		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		// 4. Iterate results and get row and column values
		//stockdetail stockdetail;
		List<stockdetail> findProduct = new ArrayList<>();
		//stockdetail details=new stockdetail();
		try {
			// 1. Get DB connection
			connection = Connectionutil.getConnection();

			String sql = "select ProductId,ProductName,OrderedDate,ProductQuantity from stockdetail where ProductId = ?";
			
			// 2. Prepare Query
			pst = connection.prepareStatement(sql);
			pst.setInt(1, productId);

			// 3. Execute Query and get results
			rs = pst.executeQuery();
			if (rs.next()) {
				stockdetail details=new stockdetail();
				// Get Column values
				int ProductId = rs.getInt("ProductId");
				String ProductName = rs.getString("ProductName");
				Date orderDate=rs.getDate("OrderedDate");
				/*
				 * LocalDate(java.sql.Date)OrderedDate ); LocalDate OrderedDate =
				 * LocalDate.parse("OrderedDate");
				 */
				
				int ProductQuantity = rs.getInt("ProductQuantity");
				details.setProductId(ProductId);
				details.setProductName(ProductName);
				details.setOrderedDate(orderDate);
				details.setProductQuantity(ProductQuantity);
				//stockdetail = new stockdetail(ProductId, ProductName, OrderedDate, ProductQuantity);
				findProduct.add(details);
				// System.out.println(id + "-" + name + "-" + price);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to find product details");
		} finally {
			Connectionutil.close(pst, rs, connection);
		}

		return findProduct;

	}

	@Override
	public List<stockdetail> findOne(int productId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
