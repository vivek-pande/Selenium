package webElementsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PractiseExercize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("sujeet");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("sujeet@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("password1");
		Assert.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());
		driver.findElement(By.id("exampleCheck1")).click();
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());

		Select genderDropdown = new Select(driver.findElement(By.cssSelector("select#exampleFormControlSelect1")));
		genderDropdown.selectByVisibleText("Male");
		System.out.println(genderDropdown.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input#inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("20-09-1996");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div/strong")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/strong")).getText(),
				"Success!");

	}

}
