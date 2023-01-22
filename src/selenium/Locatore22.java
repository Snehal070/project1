package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatore22 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Browser\\Chrome\\chromedriver.exe");
		
		WebDriver driver=  new ChromeDriver();

		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.className("_1_3w1N")).click();
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("snehal.saste123@gmail.com");
}
}
