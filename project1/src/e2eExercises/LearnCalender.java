package e2eExercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.trivago.in/");

		driver.findElement(By.xpath("//button[@data-testid=\"search-form-calendar-checkin\"]")).click();
		// 23 October 2024

		String desiredMonth = "September";
		String desireddate="23";

		// to0 select month
		while (!driver.findElement(By.xpath(
				"(//div[@class=\"text-center\"] //h3[@class=\"text-heading-s font-bold mx-3 pb-3 font-bold\"])[1]"))
				.getText().contains(desiredMonth)) {
			Thread.sleep(1000);
			System.out.println(driver.findElement(By.xpath(
					"(//div[@class=\"text-center\"] //h3[@class=\"text-heading-s font-bold mx-3 pb-3 font-bold\"])[1]"))
					.getText());
			driver.findElement(By.xpath("//button[@data-testid=\"calendar-button-next\"]")).click();
		}

		
		
		// to select date
		List<WebElement> days = driver
				.findElements(By.xpath("//time[@class=\"flex justify-center items-center text-m h-9 w-9\"]"));

		for (WebElement day : days) {
			if (day.getText().equalsIgnoreCase(desireddate)) {
				System.out.println(day.getText());
				day.click();
				break;

			}

		}

	}

}
