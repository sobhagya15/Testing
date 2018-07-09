package step_definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.io.xml.DomDriver;

public class Systemalertlist extends Abstractpagestepdefinition {
	WebDriver  driver=getDriver();
/*	@Given("^online banking app$")
	public void online_banking_app()  {
		
    	driver.get("http://localhost:8585/do/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		driver.findElement(By.id("cyclosPassword")).sendKeys("1234");
		driver.findElement(By.xpath(".//*[@id='cyclosLogin']/table/tbody/tr[3]/td/input")).click();
		driver.findElement(By.xpath(".//*[@id='menu2']/span[2]")).click();

	}
*/
	@When("^we click on system alert$")
	public void we_click_on_system_alert()  {
		driver.findElement(By.xpath(".//*[@id='submenu2.0']/span[2]")).click();
		
		
	}

	@Then("^page displays all the server events with the date of events generated$")
	public void page_displays_all_the_server_events_with_the_date_of_events_generated() {
	//	WebElement table = driver.findElement(By.xpath(".//*[@id='tdContents']/form/table[1]"));
		/*List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println("Total Number of Rows = " + row.size());
		for(int i=2;i<row.size();i++)
		{
			WebElement tele = driver.findElement(By.xpath(".//*[@id='tdContents']/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]"));
			String g=tele.getText();
			System.out.println(g);
		}*/
	//System.out.println(driver.findElement(By.className("checkbox")).getAttribute("value"));
	List <WebElement> list=driver.findElements(By.xpath(".//*[@id='tdContents']/form/table[1]"));
for (WebElement row : list) {
	String s=row.getText();
    System.out.println(s);
if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table[1]")).isDisplayed())
{
	System.out.println("The page displays all the server events with the date of events generated");
}

}
}}
