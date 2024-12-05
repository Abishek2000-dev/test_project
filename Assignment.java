package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("uid")).sendKeys("mngr595354");
		driver.findElement(By.name("password")).sendKeys("zAjatEg");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("ABISHEK KUMAR");
		driver.findElement(By.name("rad1")).sendKeys("male");
		driver.findElement(By.name("dob")).sendKeys("21-11-2000");
		driver.findElement(By.name("addr")).sendKeys("22 TAMBARAM CHENNAI TAMIL NADU ");
		driver.findElement(By.name("city")).sendKeys("CHENNAI ");
		driver.findElement(By.name("state")).sendKeys("TAMIL NADU");
		driver.findElement(By.name("pinno")).sendKeys("608002 ");
		driver.findElement(By.name("telephoneno")).sendKeys("1234567890 ");
		driver.findElement(By.name("emailid")).sendKeys("abishk12345@gamil.com ");
		driver.findElement(By.name("password")).sendKeys("abishekKumar ");
		driver.findElement(By.name("sub")).click();
		
		
	}

}
