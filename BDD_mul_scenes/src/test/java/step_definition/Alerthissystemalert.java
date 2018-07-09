package step_definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Alerthissystemalert  extends Abstractpagestepdefinition
{@When("^on clicking submit$")
public void on_clicking_submit()  {
   driver.findElement(By.xpath(".//*[@id='tdContents']/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td/input")).click();
	List <WebElement> list=driver.findElements(By.xpath(".//*[@id='tdContents']/table[2]/tbody/tr[2]/td/table"));

}

@Then("^all system alerts are displayed$")
public void all_system_alerts_are_displayed()  {
   
	List <WebElement> list=driver.findElements(By.xpath(".//*[@id='tdContents']/table[2]/tbody/tr[2]/td/table"));
for (WebElement row : list) {
	String s=row.getText();

if(driver.findElement(By.xpath(".//*[@id='tdContents']/table[2]/tbody/tr[2]/td/table")).isDisplayed())
{
	System.out.println("The page displays all the system alert in that date");
}

}
}
}
