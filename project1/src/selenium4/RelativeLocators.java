package selenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namefield = driver.findElement(By.xpath("//input[@name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(namefield)).getText());
		
		WebElement dob  = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		
		
	}

}
