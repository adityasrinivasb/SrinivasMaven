package com.srinivas.com.testproject;

import org.testng.Assert;
import org.testng.annotations.Test;



public class EmployeeTest {
	
	Employee e;
	
	@Test
	public void testName() {
		e = new Employee();
		e.setName("Srinivas");
		Assert.assertEquals(e.getName(), "Srinivas");
		e.setDesig("Senior Software Engineer");
		Assert.assertEquals(e.getDesig(), "Senior Software Engineer");
		
	}
	
	
	
    
}
