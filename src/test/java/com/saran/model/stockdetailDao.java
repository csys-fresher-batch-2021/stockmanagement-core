package com.saran.model;

import in.yourproject.stock.stockdetail;

public interface stockdetailDao {

	stockdetail findOne(int productId) throws Exception;
}
