package com.venkat.model;

import com.venkat.model.Import;

public class ImportValidator {

	public static void validator (Import Import) throws Exception {		
		
		if(Import.Productid <= 0 || Import.Importid<=0 ) {
			throw new Exception("Invalid Productid or invalid Importid");
		}
		else if (Import.ImportDestination == null || Import.ImportDestination.trim().equals("") ) {
			throw new Exception (" Invalid ImportDestination");
		}
		
	}
}
