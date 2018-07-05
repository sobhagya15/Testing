package step_definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Systemeventremove  extends Abstractpagestepdefinition 
{
WebDriver driver=getDriver();
int i;
int j;

@When("^click on remove button$")
public void click_on_remove_button() 
{
	JavascriptExecutor j= (JavascriptExecutor) driver;  
	j.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")).click();
		List <WebElement> list=driver.findElements(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[1]/tbody/tr[2]/td"));
		 i=list.size();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
        
		driver.switchTo().alert().dismiss();	
        
    //    driver.switchTo().alert().dismiss();	
}

@Then("^selected element removed\\*/$")
public void selected_element_removed()  {

	List <WebElement> list1=driver.findElements(By.xpath("html/body/div[2]/div/div/div/div[3]/form/table[1]/tbody/tr[2]/td"));
	 j=list1.size();
	if(j<i)
	{
	System.out.println("element is deleted");	
	}
	else
	{
		System.out.println("element is  not deleted");	

		
	}
}
}


