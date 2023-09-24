package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		/*
		 * The Implicit Wait in Selenium is used to tell the web driver to wait for a
		 * certain amount of time before it throws a “No Such Element Exception”. The
		 * default setting is 0. Once we set the time, the web driver will wait for the
		 * element for that time before throwing an exception.
		 */

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("vivek");
		driver.findElement(By.name("inputPassword")).sendKeys("abcd");
		driver.findElement(By.className("signInBtn")).click();
//		String errorMessage =  driver.findElement(By.cssSelector("p.error")).getText();
//		String errorMessage = driver.findElement(By.className("error")).getText();
		String errorMessage = driver.findElement(By.cssSelector("p[class=\"error\"]")).getText();
		System.out.println(errorMessage);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("vivek pandey");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("vffivek@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder=\"Phone Number\"]")).sendKeys("701122189");
		

	}

}
