package com.venkat.model;



		
		public class ServiceException extends Exception{

			public ServiceException(Exception e, String message) {
				super(message, e);
			}
			
		}
	


