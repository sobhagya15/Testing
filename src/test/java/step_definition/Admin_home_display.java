package step_definition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Admin_home_display {
	public static WebDriver driver;
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
		driver.findElement(By.cssSelector(".button[value=Submit]")).click();

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

	//Entering user name

	@Given("^Admin homepage$")
	public void admin_homepage()  {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I enter member username$")
	public void i_enter_member_username() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("memberUsername")).sendKeys("saanvi");
		System.out.println("member username accepted");
		Thread.sleep(2000);


	}

	@Then("^i will move to change login password details can modify the member details$")
	public void i_will_move_to_change_login_password_details_can_modify_the_member_details() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions

		//driver.findElement(By.xpath(".//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr[1]/td[2]/input")).click();
		//driver.findElement(By.cssSelector(".linkButton[linkurl*=managePasswords]")).click();
		driver.findElement(By.xpath(".//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr[1]/td[2]/input")).click();
		Thread.sleep(2000);

		System.out.println("Checking changing password");
		driver.findElement(By.xpath(".//*[@id='changePasswordForm']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("12345");;
		driver.findElement(By.xpath(".//*[@id='changePasswordForm']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='changePasswordForm']/table/tbody/tr[2]/td/table/tbody/tr[5]/td/input")).click();
		String passchaForMem= driver.switchTo().alert().getText();
		assertEquals(passchaForMem, "The password was modified");
		System.out.println("password is modifed");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

	@Given("^back button and mover to admin home page$")
	public void back_button_and_mover_to_admin_home_page() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		driver.navigate().back();
		System.out.println("Back to admin homepage");
		Thread.sleep(2000);
	}
	@When("^i click on change group submit button$")
	public void i_click_on_change_group_submit_button()  {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.cssSelector("input[linkurl*='changeMemberGroup']")).click();
		System.out.println("Change member group's submit button clicked");
	}

	@Then("^Checking the change group functionality$")
	public void checking_the_change_group_functionality() throws InterruptedException  {
		String InputComment="welcome to the section show are are you apply or not if yes ignore if not please apply";

		// Write code here that turns the phrase above into concrete actions
		Select group=new Select(driver.findElement(By.name("newGroupId")));
		group.selectByIndex(5);

		//checking comments requirements
		System.out.println("Checking comment should not be more than 40 characters");
		driver.findElement(By.xpath("//*[@id='comments']")).sendKeys(InputComment);
		String comment=driver.findElement(By.id("comments")).getAttribute("value");
		int length=comment.length();
		if(length>40)
			try
		{assertEquals(length, 40);
		}
		catch(Error e){
			System.out.println(e.toString());
		}
		//checking history tab
		System.out.println("history requirment");
		String history=driver.findElement(By.xpath(".//*[@id='tdContents']/table/tbody/tr[1]/td[1]")).getText();
		//if(history.equals("History"))
		assertEquals(history, "History","there have some problem the didn't show history");
		System.out.println(history+" is showing");

		String historyTable= driver.findElement(By.xpath(".//*[@id='tdContents']/table")).getText();
		System.out.println("Displaying history table");
		Thread.sleep(2000);



	}
	@Given("^moving to advertisement module$")
	public void moving_to_advertisement_module() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("backButton")).click();
		System.out.println("moved back to admin's homepage from change group page");
	}

	@When("^I click on manage advertisement's submit button$")
	public void i_click_on_manage_advertisement_s_submit_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.cssSelector("input[linkurl*=memberAds]")).click();
		System.out.println("manage advertisement submit button clicked");
		Thread.sleep(2000);


	}





	@Then("^check advertisement module$")
	public void check_advertisement_module() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		/*String name=driver.findElement(By.cssSelector("input.large.InputBoxDisabled.required")).getAttribute("value");
		String headerTable=driver.findElement(By.className("tdHeaderTable")).getText();
		String actualValue="Advertisements of "+name;
		assertEquals(headerTable, actualValue);*/

		//Modify advertisements

		System.out.println("modifying Advertisements");
		driver.findElement(By.cssSelector("img.edit.editAd")).click();
		driver.findElement(By.cssSelector("#modifyButton")).click();
		driver.findElement(By.cssSelector("input[name*=title]")).sendKeys("change title");
		driver.findElement(By.id("saveButton")).click();
		String modifyMasssge=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		assertEquals(modifyMasssge, "Advertisement modified", "you are not modify advertisment");
		System.out.println(modifyMasssge);
		driver.findElement(By.cssSelector("input#backButton.button")).click();
		Thread.sleep(2000);


		//Remove Advertisements
		driver.findElement(By.cssSelector("img.remove.removeAd")).click();
		String messageGet=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		assertEquals(messageGet, "Remove advertisement?","not remove advertisement");
		System.out.println(messageGet);

		//Adding new ads

		driver.findElement(By.id("newButton")).click();

		driver.findElement(By.cssSelector("input[name*=title]")).sendKeys("Welcome to i will try with more then 25 title");
		String title=driver.findElement(By.cssSelector("input[name*=title]")).getAttribute("value");

		Select category=new Select(driver.findElement(By.cssSelector("select.InputBoxEnabled")));
		category.selectByValue("1");
		String storeCatog=driver.findElement(By.xpath(".//*[@id='tdContents']/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/select/option[2]")).getText();
		assertEquals(storeCatog, "Example ad category");
		driver.findElement(By.cssSelector("input[name*=price]")).sendKeys("12345");

		String price=driver.findElement(By.cssSelector("input[name*=price]")).getAttribute("value");
		boolean valu= driver.findElement(By.cssSelector("input[name*=permanent]")).isDisplayed();
		assertEquals(valu, true);

		// Publication Date (need to ask)
		driver.findElement(By.cssSelector("input[name*=begin]")).sendKeys("12/07/2018");
		String fmt =driver.findElement(By.cssSelector("input[name*=begin]")).getText();
		driver.findElement(By.cssSelector("input[name*=end]")).sendKeys("16/07/2018");
		String exp =driver.findElement(By.cssSelector("input[name*=end]")).getText();
		driver.findElement(By.cssSelector("#cke_contents_descriptionText>iframe")).sendKeys("hi this is ad for you");
		driver.findElement(By.cssSelector("input#saveButton.button")).click();
		String sendAd=driver.switchTo().alert().getText();
		assertEquals(sendAd, "Advertisement inserted");

		System.out.println(sendAd);
		driver.switchTo().alert().accept();
		int count=title.length();
		if(count<=4)
			assertEquals(count, 5);
		else if(count>=25)
			try
		{
				assertEquals(count, 25,"the value of title must take 4 to 25 but it take more then 25");
		}
		catch(Error e){
			System.out.println(e.toString());
		}
		int priceLength=price.length();
		if(priceLength<=4){
			assertEquals(priceLength, 10);
		}

		//expired disable

		driver.findElement(By.id("newButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("notExpirableCheck")).click();
		driver.findElement(By.cssSelector("input[name*=title]")).sendKeys("Welcome to");
		String title2=driver.findElement(By.cssSelector("input[name*=title]")).getAttribute("value");
		int count2=title2.length();
		if(count2<=4)
			assertEquals(count2, 5);
		else if(count2>=25)
			assertEquals(count, 26);
		Select category2=new Select(driver.findElement(By.cssSelector("select.InputBoxEnabled")));
		category2.selectByValue("1");
		driver.findElement(By.cssSelector("input[name*=price]")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name*=begin]")).sendKeys("12/07/2018");
		String fmt2 =driver.findElement(By.cssSelector("input[name*=begin]")).getText();
		assertEquals(fmt2, ""," after disable date should not be take genetaring but it taken ");
		driver.findElement(By.cssSelector("input[name*=end]")).sendKeys("16/07/2018");
		String exp2 =driver.findElement(By.cssSelector("input[name*=end]")).getText();
		assertEquals(fmt2, ""," after disable date should not be take expiry but it taken ");
		driver.findElement(By.cssSelector("#cke_contents_descriptionText>iframe")).sendKeys("my ad");
		driver.findElement(By.cssSelector("input#saveButton.button")).click();
		String sendAd2=driver.switchTo().alert().getText();
		assertEquals(sendAd2, "Advertisement inserted"," Advertisement not inserted without expiry and crate date when i decible the expiry box ");
		driver.switchTo().alert().accept();
	}
	@Given("^I on advertisement page now i have click on home$")
	public void i_on_advertisement_page_now_i_have_click_on_home()  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='menu0']/span[2]")).click();
	}

	@When("^I enter the credentials$")
	public void i_enter_the_credentials() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='memberUsername']")).sendKeys("saanvi");
		Thread.sleep(2000);
	}

	@Then("^check the account inforamntion module$")
	public void check_the_account_inforamntion_module() throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.cssSelector("input.linkButton[linkurl*=accountOverview]")).click();
		String paymentHistory=driver.findElement(By.xpath(".//*[@id='tdContents']/table[1]/tbody/tr[3]/td/table")).getText();
		System.out.println(paymentHistory);
		Select paymentType=new Select(driver.findElement(By.cssSelector("select[name*=paymentFilter]")));
		List<WebElement> listOfPayment=paymentType.getOptions();
		String list_cat[]=new String[]{"All","Commission payments","Loan payments","Member payments","System payments","Taxes and fees","Voucher payments"};
		//Iteration for getting value from dropbox	
		for(int i=0;i<listOfPayment.size();i++)
		{//System.out.println(listOfPayment.get(i).getText());
			try {
				assertEquals(listOfPayment.get(i).getText(), list_cat[i]);
			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}

		driver.findElement(By.cssSelector("#memberUsername")).sendKeys("sanam");
		Thread.sleep(1000);
		String actualMember=driver.findElement(By.cssSelector("#memberUsername")).getAttribute("value");
		assertEquals(actualMember, "sanam", "not taken when give username some char ");
		String actualFullName=driver.findElement(By.cssSelector("#memberName")).getAttribute("value");
		try {
			assertEquals(actualFullName, "sanam", "Full name is not showing ");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[name*=begin]")).sendKeys("15/06/2018");
		driver.findElement(By.cssSelector("input[name*=end]")).sendKeys("02/07/2018");
		driver.findElement(By.className("full")).sendKeys("i need my statment");
		String description=driver.findElement(By.className("full")).getAttribute("value");
		int sizeOfDsc=description.length();
		System.out.println(sizeOfDsc);
		if(sizeOfDsc>=25)
			try {
				assertEquals(sizeOfDsc, 25);

			} catch (Exception e) {
				System.out.println(e.toString());
			}
		/*String actual=driver.findElement(By.xpath(".//*[@id='tdContents']/table[1]/tbody/tr[3]/td/table")).getText();
				assertEquals(actual, paymentHistory);*/

		driver.findElement(By.className("button")).click();
		String afterSubmit=driver.findElement(By.xpath(".//*[@id='tdContents']/table[1]/tbody/tr[1]/td[1]")).getText();
		try {
			assertEquals(afterSubmit, "Search results");
		} catch (Exception e) {
			System.out.println(e.toString());
		}



		driver.findElement(By.id("memberUsername")).sendKeys("sanam");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Given("^back button from account info module and move to admin homepage$")
	public void back_button_from_account_info_module_and_move_to_admin_homepage() throws InterruptedException   {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#backButton.button")).click();
		//driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("moved to admin homepage from account info");
	}

	@When("^I click payment system to member$")
	public void i_click_payment_system_to_member() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[linkurl*=payment]")).click();

	}

	@Then("^check payment$")
	public void check_payment() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("#amount")).sendKeys("1000");
		//for checking  one or more dropdown is present in deposit type
		Select depositToAccount=new Select(driver.findElement(By.cssSelector("#type")));
		List<WebElement> listOfPayment=depositToAccount.getOptions();
		//String expected_list_pay_option[]=new String[]{};
		for(int i=0;i<listOfPayment.size();i++)
		{
			try {
						assertEquals(listOfPayment.get(i).getText(), "Debit to member", " it showing more then 'Debit to member' list ");


			} catch (Error e) {
				System.out.println(e.toString());
			}		
        }

		depositToAccount.selectByVisibleText("Debit to member");
		driver.findElement(By.cssSelector("#description")).sendKeys("you get 1000 from admin");
		String comment=driver.findElement(By.cssSelector("#description")).getAttribute("value");
		if(comment.length()>50)
			try {
				assertEquals(comment, 50);
				
			} catch (Exception e) {
              System.out.println(e.toString());
			}
		driver.findElement(By.cssSelector("#submitButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button")).click();//submit button for conformetion
		try {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
		String pStatus=driver.findElement(By.cssSelector(".tdHeaderTable")).getText();//for verify payment success or not
		try {
			assertEquals(pStatus, "Successful payment"," payment unsuccesful");	
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		driver.findElement(By.cssSelector("#backToMemberProfileButton")).click();



	}
	
	
	//loan module
	
	@Given("^I am on member profile page$")
	public void i_am_on_member_profile_page()   {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^i click on grant loan sublit button$")
	public void i_click_on_grant_loan_sublit_button() throws InterruptedException   {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input.linkButton[linkurl*=grantLoan]")).click();	
		System.out.println("Grant Loan button pressed");
		Thread.sleep(1000);
		
	

	}
 
	@Then("^confirm loan$")
	public void confirm_loan() throws InterruptedException   {
	    // Write code here that turns the phrase above into concrete actions
		Select type=new Select(driver.findElement(By.cssSelector("select#transferType")));
		List<WebElement> item= type.getOptions();
		for(int i=0;i<item.size();i++)
		{
			//checking the loan list is displayed or not
			System.out.println("checking the loan list is displayed or not");
		assertEquals(item.get(i).getText(), "Loan","Some problem in Type becuse type is alwayes show Loan option only ");
			//System.out.println(item.get(i).getText());
		}
		
		//checking the loan amount
		System.out.println("Checking valid loan amount");
		driver.findElement(By.cssSelector("#amount")).sendKeys("1230");
		String amount=driver.findElement(By.cssSelector("#amount")).getAttribute("value");
		int charAmount=amount.length();
		if(charAmount>10)
			assertEquals(charAmount, 10);
		driver.findElement(By.cssSelector(".small.InputBoxEnabled")).sendKeys("sobhagya");
   	 String identy=driver.findElement(By.cssSelector(".small.InputBoxEnabled")).getAttribute("value");
   	 int identyNu=identy.length();
   	 if(identyNu>10)try {
   		 assertEquals(identyNu, 10);
	} catch (Exception e) {
		System.out.println(e.toString());
	}
   		
    
   	 
   	 //Repayments
	 driver.findElement(By.cssSelector("input[name*=repaymentDate]")).sendKeys("04/07/2018");
	 driver.findElement(By.cssSelector("textarea[name*=description]")).sendKeys("Loan approval ");
	 String desc=driver.findElement(By.cssSelector("textarea[name*=description]")).getText();
	 int desCount=desc.length();
	 if(desCount>100)
	 try {
		 assertEquals(desc, 100);
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	 driver.findElement(By.cssSelector(".button[value=Submit]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.cssSelector(".button[value=Submit]")).click();
	 String success=driver.switchTo().alert().getText();
	 driver.switchTo().alert().accept();
	 try {
		 assertEquals(success, "The loan was successfully granted");

	} catch (Exception e) {
System.out.println(e.toString());	}
	 System.out.println(success);

	 
 }



	   
	



}