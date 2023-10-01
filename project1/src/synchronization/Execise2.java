package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Execise2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//label/span[@class=\"checkmark\"])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@class=\"form-control\"]")));
		dropDown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> products = driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]"));
		
		for (WebElement product : products) {
			product.click();
			
		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		

	}

}
