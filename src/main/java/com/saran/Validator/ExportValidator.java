package com.saran.validator;

import com.saran.model.Export;

public class ExportValidator {

			public static void validator (Export Export) throws Exception {		
				
				if(Export.productid <= 0 || Export.exportid<=0 ) {
					throw new Exception("Invalid Productid or invalid exportid");
				}
				else if (Export.exportDestination == null || Export.exportDestination.trim().equals("") ) {
					throw new Exception (" Invalid exportDestination");
				}
				
			}
		


	}