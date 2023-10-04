package e2eExercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercize2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(1000);
		Actions action = new Actions(driver);

		List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"] /li"));
		for (WebElement item : searchResult) {
			System.out.println(item.getText());
			if (item.getText().equalsIgnoreCase("india")) {
//				item.click();
				action.moveToElement(item).click().build().perform();

				break;

			}

		}

	}

}
