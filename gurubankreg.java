package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gurubankreg {
		
	public static void main(String[] args) {
		ChromeDriver g = new ChromeDriver();
		g.manage().window().minimize();
		String title = g.getTitle();
		System.out.println(title);
		g.get("https://demo.guru99.com/test/newtours/register.php");
		g.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abishek");
		g.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kumar");
		g.findElement(By.xpath("//input[@name='phone']")).sendKeys("7904026363");
		g.findElement(By.xpath("//input[@name='userName']")).sendKeys("abisk270@gmail.com");
		g.findElement(By.xpath("//input[@name='address1']")).sendKeys("tambarm");
		g.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
		g.findElement(By.xpath("//input[@name='state']")).sendKeys("tamil nadu");
		g.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("608002");
		WebElement element = g.findElement(By.xpath("//select[@name='country']"));
		Select obj = new Select(element);
		obj.selectByIndex(4);
		g.findElement(By.xpath("//input[@name='email']")).sendKeys("abisk270@gmail.com");
		g.findElement(By.xpath("//input[@name='password']")).sendKeys("abishek");
		g.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("abishek");
		g.findElement(By.xpath("//input[@name='submit']")).click();
		

		
		
		
		
		
		
		
		
		
		
		
	}
}
