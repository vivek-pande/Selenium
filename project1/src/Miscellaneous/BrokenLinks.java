package Miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a = new SoftAssert();

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		List<WebElement> links = footerDriver.findElements(By.tagName("a"));
		for (WebElement link : links) {
//			System.out.println(link.getAttribute("href"));
			HttpURLConnection connection = (HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode = connection.getResponseCode();
			System.out.println(responseCode);
			System.out.println(link.getAttribute("href") + ":" + connection.getResponseCode());
			a.assertTrue(responseCode < 400, link.getText() + " has failed with response code " + responseCode);

		}
		a.assertAll();

	}

}
