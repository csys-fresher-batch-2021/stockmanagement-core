package in.yourproject.stock;

public class Stockdetailvalidator {


			
			

				
					public static void validator (stockdetail stockdetail) throws Exception {		
						
						if(stockdetail.ProductId <= 0) {
							throw new Exception("Invalid Productid or invalid trackingid");
						}
						else if (stockdetail.ProductName == null ||stockdetail.ProductName.trim().equals("") ) {
							throw new Exception (" Invalid productname");
						}
		}

	}


