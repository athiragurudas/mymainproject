package mymainprojecttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	@Test
	public void searchitems() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		Thread.sleep(2000);

		driver.findElement(By.xpath(" //input[@id='small-searchterms']")).sendKeys("nokia lumia 1020");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		
		
		
	}

}
