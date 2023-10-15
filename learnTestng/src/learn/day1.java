package learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void last() {
		System.out.println("after test");
	}
	@BeforeSuite
	public void firstSuit() {
		System.out.println("this is before suit");
	}
	
	@Test(groups = {"Smoke"})
	public void signIn() {
		System.out.println("username");
	}

	@Test
	public void SignOut() {
		System.out.println("password");
	}
	@BeforeTest
	public void firsttest() {
		System.out.println("before test");
		
		
	}
	
	@BeforeClass
	public void bfclass() {
		System.out.println("before class");
	}
	@AfterClass
	public void afclass() {
		System.out.println("After class");
	}
	@BeforeMethod
	public void method() {
		System.out.println("before method");
	}
	@AfterMethod
	public void Amethod() {
		System.out.println("After  method");
	}
}
