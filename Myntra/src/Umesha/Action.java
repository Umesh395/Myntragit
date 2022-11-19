package Umesha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.twitter.com/");
	
//	WebElement signUp = driver.findElement(By.xpath("//a[@href='/login']"));
	//String text = signUp.getText();
	//System.out.prin
	
	Thread.sleep(2000);
	WebElement happen = driver.findElement(By.xpath("//span[text()='Happening now']"));
	String s=happen.getText();
		System.out.println(s);
		
		
		

		
		
		
		
		
		
		
		
		
		
	}
	
	
}
