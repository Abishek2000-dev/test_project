package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class debugging {

	public static void main(String[] args) {
		ChromeDriver g = new ChromeDriver();
		g.get("https://www.facebook.com/");
		g.manage().window().maximize();
		g.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("abisk277@gmail.com");
		g.findElement(By.id("pass")).sendKeys("123456");
		g.findElement(By.xpath("//button[@name='login']")).click();

	}

}
