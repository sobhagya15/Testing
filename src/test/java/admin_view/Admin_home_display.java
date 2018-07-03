package admin_view;

import static org.testng.Assert.assertEquals;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Admin_home_display {
	public WebDriver driver;
	@Given("^I want to test the cyclos application$")
	public void i_want_to_test_the_cyclos_application() {
	    // Write code here that turns the phrase above into concrete actions
	   driver=new FirefoxDriver();
	   driver.get("http://localhost:8585/do/login");
	}

	@When("^i provide the credentials$")
	public void i_provide_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[2]")).click();
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[3]")).click();
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[4]")).click();
		
	  
	}

	@When("^click on submit button$")
	public void click_on_submit_button()   {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();
	     
	}

	@Then("^I will move to admin homepage$")
	public void i_will_move_to_admin_homepage()   {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(driver.getCurrentUrl(),"http://localhost:8585/do/admin/home");
		System.out.println("admin login successful");
		
	     }
	@When("^admin page is displayed$")
	public void admin_page_is_displayed()  {
	    // Write code here that turns the phrase above into concrete actions
		
	  
	}

	@Then("^check application uptime displays in days and hour format$")
	public void check_application_uptime_displays_in_days_and_hour_format()   {
	    // Write code here that turns the phrase above into concrete actions
		//String uptime=driver.findElement(By.id("uptime")).getText();
		//System.out.println("Application uptime "+uptime);
		System.out.println("Application uptime "+driver.findElement(By.xpath(".//*[@id='uptime']")).getText());

	     
	}

	@Then("^display number of unread messages$")
	public void display_number_of_unread_messages()   {
	    // Write code here that turns the phrase above into concrete actions
		String unreadMassege=driver.findElement(By.id("unreadMessages")).getText();
		System.out.println("unread Massege "+unreadMassege);

	     
	}

	@Then("^display number of connected admin$")
	public void display_number_of_connected_admin()   {
	    // Write code here that turns the phrase above into concrete actions

        System.out.println("connected Admins "+driver.findElement(By.id("connectedAdmins")).getText());
        
	     
	}

	@Then("^display number of connected members$")
	public void display_number_of_connected_members()   {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("connected Members "+driver.findElement(By.id("connectedMembers")).getText());

	     
	}

	@Then("^display number of system alerts$")
	public void display_number_of_system_alerts()   {
	    // Write code here that turns the phrase above into concrete actions

        System.out.println("No of system Alerts "+driver.findElement(By.id("systemAlerts")).getText());
	     
	}

	@Then("^display number of temporarily blocked users$")
	public void display_number_of_temporarily_blocked_users()   {
	    // Write code here that turns the phrase above into concrete actions

        System.out.println("No of member blocked " +driver.findElement(By.id("memberAlerts")).getText());
        System.out.println("No of errors "+driver.findElement(By.id("errors")).getText());

	}

	@Then("^check the refresh button$")
	public void check_the_refresh_button()   {
	    // Write code here that turns the phrase above into concrete actions
	     
	}



}
