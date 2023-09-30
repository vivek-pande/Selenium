package webElementsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isSelected());

		Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size(),6);

	}

}
