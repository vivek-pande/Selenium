package e2eExercises;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CountOfLinksInThePage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// count the links available on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		Assert.assertEquals(driver.findElements(By.tagName("a")).size(), 27);

		// counts the links available on the footer
		System.out.println(driver.findElements(By.xpath("//div[@id=\"gf-BIG\"] //a")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//div[@id=\"gf-BIG\"] //a")).size(), 20);

		// count the links available on the footer first column link
		WebElement columndriver = driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// click on the each link of the page & check it is opening or not
		List<WebElement> links = columndriver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			// System.out.println(link.getText());
			// Actions action = new Actions(driver);
			// action.moveToElement(link).keyDown(Keys.CONTROL).click().build().perform();

			String openInAnotherTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			link.sendKeys(openInAnotherTab);
			

		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			Thread.sleep(5000);
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	


	}

}
