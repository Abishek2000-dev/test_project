package gurubank99;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class irtcswtic {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver g = new ChromeDriver();
	g.get("https://www.irctc.co.in/nget/train-search");
	g.manage().window().maximize();
	Thread.sleep(3000);
	
	JavascriptExecutor obj = (JavascriptExecutor)g;
	obj.executeScript("window.scrollBy(0,500)");
	g.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
	Set<String> windowHandles = g.getWindowHandles();
	Iterator<String> iterator = windowHandles.iterator();
	String partent = iterator.next();
	String child = iterator.next();
	g.switchTo().window(child);
	g.findElement(By.xpath("//a[@title='Bus Tickets']")).click();
	Set<String> bus = g.getWindowHandles();
	Iterator<String> iterator2 = windowHandles.iterator();
	String bus1 = iterator.next();
	String bus2 = iterator.next();
	g.switchTo().window(bus2);
	
	
}
}
