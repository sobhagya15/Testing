package step_definition;


import static org.testng.Assert.assertEquals;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LocalSetingsStep {

	static WebDriver driver;

	@Given("^Fire Home Page$")
	public void fire_Home_Page() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8585/do/login");
		driver.findElement(By.xpath(".//*[@id='cyclosUsername']")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath(".//*[@id='cyclosLogin']/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(2000);

	}

	/*	@When("^Navigate to Settings and click On Local Settings$")
	public void navigate_to_Settings_and_click_On_Local_Settings()  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='menu9']/span[2]")).click();

	}

	@When("^Check Whether Local Setting page is Open$")
	public void check_Whether_Local_Setting_page_is_Open() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String expectedUrl="http://localhost:8585/do/admin/editLocalSettings?fromMenu=true";
		driver.findElement(By.xpath(".//*[@id='submenu9.0']/span[2]")).click();
		System.out.println("Test Passed:\n local page Url: "+driver.getCurrentUrl()+"  \n \t Page title: "+driver.getTitle());
		assertEquals(driver.getCurrentUrl(),expectedUrl);
		if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl()))
			System.out.println("Your on Settings--Local Settings");
		else
			System.out.println("your are some near nowhere try once"+driver.getCurrentUrl());


	}


	@When("^click on Change button$")
	public void click_on_Change_button() {
		driver.findElement(By.id("modifyButton")).click();
		String head="Internationalization";
		String headCompare=driver.findElement(By.cssSelector(".tdContentTableForms.innerBorder>fieldset:nth-child(2)>legend")).getText();
		assertEquals(headCompare, head);


	}

	@Then("^is Editalble$")
	public void is_Editalble()  {

		List<WebElement> elements=driver.findElements(By.tagName("select"));
		//String message="Not editable";
		for(int i=0;i<8;i++)
		{
			//Select value=new Select(driver.findElement(By.name("setting(language)")));
			assertEquals(elements.get(i).isEnabled(), true);
			if(elements.get(i).isEnabled())
				System.out.println("\n Test Passed: Editable of internationaliztion \n \t Textbox is Enabaled for:"+elements.get(i).getText());
			else
				System.out.println("Textbox is no Enabled");

		}

	}

	@When("^Select  values of my Interest$")
	public void select_values_of_my_Interest() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[3]/td[2]/select")).sendKeys("6");
		//driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[1]/td[2]/select")).sendKeys("German");

	}

	@Then("^Submit the Changes$")
	public void submit_the_Changes()  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("saveButton")).click();
	}


	@Then("^Check for Changes$")
	public void check_for_Changes() throws InterruptedException { 

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1300);
		//assertEquals(driver.switchTo().alert().);
		System.out.println("\n Test passed: Changes Modififed for Internationaliztion of text fields");
		driver.switchTo().alert().accept();   
	}

	@Given("^Navigate to Alert Settings$")
	public void navigate_to_Alert_Settings() throws InterruptedException  {

		driver.findElement(By.id("submenu9.1")).click();
		Thread.sleep(1300);

	}

	@When("^click on Change button inside the Alert Settings$")
	public void click_on_Change_button_inside_the_Alert_Settings() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("modifyButton")).click();
		Thread.sleep(800);
	}

	@Then("^Whether Text Fields are Editable$")
	public void whether_Text_Fields_are_Editable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		List<WebElement> tinyList=driver.findElements(By.xpath("//*[@class='tiny number InputBoxEnabled']"));
		int count=0;
		for(int i=0;i<tinyList.size();i++)
		{
			assertEquals(tinyList.get(i).isEnabled(),true);
			if(tinyList.get(i).isEnabled())
			{
				count++;
				System.out.println(tinyList.get(i).getTagName()+" --- is enabled");
			}
		}
		if(count!=tinyList.size())
			System.out.println("\n not editable");
		driver.findElement(By.cssSelector("input#modifyButton.button")).click();
		System.out.println("\n Nothing modified");
		Thread.sleep(1000);
	}

	@Given("^Navigate to Incorrect Login Text field$")
	public void navigate_to_Incorrect_Login_Text_field() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("modifyButton")).click();
		//driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
		driver.findElement(By.name("setting(amountIncorrectLogin)"));
	}



	@Given("^Give value to Invalid Login Attempts out of Range$")
	public void give_value_to_Invalid_Login_Attempts_out_of_Range() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("setting(amountIncorrectLogin)")).clear();
		driver.findElement(By.name("setting(amountIncorrectLogin)")).sendKeys("13");
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(900);

	}
	@When("^Check for Modifications in Invalid Login Attmeps value$")//Agent Admin Alert SR3
	public void check_for_Modifications_in_Invalid_Login_Attmeps_value() throws Throwable {//Checking for Alert message after the invalid Login Attempts value cahnged
		// Write code here that turns the phrase above into concrete actions
		System.out.println("\n"+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

	//Checking for the  Boundary value conditions
	@Then("^check  the value of Invalid Login Attempts$")
	public void check_the_value_of_Invalid_Login_Attempts() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		int valueOfInvalidLoginAttempts=Integer.parseInt(driver.findElement(By.name("setting(amountIncorrectLogin)")).getAttribute("value"));
		//System.out.println("Invalid of invalid attempts field:  "+valueOfInvalidLoginAttempts);
		Boolean actualValueForInvalidAttempts,expectedValueForAttempts=true;
		if(valueOfInvalidLoginAttempts>10 ||valueOfInvalidLoginAttempts<0)
		{
			System.out.println("\n Test Failed, by accepting the incorrect values for Invalid Login Attemps field \n Accepted value is: "+valueOfInvalidLoginAttempts); 
			actualValueForInvalidAttempts=false;
		}
		else
		{
			//System.out.println("\n Incorrect Login Attempts is :"+ valueOfInvalidLoginAttempts);
			actualValueForInvalidAttempts=true;
		}

		assertEquals(actualValueForInvalidAttempts,expectedValueForAttempts,"Test Failed by accepting the incorrect values for Invalid Login Attempts field ");
	}




	/*@Then("^Give value to Invalid Login Attempts with in Range$")
	public void give_value_to_Invalid_Login_Attempts_with_in_Range() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("modifyButton")).click();
		driver.findElement(By.name("setting(amountIncorrectLogin)")).clear();
		driver.findElement(By.name("setting(amountIncorrectLogin)")).sendKeys("2"); 
		driver.findElement(By.id("saveButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("Given value to Invalid Login Attempts is:"+Integer.parseInt(driver.findElement(By.name("setting(amountIncorrectLogin)")).getAttribute("value")));
//	}*/


	/*	@Given("^Give Some value to Alert Settings Filed$")
	public void give_Some_value_to_Alert_Settings_Filed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("modifyButton")).click();
		driver.findElement(By.name("setting(amountIncorrectLogin)")).clear();
		driver.findElement(By.name("setting(amountIncorrectLogin)")).sendKeys("2");
		driver.findElement(By.id("modifyButton")).click();

	}

	@Then("^check Whether Alert Settings Fields are Modified$")
	public void check_Whether_Alert_Settings_Fields_are_Modified() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("modifyButton")).click();
		driver.findElement(By.name("setting(amountIncorrectLogin)")).clear();
		driver.findElement(By.name("setting(amountIncorrectLogin)")).sendKeys("3"); 
		driver.findElement(By.id("saveButton")).click();
		String expectedMessage="Alert settings modified";
		assertEquals(driver.switchTo().alert().getText(),expectedMessage);
		driver.switchTo().alert().accept();

	}


	@Given("^Extract Login Attempts value from Incorrect Attempts field$")
	public void extract_Login_Attempts_value_from_Incorrect_Attempts_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		int valueOfInvalidLoginAttempts=Integer.parseInt(driver.findElement(By.name("setting(amountIncorrectLogin)")).getAttribute("value"));
		System.out.println("\n Current Invalid Login Attempts value: "+valueOfInvalidLoginAttempts);
		if(valueOfInvalidLoginAttempts>0 && valueOfInvalidLoginAttempts<=10)
			System.out.println("\n value within the limits specified and Current value is:"+valueOfInvalidLoginAttempts); 
		else
			System.out.println("\n Try to give value in range batween 0 and 10");
		Thread.sleep(3000);

	}

	@When("^Try to Login With Invalid Credentials$")
	public void try_to_Login_With_Invalid_Credentials() throws InterruptedException  {

		int valueOfInvalidLoginAttemps=Integer.parseInt(driver.findElement(By.name("setting(amountIncorrectLogin)")).getAttribute("value"));
		driver.findElement(By.xpath(".//*[@id='menu15']/span[2]")).click();//logout and Try fresh login
		Thread.sleep(1400);
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		//Trying with invalid login invalid credentials
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");	
		for(int i=1;i<=valueOfInvalidLoginAttemps+1;i++)
		{
			driver.findElement(By.id("cyclosPassword")).sendKeys("123");
			driver.findElement(By.className("button")).click();
			System.out.println("Attempt --- "+i);
			String actualErrorMessage=driver.findElement(By.cssSelector("td.tdContentTable.innerBorder")).getText();
			//String expectedErrorMessage="Invalid login. Please try again";
			System.out.println("Error message is:\t"+actualErrorMessage);//Capturing the value in display error box
			System.out.println("Checking the error assert");
			// assertEquals(actualErrorMessage,expectedErrorMessage);
			//System.out.println("Checking after assert");
			driver.findElement(By.xpath("//*[@id='btn']")).click();//Clicking error box
			Thread.sleep(1200);
		}
		Thread.sleep(2000);
	}

	@Then("^Check Whether Account Blocked$")
	public void check_Whether_Account_Blocked() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("cyclosPassword")).sendKeys("1234");
		driver.findElement(By.className("button")).click();
		Thread.sleep(1300);
		//Capturing the value in display error box
		String errorMessage=driver.findElement(By.cssSelector("td.tdContentTable.innerBorder")).getText();
		System.out.println("Attempt, After exceeding Invalid login limits, the error message text after exceeding the Invalid Login Attempts Limit is: \n\t " +errorMessage);
		Thread.sleep(1090);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://localhost:8585/do/error"))
			System.out.println("Oops---!,Your account is temporarily blocked \n \t Please try after 13 Minutes");
		assertEquals(driver.getCurrentUrl(), "http://localhost:8585/do/error","Failed");//Checking whether account is blocked.
	}
	 */




	//Agent Access Module
	//SR-1

	@Given("^Navigate to Agent Access$")
	public void navigate_to_Agent_Access()  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='menu9']/span[2]")).click();//Click on Settings
		driver.findElement(By.id("submenu9.2")).click();//Click on Agent Acesss

	}

	@Then("^Click on the Change Button$")
	public void click_on_the_Change_Button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("modifyButton")).click();
	}


	//Check for fields  Agent/Admin Access  Settings Editable
	@Then("^Check whehter all Fields are Editable$")
	public void check_whehter_all_Fields_are_Editable()  {
		// Write code here that turns the phrase above into concrete actions

		System.out.println(driver.findElement(By.name("setting(virtualKeyboard)")).isEnabled());
		System.out.println(driver.findElement(By.name("setting(virtualKeyboardTransactionPassword)")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(numericPassword)")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(allowMultipleLogins)")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(allowOperatorLogin)")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(adminTimeout).number")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(adminTimeout).field")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(memberTimeout).number")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(memberTimeout).field")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(poswebTimeout).number")).isEnabled());
		System.out.println(driver.findElement(By.name("setting(poswebTimeout).field")).isEnabled());  
		System.out.println(driver.findElement(By.name("setting(administrationWhitelist)")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(usernameGeneration)")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(usernameLength).min")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(usernameLength).max")).isEnabled()); 
		System.out.println(driver.findElement(By.name("setting(usernameRegex)")).isEnabled());
		System.out.println(driver.findElement(By.name("setting(transactionPasswordChars)")).isEnabled()); 
		boolean a1=	driver.findElement(By.name("setting(virtualKeyboard)")).isEnabled();
		assertEquals(a1, true);
		boolean a2	=driver.findElement(By.name("setting(virtualKeyboardTransactionPassword)")).isEnabled(); 
		assertEquals(a2, true);
		boolean a3=	driver.findElement(By.name("setting(numericPassword)")).isEnabled(); 
		assertEquals(a3, true);
		boolean a4=	driver.findElement(By.name("setting(allowMultipleLogins)")).isEnabled();
		assertEquals(a4, true);
		boolean a5=	driver.findElement(By.name("setting(allowOperatorLogin)")).isEnabled(); 
		assertEquals(a5, true);
		boolean a6=driver.findElement(By.name("setting(adminTimeout).number")).isEnabled(); 
		assertEquals(a6, true);
		boolean a7=	driver.findElement(By.name("setting(adminTimeout).field")).isEnabled(); 
		assertEquals(a7, true);
		boolean a8=	driver.findElement(By.name("setting(memberTimeout).number")).isEnabled(); 
		assertEquals(a8, true);
		boolean a9=	driver.findElement(By.name("setting(memberTimeout).field")).isEnabled(); 
		assertEquals(a9, true);
		boolean a10=driver.findElement(By.name("setting(poswebTimeout).number")).isEnabled();
		assertEquals(a10, true);
		boolean a11=driver.findElement(By.name("setting(poswebTimeout).field")).isEnabled();  
		assertEquals(a11, true);
		boolean a12=driver.findElement(By.name("setting(administrationWhitelist)")).isEnabled(); 
		assertEquals(a12, true);
		boolean a13=driver.findElement(By.name("setting(usernameGeneration)")).isEnabled(); 
		assertEquals(a13, true);
		boolean a14=driver.findElement(By.name("setting(usernameLength).min")).isEnabled(); 
		assertEquals(a14, true);
		boolean a15=driver.findElement(By.name("setting(usernameLength).max")).isEnabled(); 
		assertEquals(a15, true);
		boolean a16=driver.findElement(By.name("setting(usernameRegex)")).isEnabled();
		assertEquals(a16, true);
		boolean a17=driver.findElement(By.name("setting(transactionPasswordChars)")).isEnabled(); 
		assertEquals(a17, true);
		System.out.println("All Access Settings Fields are Editable");
		driver.findElement(By.id("saveButton")).click();
		driver.switchTo().alert().accept();
	}


	@Given("^Click on the Change Button on Acess Settings Page$")
	public void click_on_the_Change_Button_on_Acess_Settings_Page() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("modifyButton")).click();
		Thread.sleep(2000);
	}

	@Then("^Make Some  changes  to Fields$")//Writing some changes to fields
	public void make_Some_changes_to_Fields() throws Throwable {
		driver.findElement(By.name("setting(administrationWhitelist)")).clear();
		driver.findElement(By.name("setting(administrationWhitelist)")).sendKeys("I'm Groot....!");
		Thread.sleep(700);
	}

	@Then("^Check Whether the changes are Submitted with no Error$")//Submitting the changes
	public void check_Whether_the_changes_are_Submitted_with_no_Error() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage;
		Boolean actualState,expectedState=true;
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(1700);
		expectedMessage=driver.switchTo().alert().getText();
		System.out.println("\n Test:Passed"+expectedMessage);
		
		if(expectedMessage==null)
			actualState=false;
		else
			actualState=true;
		driver.switchTo().alert().accept();
		assertEquals(actualState,expectedState,"No Modifications Done");
		driver.navigate().back();
	}

//Administrator Session Automatically Logout
	
	@Given("^Nagive to Acess Settings$")
	public void nagive_to_Acess_Settings() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submenu9.2")).click();
	}

	@Then("^Extract the Admin\\. Session Logout Value$")
	public void extract_the_Admin_Session_Logout_Value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//List<WebElement> adminLogoutSessionList=driver.findElements(By.id());
		System.out.println("The logout time is ; "+driver.findElement(By.name("setting(adminTimeout)")));
	}

	@Then("^Check Whether the Admin\\. Session Logout Automatically$")
	public void check_Whether_the_Admin_Session_Logout_Automatically() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

}