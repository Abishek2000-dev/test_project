package Testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assigment {
	
	public ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	@BeforeMethod
	public void openurl() {
		
		driver.set(new ChromeDriver());
		driver.get().manage().window().maximize();
		driver.get().get("https://automationexercise.com/");
		driver.get().findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.get().findElement(By.xpath("//input[@TYPE='email'][1]")).sendKeys("kingst484@gmail.com");
		driver.get().findElement(By.xpath("//input[@TYPE='password']")).sendKeys("abishek@21");
		driver.get().findElement(By.xpath("//button[@TYPE='submit']")).click();
		
    
		
	}
	
	@Test
	public void Women() {
		
		driver.get().findElement(By.xpath("//span[@class='badge pull-right'][1]")).click();
		driver.get().findElement(By.xpath("//a[text()='Dress '][1]")).click();
		driver.get().findElement(By.xpath("//a[text()='Add to cart'][1]")).click();
	}
	
	@Test
	public void men() {
		
		driver.get().findElement(By.xpath("//a[@href='#Men']")).click();
		driver.get().findElement(By.xpath("//a[text()='Tshirts ']")).click();
		driver.get().findElement(By.xpath("//a[text()='Add to cart'][1]")).click();
		
			
	}
	@Test
	public void chidl() {
		
		driver.get().findElement(By.xpath("//a[@href='#Kids']")).click();
		driver.get().findElement(By.xpath("//a[text()='Dress ']")).click();
		driver.get().findElement(By.xpath("//a[text()='Add to cart'][1]")).click();
		
			
	}
	
	

}
