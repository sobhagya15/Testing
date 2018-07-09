package step_definition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertHistorydropdown extends Abstractpagestepdefinition {
	int j;
	WebElement e;

	@When("^click on type icon$")
	public void click_on_type_icon() {
		driver.findElement(By.xpath(".//*[@id='submenu2.2']/span[2]")).click();
		e = driver.findElement(By.xpath(".//*[@id='typeSelect']"));

	}

	@Then("^shows list values as System and member$")
	public void shows_list_values_as_System_and_member() {

		Select s1 = new Select(e);
		List<WebElement> l1 = s1.getOptions();
		WebElement e;
		
boolean b;

		System.out.println(l1.get(0).getText());
		e = l1.get(0);
		b = e.isDisplayed();
		assertEquals(b, true, " system is not diplayed");
		s1.selectByIndex(1);
		e = l1.get(1);
		b = e.isDisplayed();
		assertEquals(b, true, " member is not diplayed");
s1.selectByIndex(0);
	}
}

