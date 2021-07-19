package com.saran.dao;

import com.saran.model.Export_Details;

public interface ExportDao {

	boolean save(Export_Details export_Details) throws Exception;
	
}