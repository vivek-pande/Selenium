package webElementsPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id=\"autosuggest\"]")).sendKeys("ind");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		System.out.println(options.size());
		for (WebElement option : options) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
			
		}

		}

	}


