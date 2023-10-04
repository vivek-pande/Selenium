package e2eExercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollinTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=1000");
		
		int sum  =0;
		List<WebElement> numbers = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"] //td[4]"));
		for (WebElement number : numbers) {
		sum = sum +Integer.parseInt(number.getText());	
			
		}
		System.out.println(sum);

		int expectedSum = Integer.parseInt(driver.findElement(By.xpath("//div[@class=\"totalAmount\"]")).getText().split(":")[1].trim());
		System.out.println(expectedSum);
		Assert.assertEquals(sum, expectedSum);
		

	}

}