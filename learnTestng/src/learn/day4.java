package learn;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	
	@AfterSuite
	public void lastSuit() {
		System.out.println("this is last suit");
	}
	
	@Test(enabled = false)
	public void login() {
		System.out.println("enter login details enabled = false");
	}

	@Test(groups = {"Smoke"},timeOut = 4000 )
	public void webLogin() {
		System.out.println("enter web login details");
	}
	@BeforeSuite
	public void firstSuit() {
		System.out.println("this is before suit");
	}
}
