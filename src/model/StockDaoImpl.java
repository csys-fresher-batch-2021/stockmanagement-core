package com.saran.model;

import in.yourproject.stock.stockdetail;

public class StockdetailDaoImpl implements stockdetailDao {

	@Override
	public boolean save(stockdetail stockdetail) throws Exception {
		String sql = "insert into stockdetail(productid,productname,ordereddate,productquantity) values(" + stockdetail.ProductId + "','" + stockdetail.ProductName + "','"
				+ stockdetail.OrderedDate + "','" + stockdetail.ProductQuantity +")";
				System.out.println(sql);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
