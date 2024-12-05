package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("39393939");
		d.findElement(By.xpath("//input[@name='submit']")).click();
		//d.switchTo().alert().accept();
		//d.switchTo().alert().dismiss();
		String text = d.switchTo().alert().getText();
		System.out.println(text);
		
	}

}
