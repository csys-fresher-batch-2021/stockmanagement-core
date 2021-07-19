package com.venkat.model;

import com.venkat.model.Import;

	import java.time.LocalDate; 
	
	
	public class ImportDaoTest {
		
			public static void main(String[] args) {
				LocalDate ImportDate=LocalDate.parse("2021-04-28");
				Import Import=new Import(12346,02432,ImportDate,"Coimbatore",34260);
				ImportDao ImportDao = new ImportDaoimpl();
				
				
			try {
				
				ImportDao.save(Import);
				System.out.println("Successfully added product");
			} catch (Exception e) {
				String errorMessage = e.getMessage();
				System.out.println("Failure:" + errorMessage);
				e.printStackTrace();
			
			}
			}
	}
			
			
			

		
	
