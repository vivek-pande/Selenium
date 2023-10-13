package selenium4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMulipleWindows {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// change window tab
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com/");
		String name = driver.findElement(By.xpath("(//div/h2/a)[1]")).getText();
		driver.switchTo().window(parentid);

		//screenshot
		WebElement namefield =driver.findElement(By.xpath("//input[@name='name']"));
		namefield.sendKeys(name);
		File file =namefield.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		//get height & width
		System.out.println(namefield.getRect().getDimension().getHeight());
		System.out.println(namefield.getRect().getDimension().getWidth());
//		driver.close();
		driver.quit();

	}
}
