package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("uid")).sendKeys("mngr595354");
		driver.findElement(By.name("password")).sendKeys("zAjatEg");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("84600");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		////tagname[@attribte='value']/(fist follow child)::(following sibbling)tagname
		//div[@class='container']/child::input[@name='name'][1]--keywords eg.
		
		
	}

}
