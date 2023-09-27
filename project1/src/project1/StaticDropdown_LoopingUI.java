package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdown_LoopingUI {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()=\"Passengers\"][1]")).click();
		Thread.sleep(2000L);
		int count = 3;
		for (int i = 1; i < count; i++) {
			driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
		}
	 
		System.out.println(
				driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).getText());
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();

	}

}
