package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	
	public static void main(String[] args) {
		
		ChromeDriver g = new ChromeDriver();
		
		g.get("https://jqueryui.com/droppable/");
		//g.findElements(By.tagName("iframe"))args.
		int size = g.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		WebElement element = g.findElement(By.xpath("//iframe[@class='demo-frame']"));
		g.switchTo().frame(element);
		Actions obj = new Actions(g);
		WebElement element2 = g.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement element3 = g.findElement(By.id("droppable"));
		obj.dragAndDrop(element2, element3).perform();
	}

}
