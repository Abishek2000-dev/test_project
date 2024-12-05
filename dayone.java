package Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dayone {
	
	//every method header should mentioned @Test
	
	//@BeforeSuit
	//@BeforeTest
	//@BeforeClass
	//@BeforeMethod
	//@Test
	
	//@AfterMethod
	//@AfterClass
	//@AfterTest
	//@AfterMethod
	//@AfterSuit
	
	
	@BeforeSuite
	public void college () {
		
		System.out.println("BeforeSuite college");
		
	}
	
	
	@AfterSuite
	public void work() {
		
		System.out.println("Aftersuite work");
	}
	
	
	@BeforeTest
	public void bikeloan() {
		System.out.println("BeforeTest bikeloan");
	}
	
	
	
	
	@AfterTest
	public void carloan() {
		System.out.println("after test car loan");
	}
	
	@Test(groups = {"smoke"})

	public void homelone() {
		System.out.println("home loan");
	}
	
	@Test
	public void bankloan() {
		
		System.out.println("bankloan");
	}
}
