package com.saran.dao;
import java.time.LocalDate;

import com.saran.model.Export_Details;


public class ExportDaotest {
	
		public static void main(String[] args) {
			
		
			LocalDate Export_date1 = LocalDate.parse("2021-06-12");	
			Export_Details export_Details = new Export_Details(12346, 1267, Export_date1, "Pondicherry", 34890);
			ExportDao exportDao = new ExportDaompl();
			try {
				exportDao.save(export_Details);
				System.out.println("Successfully added product");
			} catch (Exception e) {
				String errorMessage = e.getMessage();
				System.out.println("Failure:" + errorMessage);
				e.printStackTrace();
			}
		}

	}

