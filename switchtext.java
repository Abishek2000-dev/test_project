package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtext {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String text = driver.findElement(By.xpath("//h2[text()='Starting ₹149 | Headphones']")).getText();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(text);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
}
