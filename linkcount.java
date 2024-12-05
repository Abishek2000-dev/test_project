package gurubank99;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver g =  new ChromeDriver();
		g.get("https://demo.guru99.com/test/newtours/");
		g.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> elements = g.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		for (WebElement link : elements) {
			
			String attribute = link.getAttribute("href");
			
			URL url= new URL(attribute);
			URLConnection openConnection = url.openConnection();
			HttpURLConnection t = (HttpURLConnection) openConnection;
			t.connect();
			
			if(t.getResponseCode()==200) {
				System.out.println(attribute + " "+t.getResponseMessage());
			}
			
			else {
				System.err.println(attribute + " "+t.getResponseMessage());

			}
		}
	}

}
