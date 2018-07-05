package step_definition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Alrerthiskeyinput extends Abstractpagestepdefinition {
boolean b,b1;
@When("^providing date to from and todate field from keyboard$")
public void providing_date_to_from_and_todate_field_from_keyboard()  {
	driver.findElement(By.name("query(period).begin")).clear();
	driver.findElement(By.name("query(period).end")).clear();
	String s1="12/12/2017";
	driver.findElement(By.name("query(period).begin")).sendKeys(s1);
	//	System.out.println(	driver.findElement(By.name("query(period).begin")).getText());
	WebElement ele = driver.findElement(By.name("query(period).begin"));

	//	System.out.println(ele.getText()); ---> this does not work 
	System.out.println(ele.getAttribute("value"));
	String s=ele.getAttribute("value");
	assertEquals(s,s1);
	String s11="12/12/2018";
	driver.findElement(By.name("query(period).end")).sendKeys(s11);
//System.out.println(	driver.findElement(By.name("query(period).begin")).getText());
	WebElement ele1 = driver.findElement(By.name("query(period).end"));

//	System.out.println(ele.getText()); ---> this does not work 
	System.out.println(ele1.getAttribute("value"));
	String s12=ele1.getAttribute("value");
	assertEquals(s12,s11,"");
}

@Then("^the input should be displayed in the  text field$")
public void the_input_should_be_displayed_in_the_text_field() {
	System.out.println("it takes input from keyboard");
}
	
}
