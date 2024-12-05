package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class darang {
	public static void main(String[] args) {
	ChromeDriver g = new ChromeDriver();
	g.manage().window().maximize();
		
		g.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		int size = g.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		WebElement element = g.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		g.switchTo().frame(element);
		Actions obj = new Actions(g);
		WebElement element2 = g.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));
		WebElement element4 = g.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][2]"));
		WebElement element5 = g.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][3]"));
		WebElement element6 = g.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][4]"));
		
		
		WebElement element3 = g.findElement(By.id("trash"));
		obj.dragAndDrop(element2, element3).perform();
		obj.dragAndDrop(element4, element3).perform();
		obj.dragAndDrop(element5, element3).perform();
		obj.dragAndDrop(element6, element3).perform();
		
	}

}
