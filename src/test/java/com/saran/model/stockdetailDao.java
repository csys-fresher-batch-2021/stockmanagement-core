package com.saran.model;

import java.util.List;

import in.yourproject.stock.stockdetail;

public interface stockdetailDao {

	List<stockdetail> findOne(int productId) throws Exception;
}
