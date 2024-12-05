package gurubank99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) {
		ChromeDriver g = new ChromeDriver();
		g.manage().window().maximize();
		g.get("https://www.amazon.in/");
		//WebElement element = g.findElement(By.tagName("a"));
		List<WebElement> elements = g.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		for(int i = 0; i<elements.size(); i++) {
			
			System.out.println(elements.get(i).getText());
			System.out.println(elements.get(i).getAttribute("href"));
		}
		
	}
}
