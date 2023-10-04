package Miscellaneous;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteSessionCookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		///not working for nownow

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addExtensions(new File("./Extensions/SelectorHub.crx"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://nownowpay.com.ng/#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='User Name'])[1]")).sendKeys("vivek");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pandey033@");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		driver.findElement(By.xpath("//input[@name='otpLogin']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(3000);
//		driver.manage().deleteCookieNamed("JSESSIONID");
//		driver.manage().deleteCookieNamed("_ctuid");
//		driver.manage().deleteCookieNamed("expire");
		
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Service Group Management']")).click();

		

	}

}
