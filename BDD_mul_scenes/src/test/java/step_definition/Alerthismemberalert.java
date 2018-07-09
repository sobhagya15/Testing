package step_definition;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Alerthismemberalert extends Abstractpagestepdefinition

{
	@When("^on clicking submit button$")
	public void on_clicking_submit_button()
	
	{
	WebElement e1=driver.findElement(By.xpath(".//*[@id='typeSelect']"));
	Select s=new Select(e1);
	s.selectByIndex(1);
   driver.findElement(By.xpath(".//*[@id='tdContents']/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td/input")).click();
		

	}

	@Then("^all member alerts are displayed$")
	public void all_member_alerts_are_displayed()  {
		List <WebElement> list=driver.findElements(By.xpath(".//*[@id='tdContents']/table[2]/tbody/tr[2]/td/table"));
		for (WebElement row : list) {
			String s=row.getText();

		if(driver.findElement(By.xpath(".//*[@id='tdContents']/table[2]/tbody/tr[2]/td/table")).isDisplayed())
		{
			System.out.println("The page displays all the member alerts in that date");
		}

	   
	}

	}}
