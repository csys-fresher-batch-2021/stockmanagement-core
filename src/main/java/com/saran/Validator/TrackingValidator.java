package com.saran.validator;

import com.saran.model.Tracking;

public class TrackingValidator {
	/**
	 * Developed by saran
	 * @param Tracking
	 * @throws Exception
	 */

	
		public static void validator (Tracking Tracking) throws Exception {		
			
			if(Tracking.productid <= 0 || Tracking.trackingid<=0 ) {
				throw new Exception("Invalid Productid or invalid trackingid");
			}
			else if (Tracking.productname == null || Tracking.productname.trim().equals("") ) {
				throw new Exception (" Invalid productname");
			}
			
		}
	


	}


