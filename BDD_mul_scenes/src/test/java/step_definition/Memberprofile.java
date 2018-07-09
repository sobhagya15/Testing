package step_definition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Memberprofile extends Abstractpagestepdefinition {
WebDriver driver=getDriver(); String s1;
@When("^click on some member$")
public void click_on_some_member()  {
s1=	driver.findElement(By.linkText("qazi")).getText();
	
}

@Then("^member profile page opens$")
public void member_profile_page_opens() {
	driver.findElement(By.linkText("qazi")).click();
	System.out.println(driver.getCurrentUrl());
String s=	driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")).getAttribute("value");

assertEquals(s,s1,"not the user profile");
}

}

