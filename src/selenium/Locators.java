package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\F:\\Chrome Browser\\Chrome\\chromedriver.exe\\");
		WebDriver obj = new ChromeDriver();
		
		obj.get("https://www.amazon.com/");
		obj.manage().window().maximize();
		Thread.sleep(2000);
		obj.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(2000);
		obj.findElement(By.id("createAccountSubmit")).click();
		Thread.sleep(2000);
		obj.findElement(By.id("ap_customer_name")).sendKeys("Manisha Saste");
		Thread.sleep(2000);
		obj.findElement(By.id("ap_email")).sendKeys("manisha.saste123@gmail.com");
		Thread.sleep(2000);
		obj.findElement(By.id("ap_password")).sendKeys("Manisha@123");
		obj.findElement(By.id("ap_password_check")).sendKeys("Manisha@123");
		obj.findElement(By.id("continue")).click();
		
		
		
		
	}

}
