package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions action = new Actions(driver);
		WebElement dragItem = driver.findElement(By.id("draggable"));
		WebElement dropLocation = driver.findElement(By.id("droppable"));
		action.dragAndDrop(dragItem, dropLocation).build().perform();
		driver.switchTo().defaultContent();

	}

}
