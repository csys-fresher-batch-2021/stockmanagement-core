package com.saran.model;

import in.yourproject.stock.stockdetail;

public class StockdetailDaoTest {

	public static void main(String[] args) {

		stockdetailDao stockdetaildao = new StockdetailDaoImpl();
		try {
			stockdetail stockdetail = stockdetaildao.findOne(12346);
			System.out.println(stockdetail);
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}

}
