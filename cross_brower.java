package gurubank99;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cross_brower {
	public static void main(String[] args) {
		ChromeDriver f = new ChromeDriver();
		f.get("https://www.amazon.in/");
		EdgeDriver g = new EdgeDriver();
		g.get("https://www.flipkart.com/");
		
		
	}

}
