package com.venkat.model;
import java.time.LocalDate;
import com.venkat.model.Import;
public class ImportValidatorTest {

	
	public static void main(String[] args)
	
	{
		
	
		
		testcase2();
	}

	private static void testcase2() {
		LocalDate ImportDate1=LocalDate.parse("2021-04-28");
		Import Import=new Import(12346,02432,ImportDate1,"Coimbatore",34260);

	
	
		try{
			ImportValidator.validator(Import);
			System.out.println("Validation system");
			
		}catch (Exception e) {
			String errorMessage=e.getMessage();
		System.out.println("validation failed:"+errorMessage);
		e.printStackTrace();
		}
	}
}


