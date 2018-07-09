package step_definition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Memberalertdeselection extends Abstractpagestepdefinition {
WebDriver driver=getDriver();
@When("^click on select none$")
public void click_on_select_none() {
  driver.findElement(By.xpath("//*[@id='selectNoneButton']")).click(); 
}

@Then("^all events are deselected$")
public void all_events_are_deselected()  {
	boolean ee;
	List<WebElement>list=driver.findElements(By.xpath("//*[@type='checkbox']"));
	int i=list.size(); 
	for(int j=0;j<=1;j++)
	{
	ee=list.get(j).isSelected();
	assertEquals(ee,false,"even after clicking selectnone it is selected");

}
	}}