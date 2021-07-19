package com.saran.dao;
import java.time.LocalDate;
import com.saran.model.Export;

public class ExportDaotest {
	
		public static void main(String[] args) {
			
		
			LocalDate Exportdate1 = LocalDate.parse("2021-06-12");	
			Export export = new Export(12346, 1267, Exportdate1, "Pondicherry", 34890);
			ExportDao exportDao = new ExportDaompl();
			try {
				exportDao.save(export);
				System.out.println("Successfully added product");
			} catch (Exception e) {
				String errorMessage = e.getMessage();
				System.out.println("Failure:" + errorMessage);
				e.printStackTrace();
			}
		}

	}

