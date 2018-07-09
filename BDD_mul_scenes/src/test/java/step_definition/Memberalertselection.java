package step_definition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Memberalertselection extends Abstractpagestepdefinition {
	WebDriver driver=getDriver();int s=1;
	@When("^click on select all$")
	public void click_on_select_all()  {
		
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[2]/tbody/tr/td[1]/input[1]")).click();
	}

	@Then("^all events are selected$")
	public void all_events_are_selected()  {
	boolean ee;
	List <WebElement> list=driver.findElements(By.xpath("//*[@type='checkbox']"));
 
for(int j=0;j<list.size();j++)
{
ee=list.get(j).isSelected();
assertEquals(ee,true,"not selected");
	
}
}

}

