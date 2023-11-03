package mymainproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nopreggg {
	@Test
	public void TestnopregistrationForm() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//launch nopcommerce website
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(2000);
		
		//set gender
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		Thread.sleep(2000);
		//set first name
		driver.findElement(By.xpath(" //input[@id='FirstName']")).sendKeys("laane");
		Thread.sleep(2000);
		//set last name
		driver.findElement(By.xpath(" //input[@id='LastName']")).sendKeys("kills");
		Thread.sleep(2000);
		//set data of birth day
		driver.findElement(By.xpath(" //select[@name='DateOfBirthDay']")).sendKeys("25");
		Thread.sleep(2000);
		//set date of birth month
		driver.findElement(By.xpath(" //select[@name='DateOfBirthMonth']")).sendKeys("March");
		Thread.sleep(2000);
		//set date of birth year
		driver.findElement(By.xpath(" //select[@name='DateOfBirthYear']")).sendKeys("2006");
		Thread.sleep(2000);
		//set email
		driver.findElement(By.xpath(" //input[@id='Email']")).sendKeys("laanekilla@gmail.com");
		Thread.sleep(2000);
		//set company name
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("info solutions");
		Thread.sleep(2000);
		//set password
		driver.findElement(By.xpath(" //input[@id='Password']")).sendKeys("laane@123");
		Thread.sleep(2000);
		//set confirm password
		driver.findElement(By.xpath(" //input[@id='ConfirmPassword']")).sendKeys("laane@123");
		Thread.sleep(2000);
		//click function of register button
		driver.findElement(By.xpath(" //button[@id='register-button']")).click();
		Thread.sleep(2000);
		
		//driver.quit();

	}

}
