package stramsAndlamda;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practise1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		
		driver.findElement(By.xpath("//span[@class=\"sort-icon sort-descending\"]")).click();
		
		List<WebElement> fruitName = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		List<String> sortedFruitName = fruitName.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
		List<String> unsortedFruitName = fruitName.stream().map(s -> s.getText()).collect(Collectors.toList()); 

		Assert.assertTrue(sortedFruitName.equals(unsortedFruitName));

	}

}
