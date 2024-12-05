package gurubank99;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handls {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver g = new ChromeDriver();
		g.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		g.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor obj = (JavascriptExecutor)g;
		obj.executeScript("window.scrollBy(0,500)");
		g.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowHandles = g.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String partent = iterator.next();
		String child = iterator.next();
		g.switchTo().window(child);
		String text = g.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText();
		System.out.println(text);
		
		 //g.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText();
		 String trim = g.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText().split("is")[1].trim();
		 g.switchTo().window(partent);
		 WebElement element = g.findElement(By.xpath("//input[@name='username']"));
		 element.sendKeys(trim);
		 File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotAs, new File("good1.png"));
		 
		 
		
	}

}
