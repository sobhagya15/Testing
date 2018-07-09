package step_definition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileTest {
	
	public static WebDriver driver = new FirefoxDriver();
	@Given("^Cyclos Application$")
	public void cyclos_Application()  {
	    
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8585/do/login");
		
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("//input[@value='4']")).click();
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		driver.findElement(By.id("menu1")).click();
		driver.findElement(By.id("submenu1.0")).click();
		
		

	}

	@When("^Valid Credentials Entered$")
	public void valid_Credentials_Entered()  {
	    
		driver.findElement(By.name("admin(group).name")).sendKeys("System administrators");
		driver.findElement(By.name("admin(user).username")).sendKeys("admin");
		driver.findElement(By.name("admin(name)")).sendKeys("Administrator");
		driver.findElement(By.name("admin(email)")).sendKeys("admin@mail.nl");
	    
	}

	@SuppressWarnings("static-access")
	@When("^Clicking on Change button$")
	public void clicking_on_Change_button()  {
		
		driver.findElement(By.id("modifyButton")).click();
		driver.findElement(By.id("modifyButton")).getText().format("Cancel", "Change");
		WebElement we = driver.findElement(By.name("admin(name)"));
		String r = we.getAttribute("readonly");
		Assert.assertNull(r);
		WebElement ew = driver.findElement(By.name("admin(email)"));
		String s = ew.getAttribute("readonly");
		Assert.assertNull(s);
	    
	}

	@Then("^Submit button will be highlighted$")
	public void submit_button_will_be_highlighted()  {
	    
		driver.findElement(By.id("saveButton")).isEnabled();
	}
	
	@When("^Clicking on submit button$")
	public void clicking_on_submit_button() throws InterruptedException  {
	 
		driver.findElement(By.id("saveButton")).click();
		
		 Alert a = driver.switchTo().alert();
		 String s =  a.getText();
		 String e = "Successfully Updated";
		
		
		if(e.equals(s)) {
			System.out.println("Requirement Matched");
		}
		else {
			System.out.println("Requirement didn't Match");
		}
		Thread.sleep(2000);
		a.accept();
	}

	@Then("^Display Message$")
	public void display_Message()  {
	    
		System.out.println("Alert Message Displayed");
		WebElement we = driver.findElement(By.id("saveButton"));
		boolean av = we.isEnabled();
		
		if(av) {
			
			System.out.println("Button Enabled");
		
		}
		else {
			System.out.println("Button Disabled");
		}
		driver.findElement(By.id("modifyButton")).click();
	}

	@SuppressWarnings("static-access")
	@When("^Clicking on cancel button$")
	public void clicking_on_cancel_button()  {
		
		
		driver.findElement(By.id("modifyButton")).getText().format("Cancel", "Change");
		WebElement we = driver.findElement(By.id("saveButton"));
		boolean av = we.isEnabled();
		
		if(av) {
			
			System.out.println("Button Enabled");
		
		}
		else {
			System.out.println("Button Disabled");
		}		
		driver.findElement(By.id("modifyButton")).click();
		driver.findElement(By.id("modifyButton")).getText().format("Change", "Cancel");
	   	}

	@Then("^Submit button disabled$")
	public void submit_button_disabled()  {
		
		
		WebElement we = driver.findElement(By.id("saveButton"));
		boolean av = we.isEnabled();
		
		if(av) {
			
			System.out.println("Button Enabled");
		}
		else
			System.out.println("Button Diasbled");
		
		
	    }
	@When("^Passing Valid Credentials$")
	public void passing_Valid_Credentials()  {
	   driver.findElement(By.id("submenu1.1")).click();
	   driver.findElement(By.name("oldPassword")).sendKeys("1234");
	}

	@When("^Text message for password written$")
	public void text_message_for_password_written()  {
		String s = driver.findElement(By.xpath("//*[@id='changePasswordForm']/table/tbody/tr[2]/td/table/tbody/tr[1]/td")).getText();
		String a = "Choose a password with a length between 4 and 12 characters";
		
		if(s.equals(a)) {
			System.out.println("Text Matched");
		}
		else {
			System.out.println("Text didn't match");
		}
	    
	}

	@When("^Entering new credentials$")
	public void entering_new_credentials()  {
	    driver.findElement(By.name("newPassword")).sendKeys("4321");
	    driver.findElement(By.name("newPasswordConfirmation")).sendKeys("4321");
	    
	    driver.findElement(By.className("button")).click();
	}

	@Then("^Pop-Up shows credentials updated$")
	public void pop_Up_shows_credentials_updated() throws InterruptedException  {
		
		Alert a = driver.switchTo().alert();
		 String s =  a.getText();
		 String e = "New Password is Saved";
		
		
		if(e.equals(s)) {
			System.out.println("Requirement Matched");
		}
		else {
			System.out.println("Requirement didn't Match");
		}
		Thread.sleep(2000);
		a.accept();
		
		   driver.findElement(By.id("submenu1.1")).click();
		   driver.findElement(By.name("oldPassword")).sendKeys("4321");
		   driver.findElement(By.name("newPassword")).sendKeys("1234");
		   driver.findElement(By.name("newPasswordConfirmation")).sendKeys("1234");
		   
		   driver.findElement(By.className("button")).click(); 
		   
		   Alert b = driver.switchTo().alert();
		   Thread.sleep(2000);
		   b.accept();
		   

	    
	}

	

	}


