package gurubank99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggustion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver g = new ChromeDriver();
		g.manage().window().maximize();
		g.get("https://www.google.co.in/");
		g.findElement(By.xpath("//textarea[@class = 'gLFyf']")).sendKeys("selenium");
		Thread.sleep(3000);
		String excep = "selenium testing";
		List<WebElement> elements = g.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for (WebElement h:elements) {
			System.out.println(h.getText());
			String actual = h.getText();
			if(actual.equals(excep)) {
				h.click();
				break;
			}
			else {
				System.out.println("failed");
			}
			
		}
		
		
	}

}
