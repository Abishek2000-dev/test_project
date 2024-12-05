package gurubank99;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	
	private static WebElement element;

	public static void main(String[] args) {
		ChromeDriver g = new ChromeDriver();
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		g.manage().window().maximize();
		FluentWait <WebDriver> wait  = new FluentWait<WebDriver>(g)
				  .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(Exception.class);
		
		
		
		g.get("https://www.google.co.in/");
		g.findElement(By.xpath("//textarea[@class = 'gLFyf']")).sendKeys("selenium");
		g.findElement(By.xpath("//textarea[@class = 'gLFyf']")).sendKeys(Keys.RETURN);
		//WebDriverWait webDriverWait = new WebDriverWait(g,Duration.ofSeconds(10));
		//WebElement element3 = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']")));
			//element3.click();
			
			//delcartion
		
		/*Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//h3[normalize-space()='Selenium Testing: Detailed Guide']"));
			}
			});
		element.click();
	}*/
		WebElement  element = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']"));
			}

		});
		element.click();
		
		 
		public WebElement apply(WebDriver g) {
			
			return g.findElement(By.)
			
		}
	
			  
			 
		
	}

}
