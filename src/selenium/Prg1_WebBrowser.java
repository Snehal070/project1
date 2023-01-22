package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg1_WebBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Browser\\Chrome\\chromedriver.exe");
		
		WebDriver driver=  new ChromeDriver();

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension s=new Dimension(200,300);
		driver.manage().window().setSize(s);
		Point p =new Point(200,300);
				driver.manage().window().setPosition(p);
		

	}
}
