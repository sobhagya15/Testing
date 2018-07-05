package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class commonPagestepdefinition  extends Abstractpagestepdefinition 
{
	
WebDriver driver=getDriver();
	@Given("^online banking app$")
	public void online_banking_app()  {
		
    	driver.get("http://localhost:8585/do/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		driver.findElement(By.id("cyclosPassword")).sendKeys("1234");
		driver.findElement(By.xpath(".//*[@id='cyclosLogin']/table/tbody/tr[3]/td/input")).click();
		driver.findElement(By.xpath(".//*[@id='menu2']/span[2]")).click();


}}
