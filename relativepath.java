package gurubank99;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class relativepath {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement element = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		String text = driver.findElement(with(By.tagName("label")).above(element)).getText();
		
		System.out.println(text);
		WebElement element2 = driver.findElement(By.xpath("//label[text()='Last Name']"));
		driver.findElement(with(By.tagName("input")).below(element2)).sendKeys("abishek");
		
		WebElement element3 = driver.findElement(By.xpath("//td[text()='Maria Anders']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(element3)).click();
		
		int height = element.getRect().getDimension().getHeight();
		int width= element.getRect().getDimension().getWidth();
		
		System.out.println(height);
		System.out.println(width);
	}

}
