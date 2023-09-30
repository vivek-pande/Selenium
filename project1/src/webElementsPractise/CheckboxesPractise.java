package webElementsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());

		
		//countNumber of check boxes
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());


		
		

	}

}
