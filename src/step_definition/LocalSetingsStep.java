package step_definition;


import java.util.List;
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
	public void fire_Home_Page()  {
		// Write code here that turns the phrase above into concrete actions
		driver=new FirefoxDriver();
	//	driver.manage().window().maximize();
		driver.get("http://localhost:8585/do/login");
		driver.findElement(By.xpath(".//*[@id='cyclosUsername']")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath(".//*[@id='cyclosLogin']/table/tbody/tr[3]/td/input")).click();

	}

	@When("^Navigate to Settings and click On Local Settings$")
	public void navigate_to_Settings_and_click_On_Local_Settings()  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='menu9']/span[2]")).click();

	}

	@Then("^Local Settings Open$")
	public void local_Settings_Open()  {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		driver.findElement(By.xpath(".//*[@id='submenu9.0']/span[2]")).click();
		if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[1]/td[1]")).isDisplayed()==true)
		System.out.println("Your on Settings--Local Settings");
		else
			System.out.println("your are some near nowhere try once"+driver.getTitle());


	}
	

	@When("^click on Change button$")
	public void click_on_Change_button() throws Throwable {
		driver.findElement(By.id("modifyButton")).click();


	}

	@Then("^is Editalble$")
	public void is_Editalble() throws Throwable {
	/*if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[1]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[1]/td[2]/select")).getTagName()+"  is enabled");
	if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[2]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[2]/td[2]/select")).getTagName()+"  is enabled");	
	if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[3]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[3]/td[2]/select")).getTagName()+"  is enabled");	
	if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[4]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[4]/td[2]/select")).getTagName()+"  is enabled");	
	if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[5]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[5]/td[2]/select")).getTagName()+"  is enabled");	
	if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[6]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[6]/td[2]/select")).getTagName()+"  is enabled");	
	if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[7]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[7]/td[2]/select")).getTagName()+"  is enabled");	
	if(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[8]/td[2]/select")).isEnabled())
		System.out.println(driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[8]/td[2]/select")).getText()+"  is enabled");	
*/
		List<WebElement> elements=driver.findElements(By.tagName("select"));
		//String message="Not editable";
		for(int i=0;i<8;i++)
		{
			//Select value=new Select(driver.findElement(By.name("setting(language)")));
			if(elements.get(i).isEnabled())
				System.out.println("Textbox is Enabaled");
			else
			System.out.println("Textbox is no Enabled");
		
		}

}
	
	@When("^Select  values of my Interest$")
	public void select_values_of_my_Interest() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[3]/td[2]/select")).sendKeys("6");
		driver.findElement(By.xpath(".//*[@id='tdContents']/form/table/tbody/tr[2]/td/fieldset[2]/table/tbody/tr[1]/td[2]/select")).sendKeys("German");
	    
	}
	
	@Then("^Submit the hanges$")
	public void submit_the_hanges()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("saveButton")).click();
	}
	   

	@Then("^Check for Changes$")
	public void check_for_Changes() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
	    
	}
}
