package gurubank99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class addctin {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("dhivya0796");
		driver.findElement(By.name("password")).sendKeys("K3ZZ51");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select obj = new Select(location);
		obj.selectByIndex(3);
		Select obj1 = new Select(hotels);
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		obj1.selectByIndex(2);
		WebElement rooms = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select obj2 = new Select(rooms);
		obj2.selectByIndex(2);
		WebElement roometype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select obj3 = new Select(roometype);
		obj3.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("20/11/2024");
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("24/11/2024");
		WebElement adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select obj4 = new Select(adroom);
		obj4.selectByIndex(4);
		WebElement chroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select obj5 = new Select(chroom);
		obj5.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("ABISHEK");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("CUDDALORE");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("2222444488886666");
		WebElement card = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select obj6 = new Select(card);
		obj6.selectByIndex(2);
		WebElement excard = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select obj7 = new Select(excard);
		obj7.selectByIndex(2);
		driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2025");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("334");
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		String text = driver.findElement(By.xpath("//input[@name='order_no']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
