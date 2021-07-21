package com.saran.model;

import java.util.List;

import in.yourproject.stock.stockdetail;

public class StockdetailDaoTest {

	public static void main(String[] args) {

		//stockdetailDao stockdetaildao = new StockdetailDaoImpl();
		try {
			//List<stockdetail> stockdetail = stockdetaildao.findOne(12348);
			List<stockdetail> stockdetail=StockdetailDaoImpl.fineOneProduct(12348);
			System.out.println(stockdetail);
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}

}
