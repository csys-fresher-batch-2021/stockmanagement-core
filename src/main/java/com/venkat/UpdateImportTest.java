package com.venkat.model;


	import java.time.LocalDate;
	import java.util.List;

	import com.venkat.model.Import;

	public class UpdateImportTest {

		public static void main(String[] args) {
			
			
			//LocalDate Export_date1 = LocalDate.parse("2021-06-12");	
			//Export_Details export_Details = new Export_Details(12346, 1267, ImportDate1, "Pondicherry", 34890);
		UpdateImportDao UpdateImportDao = new UpdateImportDaoimp();
			try {
			UpdateImportDao.UpdateImport(12346,34890);
				System.out.println("Successfully updated product");
			} catch (Exception e) {
				String errorMessage = e.getMessage();
				System.out.println("Failure:" + errorMessage);
				e.printStackTrace();
			}
		}
	}

