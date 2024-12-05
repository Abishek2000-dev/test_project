package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbilling {
	
	public static void main(String[] args) {
		
		ChromeDriver deriver = new ChromeDriver();
		deriver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		deriver.manage().window().maximize();
		String title = deriver.getTitle();
		System.out.println(title);
		//deriver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[@type ='text'][1]")).sendKeys("abishek");
		//deriver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("kingSr@gmail.com");
		deriver.findElement(By.xpath("//div[@class='container']/child::input[@name='name'][1]")).sendKeys("abishek");
	////tagname[@attribte='value']/(fist follow child)::(following sibbling)tagname
			//div[@class='container']/child::input[@name='name'][1]--keywords eg.
		//prisde
		
		////div[@class='container']/descendant::button- grand child
		//div[@class='container']/descendant::button - grand parent
		////button[contains(@class,'btn')][1]- contains
		deriver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//twotabsearchtextbox css.path
		//input[@id='twotabsearchtextbox'] = id path xpath
		
		deriver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/input")).click();
		//https://demo.guru99.com/test/newtours/register.php  assignment
		
	
	
	}
	
	

}
