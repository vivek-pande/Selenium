package e2eExercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int columnSize =driver.findElements(By.xpath("//div[@class=\"left-align\"] //table[@id=\"product\"] //tr")).size();
		int rowSize = driver.findElements(By.xpath("//div[@class=\"left-align\"] //tr/th")).size();
		List<WebElement> ThirdRow =driver.findElements(By.xpath("//div[@class=\"left-align\"]//tr[3]"));
		String row ="";
		for (WebElement element : ThirdRow) {
			row = row.concat(element.getText()+" : ");
			
		}
		System.out.println(columnSize);
		System.out.println(rowSize);
		System.out.println(row );

	}

}
