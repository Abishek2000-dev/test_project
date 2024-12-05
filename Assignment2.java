package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("uid")).sendKeys("mngr595354");
		driver.findElement(By.name("password")).sendKeys("zAjatEg");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Edit Customer")).click();
		driver.findElement(By.name("cusid")).sendKeys("84600");
		driver.findElement(By.name("AccSubmit")).click();
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("cuddal");
		driver.findElement(By.name("sub")).click();
		
		
		
		
		
	}

}
