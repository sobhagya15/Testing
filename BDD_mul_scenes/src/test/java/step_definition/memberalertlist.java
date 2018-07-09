package step_definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class memberalertlist extends Abstractpagestepdefinition{
WebDriver driver=getDriver();

@When("^click on member alerts$")
public void click_on_member_alerts()
{ driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/ul/li[3]/ul/li[2]/span[2]")).click();

	
}
  


@Then("^displays all the temporarily blocked members$")
public void displays_all_the_temporarily_blocked_members()  {
	List <WebElement> list=driver.findElements(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[1]/tbody/tr[2]/td"));
for (WebElement row : list) {
	String s=row.getText();
    System.out.println(s);
    if(driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[1]/tbody/tr[2]/td")).isDisplayed())
    {
    	System.out.println("all bocked members are displayed");
    }

   
	
}
}}