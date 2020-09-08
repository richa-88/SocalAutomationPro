package dummypck;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		/*
		 * driver.get("https://www.socalgas.com/"); driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//button[@class='close']")).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); WebElement
		 * Enter_text = driver.findElement(By.xpath("//input[@id='searchHeader']"));
		 * Enter_text.sendKeys("ways to pay"); Enter_text.submit();
		 */

		driver.get("https://www.socalgas.com/pay-bill/ways-to-pay/payment-locations");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@class='close']")).click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// enter "Denver, CO" as search terms
		WebElement input = driver.findElement(By.id("socalmaps-search-value"));
		input.sendKeys("California, USA");
		input.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.quit();
	    
	}

}
