package com.crm.Vtiger.Practice;

import org.testng.annotations.Test;

public class CreateDemo1Test {
	@Test(groups="RegressionTest")
	public void createorg() {
		System.out.println("Org created");
	}
	
	@Test(groups="SmokeTest")
	public void modifyorg() {
		System.out.println("Org modified");
	}
	

}
