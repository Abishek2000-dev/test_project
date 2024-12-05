package gurubank99;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktab {
		
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		System.out.println(title);
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		WebElement element = driver.findElement(By.tagName("footer"));
		
		List<WebElement> elements2 = element.findElements(By.tagName("a"));
		
		System.out.println(elements2.size());
		
		WebElement element2 = driver.findElement(By.xpath("//div[@class='row justify-content-around pt-4 pb-5 px-5'][2]"));
		List<WebElement> elements3 = element2.findElements(By.tagName("a"));
		
		System.out.println(elements3.size());
		
		
		for(int i = 0; i < elements3.size();i++) {
			
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			element2.findElements(By.tagName("a")).get(i).sendKeys(chord);
			Thread.sleep(3000);
			
			
			
			
			
		}
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		
		while(iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			String title2 = driver.getTitle();
			System.out.println(title2);
		}
	}
}
