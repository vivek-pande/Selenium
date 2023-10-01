package functionalTesting;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);

		List<String> neededItems = Arrays.asList("Brocolli - 1 Kg", "Cucumber - 1 Kg", "Carrot - 1 Kg",
				"Beetroot - 1 Kg");

		System.out.println(neededItems.size());
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
//			System.out.println(i);
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
