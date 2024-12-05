package Testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class justclass {
	
	
	@BeforeClass
	public void educationloan() {
		
		System.out.println("BeforeClass educationloan");
		
		
		
	}
	
	@Test(dependsOnMethods = {"higherstudies2"})
	public void higherstudies1() {
		
		System.out.println("mca");
	}
	
	@Test
	public void higherstudies2() {
		
		System.out.println("testing");
	}
	
	@Test(enabled = false)
	public void car() {
		
		System.out.println("bmw");
	}
	
	@Test(groups = {"smoke"})
	
	public void bike() {
		
		System.out.println("honda");
	}
	
	
	@AfterClass
	public void houseloan() {
		
		System.out.println("afterclass houseloan");
	}
	
	
	@BeforeMethod
	public void goldloan() {
		
		System.out.println("goldloan beforemethod");
	}
	
	
	@AfterMethod
	public void marriageloan() {
		
		System.out.println("marriageloan aftermethod ");
	}
	
	
	
	

}
