package com.saran.validator;

import com.saran.model.Export_Details;

public class Export_DetailsValidator {

			public static void validator (Export_Details Export_Details) throws Exception {		
				
				if(Export_Details.product_id <= 0 || Export_Details.export_id<=0 ) {
					throw new Exception("Invalid Productid or invalid exportid");
				}
				else if (Export_Details.export_Destination == null || Export_Details.export_Destination.trim().equals("") ) {
					throw new Exception (" Invalid exportDestination");
				}
				
			}
		


	}