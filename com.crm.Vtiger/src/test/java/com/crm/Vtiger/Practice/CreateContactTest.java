package com.crm.Vtiger.Practice;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups="SmokeTest")
	public void createContact() {
		System.out.println("Contact created");
		System.out.println("create modified");
	}
@Test(groups="RegressionTest")
public void deletecontact() {
	System.out.println("Contact deleted");
}
	
	
	
}
