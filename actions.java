package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	public static void main(String[] args) {
		
		ChromeDriver g = new ChromeDriver();
		g.get("https://www.amazon.in/");
		g.manage().window().maximize();
		Actions obj = new Actions(g);
		//obj.moveToElement(g.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("phone").doubleClick().perform();
		WebElement element = g.findElement(By.id("nav-link-accountList"));
		obj.moveToElement(element).contextClick().build().perform();
	}
}
