package gurubank99;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRTC {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("CHENNAI EGMORE - MS (CHENNAI)");
		//driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("CHIDAMBARAM - CDM");
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		String m1 = driver.findElement(By.xpath("//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c58-10 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-star-inserted']")).getText();
		String y1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
		while(!(m1.equals("December") && y1.equals("2024"))) {
			driver.findElement(By.xpath("//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c58-10 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-star-inserted']")).click();
			
		}
		List<WebElement> elements = driver.findElements(By.xpath("//td[@class='ng-tns-c58-10 ng-star-inserted'][6]"));
		
		for(WebElement h:elements ) {
			h.click(); break;
			
		}
		
		driver.findElement(By.xpath("//li[@class='ui-dropdown-item ui-corner-all'][1]")).click();
		
		driver.findElement(By.xpath("//li[@class='ui-dropdown-item ui-corner-all ui-state-highlight'][1]")).click();
		
		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
		
		
	}

}
