package webElementsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UiElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains(".5")) {
			System.out.println("it is disabled");
			Assert.assertTrue(true);

		} else {
			System.out.println("sorry it is disabled ");
			Assert.assertTrue(false);

		}

		driver.findElement(By.id("Div1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("now it is enabled");
			Assert.assertTrue(true);

		} else {
			System.out.println("sorry it is disabled");
			Assert.assertTrue(false);

		}
	}

}
