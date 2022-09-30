package Flipcart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity {
	
	
	
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
System.setProperty("webdriver.gecko.driver","C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");

	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	driver.get("https://www.flipkart.com");

	
	WebElement popup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	 popup.click();
	 
		WebElement mobile = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"));
	 mobile.click();
	 
	// Thread.sleep(3000);
	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")))
		
	 WebElement samsung = driver.findElement(By.xpath("(//div[contains(@class,'_24_Dny')])[4]"));	
	samsung.click();
	
	// Thread.sleep(3000);
	//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(4));
	//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")))
	
	 WebElement smartphone = driver.findElement(By.xpath("(//img[@height='21'])[4]"));	
	smartphone.click();
	
	ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
	//System.out.println(addr.get(1));
	driver.switchTo().window(addr.get(1));
	
	 WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));	
     addToCart.click();
     
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
