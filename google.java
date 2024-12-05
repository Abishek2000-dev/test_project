package gurubank99;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotAs, new File("C:\\Users\\19794\\Pictures\\good.png"));
		FileUtils.copyFile(screenshotAs, new File(".//gt/jj.png"));
		
	}
	
}
