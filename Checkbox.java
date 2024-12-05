package gurubank99;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		//d.findElement(By.xpath("//input[@type='checkbox']']")).click();
		/*
		 * int size = d.findElements(By.xpath("//input[@type='checkbox']")).size();
		 * System.out.println(size);
		 */
		
		//input[@type='checkbox' and contains (@name,'color')] 
		
		List<WebElement> elements = d.findElements(By.xpath("//input[@type='checkbox' and contains (@name,'color')]"));
		//to selected all  check box
		/*
		 * for(int i =0 ; i<elements.size(); i++) {
		 * 
		 * elements.get(i).click();
		 * 
		 * 
		 * }
		 */
		
		// to selected multiple check box
		/*
		 * for(WebElement checkitems:elements) {
		 * 
		 * String attribute = checkitems.getAttribute("value");
		 * 
		 * if(attribute.equals("red") || attribute.equals("blue")) {
		 * 
		 * checkitems.click(); }
		 * 
		 * 
		 * 
		 * }
		 */
		
		//to selected last two check box
		
		int size = elements.size();
		
		/*
		 * for(int i = size-2;i<size;i++ ) { elements.get(i).click(); }
		 */
		
		
		for(int i =0 ;i<size;i++) {
			if(i<3) {
				elements.get(i).click();
			}
		}
		
		///https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html
		
	
	}

}
