package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("vivek");
		driver.findElement(By.name("inputPassword")).sendKeys("abcd");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
//		String errorMessage =  driver.findElement(By.cssSelector("p.error")).getText();
//		String errorMessage = driver.findElement(By.className("error")).getText();
		String errorMessage = driver.findElement(By.cssSelector("p[class=\"error\"]")).getText();
		System.out.println(errorMessage);
		driver.findElement(By.)


	}

}
