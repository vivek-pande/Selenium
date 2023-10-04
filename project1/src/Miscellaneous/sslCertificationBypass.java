package Miscellaneous;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslCertificationBypass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addExtensions(new File("./Extensions/SelectorHub.crx"));

		// block pop ups
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.getTitle());

	}

}
