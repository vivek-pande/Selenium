package actionClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseExcersize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()=\"Multiple Windows\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"content\"] //a[@target=\"_blank\"] ")).click();
		Set<String> screens=driver.getWindowHandles();
		Iterator<String> it =screens.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		String text =driver.findElement(By.xpath("//div/h3")).getText();
		System.out.println(text);
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@id=\"content\"] //h3 ")).getText());
				
		
		
		
		

	}

}
