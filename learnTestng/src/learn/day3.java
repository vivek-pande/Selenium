package learn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(dependsOnMethods = {"websignin"})
	public void logout() {
		System.out.println("vivek");
	}

	@Test(groups = {"Smoke"})
	public void webLogout() {
		System.out.println("vpandey1");
	}
	@Test(dataProvider ="getData")
	public void webLogin(String firstname , String lastname) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println("vpandey2");
	}
	@Test
	public void websignin() {
		System.out.println("vpandey3");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]= "vivek";
		data[0][1]="pandey";
		data[1][0]="sujeet"	;
		data[1][1]="singh";
		data[2][0]="vishal";
		data[2][1]="rana";
		return data;
	}
	 
}
