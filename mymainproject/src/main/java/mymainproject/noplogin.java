package mymainproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class noplogin {
	@Test
	public void TestNopcmrceLogin() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		Thread.sleep(2000);

		//enter username
		driver.findElement(By.xpath(" //input[@id='Email']")).sendKeys("laanekilla@gmail.com");
		Thread.sleep(2000);
		//enter password
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("laane@123");
		Thread.sleep(2000);
		//clicking login button
		driver.findElement(By.xpath(" //button[normalize-space()='Log in']")).click();
		Thread.sleep(2000);
		//driver.quit();

}
}
