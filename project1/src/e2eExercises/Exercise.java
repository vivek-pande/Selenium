package e2eExercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();

		String value = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println(value);

		driver.findElement(By.id("dropdown-class-example")).click();
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(value);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		if(driver.switchTo().alert().getText().contains(value)) {
			System.out.println("your code is correct");
			driver.switchTo().alert().accept();
		}
//		

	}
}
