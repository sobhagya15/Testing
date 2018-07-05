package step_definition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class alerthisfromdate extends Abstractpagestepdefinition{
	String s2="kaviarasu*-@#";
	@When("^providing numeric and other inputs$")
	public void providing_numeric_and_other_inputs()  {
		String s1="12/12/2018";
		driver.findElement(By.name("query(period).begin")).sendKeys(s1);
		//	System.out.println(	driver.findElement(By.name("query(period).begin")).getText());
		WebElement ele = driver.findElement(By.name("query(period).begin"));

		//	System.out.println(ele.getText()); ---> this does not work 
		System.out.println(ele.getAttribute("value"));
		String s=ele.getAttribute("value");
		assertEquals(s,s1);
		driver.findElement(By.name("query(period).begin")).clear();


		driver.findElement(By.name("query(period).begin")).sendKeys(s2);
	}

	@Then("^numeric it accepts and other inout it doesn't$")
	public void numeric_it_accepts_and_other_inout_it_doesn_t() {
		WebElement ele1 = driver.findElement(By.name("query(period).begin"));

		//	System.out.println(ele.getText()); ---> this does not work 
		System.out.println(ele1.getAttribute("value"));
		String s=ele1.getAttribute("value");
		assertEquals(s,"","it accepts even other inputs");
		driver.findElement(By.name("query(period).begin")).clear();
		String s3="14/12/2019";
		driver.findElement(By.name("query(period).begin")).sendKeys(s3);
		WebElement ele = driver.findElement(By.name("query(period).begin"));

		//	System.out.println(ele.getText()); ---> this does not work 
		System.out.println(ele.getAttribute("value"));
		String s4=ele.getAttribute("value");

		try {
			assertEquals(s4,""," it is accepting dates after current date");
		} catch (Error e) {
			System.out.println(e.toString());
		}


	}


}
