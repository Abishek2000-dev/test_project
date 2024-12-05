package gurubank99;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(10));
		time.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		while(!(month.equals("December")&& year.equals("2024"))) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
		}
		
		/*
		 * Thread.sleep(3000); String excep = "selenium testing"; List<WebElement>
		 * elements = g.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		 * 
		 * for (WebElement h:elements) { System.out.println(h.getText()); String actual
		 * = h.getText(); if(actual.equals(excep)) { h.click(); break; } else {
		 * System.out.println("failed"); }
		 * 
		 * }
		 */
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()=4]")).click();
		
		
		
	}
	

}
