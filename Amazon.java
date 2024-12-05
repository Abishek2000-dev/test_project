package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		//driver.findElement(By.linkText("Best Sellers")).click();
		//driver.findElement(By.partialLinkText("best")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
		driver.navigate().to("https://www.amazon.in");
		driver.findElement(By.xpath("//a[text()='MX Player']")).click();
		driver.navigate().back();
	
		
	}

}
