package step_definition;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Membereventdelete  extends Abstractpagestepdefinition {
	WebDriver driver=getDriver();
	int i,j;
	@When("^click on remove$")
	public void click_on_remove(){
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")).click();
		List <WebElement> list=driver.findElements(By.xpath("//*[@type='checkbox']")); i=list.size();
System.out.println(i);
driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[2]/tbody/tr/td[2]/input")).click();

	  driver.switchTo().alert().dismiss();
	
	}

	@Then("^selected  event is deleted$")
	public void selected_event_is_deleted()  {
	
		List <WebElement> list1=driver.findElements(By.xpath("//*[@type='checkbox']"));
j=list1.size();
if(j<i)
{
	System.out.println("element deleted after clicking remove");
	
}else
{	System.out.println("element was not removed after clicking remove");}
	System.out.println("dont worry i have dismissied it above");

	
	
}}
