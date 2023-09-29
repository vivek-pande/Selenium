package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LearnLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		 * The Implicit Wait in Selenium is used to tell the web driver to wait for a
		 * certain amount of time before it throws a “No Such Element Exception”. The
		 * default setting is 0. Once we set the time, the web driver will wait for the
		 * element for that time before throwing an exception.
		 */

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name= "vivek";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("abcd");
		driver.findElement(By.className("signInBtn")).click();
		// String errorMessage =
		// driver.findElement(By.cssSelector("p.error")).getText();
		// String errorMessage = driver.findElement(By.className("error")).getText();
		String errorMessage = driver.findElement(By.cssSelector("p[class=\"error\"]")).getText();
		System.out.println(errorMessage);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("vivek pandey");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("vffivek@gmail.com");
		// driver.findElement(By.cssSelector("input[placeholder=\"Phone
		// Number\"]")).sendKeys("701122189");
		// driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("4984794");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("4984794453");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(1000);
		String passwordLine = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String password = passwordLine.split("'")[1];
		System.out.println("password is " + " :" + password);

		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder*=User]")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder*=Pass]")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("h2")).getText() + " "
				+ driver.findElement(By.cssSelector("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

}
