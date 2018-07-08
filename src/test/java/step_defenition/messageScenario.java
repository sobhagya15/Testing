package step_defenition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class messageScenario 
{

	static WebDriver driver ;
	@Given("^Cyclos message page$")
	public void cyclos_message_page() throws Throwable 
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8585/do/login");
        driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[2]")).click();
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[3]")).click();
		driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[1]/input[4]")).click();
		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();
		System.out.println("Successful Login"); 
	}

	@When("^I click on message and select inbox$")
	public void i_click_on_message_and_select_inbox() throws Throwable 
	{
		//MessageList
		driver.findElement(By.xpath("//*[@id='menu8']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='submenu8.0']/span[2]")).click();
		System.out.println("You just selected the messages");
		//message type- inbox
		System.out.println("You are selecting the inbox from the dropdown");
		driver.findElement(By.cssSelector("#messageBoxSelect")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='messageBoxSelect']/option[1]")).click();
		//message category dropdown
		WebElement messageCategory = driver.findElement(By.name("query(category)"));
		Select optionses = new Select(messageCategory);
		optionses.selectByIndex(0);
	}

	@Then("^Display inbox messages in the search box$")
	public void display_inbox_messages_in_the_search_box() throws Throwable 
	{
		System.out.println("The inbox messages are displayed.");
		String from = "From";
		String fromCmp = driver.findElement(By.cssSelector(".tdHeaderContents:nth-child(4)")).getText();
		assertEquals(fromCmp,from,"The search results are not displaying the inbox messages");
		Thread.sleep(1000);
	}

	@When("^I click on sent items from dropdown$")
	public void i_click_on_sent_items_from_dropdown() throws Throwable 
	{
		//Message type- sent item
		System.out.println("You are selecting the inbox optio from the dropdown");
		driver.findElement(By.xpath("//*[@id='messageBoxSelect']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='messageBoxSelect']/option[2]")).click();
	}

	@Then("^Display sent items options in the search box$")
	public void display_sent_items_messages_in_the_search_box() throws Throwable 
	{
		System.out.println("The sent items messages are displayed.");
		String to = "To";
		String toCmp = driver.findElement(By.xpath("//*[@id='tdContents']/form[2]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[4]")).getText();
		assertEquals(toCmp,to,"The search results are not displaying the sent items messages");
		Thread.sleep(1000);
	}

	@When("^I click on trash from the dropdown$")
	public void i_click_on_trash_from_the_dropdown() throws Throwable 
	{
		//message type- trash
		System.out.println("You are selecting the trash option from the dropdown");
		driver.findElement(By.xpath("//*[@id='messageBoxSelect']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='messageBoxSelect']/option[3]")).click();
	}

	@Then("^Display trash messages in the search box$")
	public void display_trash_messages_in_the_search_box() throws Throwable 
	{
		System.out.println("The trash items messages are displayed.");
		String toFrom = "From / To";
		String toFromCmp = driver.findElement(By.cssSelector(".tdHeaderContents:nth-child(4)")).getText();
		assertEquals(toFromCmp,toFrom,"The search results are not displaying the thrash messages");
		Thread.sleep(1000);
	}

	@When("^I click on select button$")
	public void i_click_on_select_button() throws Throwable 
	{
	    //Select all
		driver.findElement(By.xpath("//*[@id='selectAllButton']")).isEnabled();
		
	}

	@Then("^All messages should be selected$")
	public void all_messages_should_be_selected() throws Throwable 
	{
		if(driver.findElement(By.xpath("//*[@id='selectAllButton']")).isEnabled())
		{
			System.out.println("All messages would get selected");
		}
		else System.out.println("No message is selected");
	}

	@When("^I click on select none button$")
	public void i_click_on_select_none_button() throws Throwable 
	{
	    //De-select all
		driver.findElement(By.xpath("//*[@id='selectNoneButton']")).isEnabled();
	}

	@Then("^None of the messages should be selected$")
	public void none_of_the_messages_should_be_selected() throws Throwable 
	{
		if(driver.findElement(By.xpath("//*[@id='selectNoneButton']")).isEnabled())
		{
			System.out.println("All messages get de-selected");
		}
		else System.out.println("Messages are not de-selected");
	}

	@When("^I choose member and send keys to other feilds$")
	public void i_choose_member_and_send_keys_to_other_feilds() throws Throwable 
	{
		//Send message to member
		driver.findElement(By.xpath("//*[@id='newButton']")).click();
		driver.findElement(By.xpath("//*[@id='memberUsername']")).click();
		driver.findElement(By.xpath("//*[@id='memberUsername']")).sendKeys("p");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='subjectText']")).sendKeys("Good Day");
		driver.findElement(By.cssSelector("#cke_contents_bodyText>iframe[title='Rich text editor, bodyText']")).sendKeys("Have a nice day");
		
	}

	@Then("^On clicking submit message should be sent$")
	public void on_clicking_submit_message_should_be_sent() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id='tdContents']/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td/input")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();	
		System.out.println("The message was sent to the member.");
	}

	@When("^I choose group and send keys to rest$")
	public void i_choose_group_and_send_keys_to_rest() throws Throwable 
	{
	    //send message to group
		driver.findElement(By.id("newButton")).click();
		Select member_category_sendTo = new Select(driver.findElement(By.id("sendToSelect")));
		member_category_sendTo.selectByValue("GROUP");//selecting group
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".multiDropDownText.multiDropDownLabel")).click();
		driver.findElement(By.cssSelector(".multiDropDownText.multiDropDown>div>div>input[value='5']")).click();
		driver.findElement(By.cssSelector(".multiDropDownText.multiDropDownLabel")).click();		
		Thread.sleep(1000);
	}

	@Then("^On clicking submitmessage should be sent$")
	public void on_clicking_submitmessage_should_be_sent() throws Throwable 
	{
		driver.findElement(By.id("subjectText")).sendKeys("Message for groups");
		driver.findElement(By.cssSelector("#cke_contents_bodyText>iframe")).sendKeys("hi how r u");
		driver.findElement(By.xpath("//*[@id='tdContents']/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td/input")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("The message was sent to the group.");
	}

	@When("^I check the default values$")
	public void i_check_the_default_values() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id='submenu8.1']/span[2]")).click();
		String support = "Support";
		String admin = "Administration";
		String loan = "Loan";
		System.out.println("The default categories are : " + support + "," + admin + "," + loan);
	}

	@Then("^assertion should be done to verify$")
	public void assertion_should_be_done_to_verify() throws Throwable 
	{
		//default category
		String support = "Support";
		String supportCmp = driver.findElement(By.xpath("//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[1]")).getText();
		String admin = "Administration";
		String adminCmp = driver.findElement(By.xpath("//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td[1]")).getText();
		String loan = "Loan";
		String loanCmp = driver.findElement(By.xpath("//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td[1]")).getText();
		assertEquals(supportCmp,support,"The default category is not support");
		assertEquals(adminCmp,admin,"The default category is not administration");
		assertEquals(loanCmp,loan,"The default category is not support");			
	}

	@When("^I add a new category and submit$")
	public void i_add_a_new_category_and_submit() throws Throwable 
	{
	    //add new category
		driver.findElement(By.xpath("//*[@id='newButton']")).click();
		driver.findElement(By.xpath("//*[@id='tdContents']/form/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("Blance");
	}

	@Then("^new category should be added$")
	public void new_category_should_be_added() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id='saveButton']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("A new category added.");
	}

	@When("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable 
	{
	    //delete category
		System.out.println("Click on a category to delete");
		
	}

	@Then("^Delete the selected category$")
	public void delete_the_selected_category() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/img[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("The category is deleted.");
		
	}

	@When("^I click on edit button$")
	public void i_click_on_edit_button() throws Throwable 
	{
	    //editing existing category
		driver.findElement(By.xpath("//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/img[1]")).click();
		driver.findElement(By.xpath("//*[@id='modifyButton']")).click();
		driver.findElement(By.xpath("//*[@id='tdContents']/form/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id='tdContents']/form/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("Administration");
		
	}

	@Then("^I should be able to edit the category$")
	public void i_should_be_able_to_edit_the_category() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id='saveButton']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("The category was added.");
		
	}

}
