package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class bank99 {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/V4/");
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.name("uid")).sendKeys("mngr601964");
			driver.findElement(By.name("password")).sendKeys("ajehAhE");
			driver.findElement(By.name("btnLogin")).click();
			
			//User ID :	mngr601964
			//Password :	ajehAhE
			
			  driver.findElement(By.linkText("New Customer")).click();
			  //driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[@type ='text'][1]")).sendKeys("abishek");
			  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("abishekkumar");
			  driver.findElement(By.xpath("//input[@type='radio'][1]")).sendKeys("male");
			  driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20-10-2024");
			  driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(
			  "chidambaram");
			  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("cuddal");
			  driver.findElement(By.xpath("//input[@name='state']")).sendKeys("tamil nadu"
			  ); driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("608002");
			  driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(
			  "7904026363");
			  driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(
			  "abisk198@gamil.com");
			  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abishek")
			  ; driver.findElement(By.xpath("//input[@type='submit']")).click();
			  driver.switchTo().alert().accept(); String text =
						driver.switchTo().alert().getText();
				System.out
						.println(text);
				
				
				
				
										  ///edit details //58725
										  driver.findElement(By.linkText("Edit Customer")).click();
										  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("58725");
										  driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
										  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("tambaram");
										  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
										  driver.findElement(By.xpath("//input[@name='sub']")).click();
										 
			 
			
			
			 // create account 
			  driver.findElement(By.linkText("New Account")).click();
			  
			  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("58725");
			  driver.findElement(By.xpath("//select[@name='selaccount']")).sendKeys(
			  "Savings");
			  driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("1000");
			  driver.findElement(By.xpath("//input[@name='button2']")).click();
			  
			  //edit account //140827
			  
			  
				/*
				 * driver.findElement(By.linkText("Edit Account")).click();
				 * driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("140827")
				 * ; driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
				 */
			
			
			
		
			
	
		
			
			
			
		

		}
}
