package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) {
		//selected id static
		//div or input except selected dynamic
		
		ChromeDriver h = new ChromeDriver();
		h.manage().window().maximize();
		h.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement element = h.findElement(By.xpath("//select[@name='country']"));
		Select obj = new Select(element);
		//obj.selectByValue("ANDORRA");
		//obj.selectByVisibleText("AMERICAN SAMOA");
		obj.selectByIndex(3);
		String text = obj.getFirstSelectedOption().getText();
		System.out.println(text);
		
	}

}
