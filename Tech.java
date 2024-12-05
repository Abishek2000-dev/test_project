package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tech {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//span[text()='First name:']/following-sibling::input[@name='firstname']")).sendKeys("abishek");
		driver.findElement(By.xpath("//span[text()='Last name:']/following-sibling::input[@name='lastname']")).sendKeys("kumar");
		
		
	}
}
