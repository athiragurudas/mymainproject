package mymainproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blacedemo {
	@Test
	public void blacedemoflightchart() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://blazedemo.com/index.php");
		Thread.sleep(2000);
		//set departure city
		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Paris");
		Thread.sleep(2000);
		//set destination city
		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("Rome");
		Thread.sleep(2000);
		//click function of find flight button
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(2000);
	}

}
