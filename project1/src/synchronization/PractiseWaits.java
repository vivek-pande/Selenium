package synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseWaits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<String> neededItems = Arrays.asList("Brocolli - 1 Kg", "Cucumber - 1 Kg", "Carrot - 1 Kg",
				"Beetroot - 1 Kg");
		addItems(driver, neededItems);

		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//div[@class=\"cart-preview active\"] //button[@type=\"button\"]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div/button[@class=\"promoBtn\"]")).click();
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[@class=\"promoInfo\"]")));

		System.out.println(driver.findElement(By.xpath("//div/span[@class=\"promoInfo\"]")).getText());

	}

	public static void addItems(WebDriver driver, List<String> neededItems) {

		System.out.println(neededItems.size());
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (neededItems.contains(name)) {
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
				j++;
				if (j == neededItems.size()) {
					break;
				}
			}

		}

	}

}
