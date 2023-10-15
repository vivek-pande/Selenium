package learn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void mpin() {
		System.out.println("1234 ");
	}
	@Parameters({"url","username"})
	@Test(groups = {"Smoke"})
	public void resetMpin(String url,String username) {
		System.out.println("reset to 1243");
		System.out.println(url);
		System.out.println(username);
	}
}
