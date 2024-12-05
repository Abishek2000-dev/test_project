package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {
	
	@Parameters({"URL"})
	@Test
	public void account(String name) {
		
		System.out.println("college account" );
		System.out.println(name);
		
	}
	
	@Test(dataProvider = "data")
	public void schoolaccount(String username, String password) {
		
		System.out.println("school account");
		
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object [][] data(){
		
		Object [][]data = new Object[3][2];  // 3 combination and 2 columns
		//1st set
		data[0][0]= "first username";
		data[0][1]= "first password";
		// 2 set
		data[1][0] = "second username";
		data[1][1] = "second password";
		// 3 set
		data[2][0]= "third username";
		data[2][1] = "third password";
		return data;
		
	}

}
