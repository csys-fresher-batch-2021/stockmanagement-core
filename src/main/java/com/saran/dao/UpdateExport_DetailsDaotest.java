package com.saran.dao;

public class UpdateExport_DetailsDaotest {

	public static void main(String[] args) {
		
		
		//LocalDate Export_date1 = LocalDate.parse("2021-06-12");	
		//Export_Details export_Details = new Export_Details(12346, 1267, Export_date1, "Pondicherry", 34890);
	updateExport_DetailsDao updateexport_DetailsDao = new UpdateExport_DetailsDaoimpl();
		try {
			updateexport_DetailsDao.UpdateExport_Details(12346,34890);
			System.out.println("Successfully updated product");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}
}
