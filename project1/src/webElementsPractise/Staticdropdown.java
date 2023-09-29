package webElementsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	WebElement currencyDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select staticDropdown = new Select(currencyDropdown);
	staticDropdown.selectByIndex(2);
	System.out.println(staticDropdown.getFirstSelectedOption().getText());
	staticDropdown.selectByVisibleText("USD");
	System.out.println((staticDropdown.getFirstSelectedOption().getText()));
	
		
	
	}

}
