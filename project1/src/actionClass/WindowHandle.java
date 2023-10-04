package actionClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
	    Set<String> windows	=driver.getWindowHandles();
	     Iterator<String> it =windows.iterator();
	     String parentId = it.next();
	     String childid = it.next();
	     
	     System.out.println(parentId +" "+ childid);
	     driver.switchTo().window(childid);
	    String email  =driver.findElement(By.xpath("//p[@class=\"im-para red\"] //a")).getText();
	    driver.switchTo().window(parentId);
	    driver.findElement(By.id("username")).sendKeys(email);
	    
	     
	}

}
