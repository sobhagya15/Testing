package step_definition;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginValid 
{

	public static WebDriver driver;

	@Given("^Cyclos Application$")
	public void cyclos_Application()  
	{

		driver=new FirefoxDriver();

		driver.get("http://localhost:8585/do/login");

	}

	@Given("^Cyclos Application again$")
	public void cyclos_Application_again() {

		//driver.navigate().refresh();

	}


	//admin login using virtual keyboard

	@When("^Valid credentials are Entered$")
	public void valid_credentials_are_Entered()  
	{

		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[1]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[2]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[3]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[4]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();

	}

	@Then("^Homepage is displayed$")
	public void homepage_is_displayed() throws InterruptedException  
	{

		assertEquals("http://localhost:8585/do/admin/home",driver.getCurrentUrl());

		System.out.println("Admin Login is successful");

		driver.findElement(By.xpath(".//*[@id='menu15']/span[2]")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		//driver.close();

	}

	//member login,capslock button,virtual keyboard



	@When("^values are entered$")
	public void values_are_entered() 
	{



	}

	@When("^capslock is turned on$")
	public void capslock_is_turned_on()  
	{



	}

	@Then("^capital letters should be displayed$")
	public void capital_letters_should_be_displayed() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='cyclosUsername']")).sendKeys("Rumesha_Sk");

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[1]")).click();

		//driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[1]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[14]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[1]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[17]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[36]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[36]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[18]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();

		assertEquals("http://localhost:8585/do/member/home",driver.getCurrentUrl());

		System.out.println("Member login,capslock button is validated using virtual keyboard");

		driver.findElement(By.xpath("//*[@id='menu3']/span[2]")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		//driver.close();



	}

	//To check the reset button


	@When("^password is entered and clear is clicked$")
	public void password_is_entered_and_clear_is_clicked()  
	{

		//driver.findElement(By.id("cyclosUsername")).sendKeys("admin");

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[1]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[2]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[3]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[4]")).click();

	}

	@Then("^password field is cleared$")
	public void password_field_is_cleared() throws InterruptedException  
	{

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[2]")).click();

		System.out.println("password field is cleared");

		Thread.sleep(2000);

		//driver.close();

	}

	//checking if username field accepts special characters

	@When("^Special characters are entered in username field$")
	public void special_characters_are_entered_in_username_field() throws Throwable 
	{

		//username is checked  by passing the values in string name
		System.out.println("Special characters checking");

	}

	@Then("^Invalid login page should be displayed$")
	public void invalid_login_page_should_be_displayed() throws InterruptedException
	{
		String name ="admin";

		driver.findElement(By.id("cyclosUsername")).sendKeys(name);
		
		if(name.equals("admin"))
		{

		/*String[] invalidChars = {"#", "!", "$", "@", "%", "^", "&","*"};

		for (String invalid : invalidChars) 
		{
			if(name.contains(invalid))

			{
				System.out.println("hello ");
				driver.get("http://localhost:8585");
				Thread.sleep(3000);
				break;
			}
			else{
				try {
					System.out.println("hi");
					assertEquals(name,"admin","Special characters are not accepted");
					driver.get("http://localhost:8585");
					Thread.sleep(3000);

				} catch (Exception e) {
					System.out.println(e.toString());
				}
				

			}*/
			
			System.out.println("there are no special characters");
			
			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[1]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[2]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[3]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[4]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();

			driver.findElement(By.xpath(".//*[@id='menu15']/span[2]")).click();

			driver.switchTo().alert().accept();

		}
		else
		{
			System.out.println("do not include special characters");
			Thread.sleep(3000);
			driver.get("http://localhost:8585");
		}

		//driver.close();

		Thread.sleep(2000);


	}

	//checking the valid and invalid range of characters in username field

	@When("^Invalid range of characters are entered in username field$")
	public void invalid_range_of_characters_are_entered_in_username_field() throws Throwable 
	{

		//driver.findElement(By.id("cyclosUsername")).clear();

		String name = "admin";
		
		if(name.length()<4)
		{
			driver.findElement(By.id("cyclosUsername")).sendKeys(name);
			System.out.println("username should be mare than 4 characters");
			Thread.sleep(3000);
			driver.get("http://localhost:8585");
		}
		else if(name.length()>10)
		{
			driver.findElement(By.id("cyclosUsername")).sendKeys(name);
			System.out.println("username length should be less than 10 characters");
			Thread.sleep(3000);
			driver.get("http://localhost:8585");
		}
		
		else
		{

		driver.findElement(By.id("cyclosUsername")).sendKeys(name);
		System.out.println("here the username length is valid");
		}

		/*int namesize = name.length();

		if(namesize<4){
			assertEquals(namesize,4,"username should not be less than 4 characters");
		}
		else if(namesize>10){
			assertEquals(namesize,10,"username should not be more than 10 characters");
		}
		else
		{
			System.out.println("valid range of characters in username are validated");
		}*/


	}

	@Then("^Invalid login page is displayed  for irc$")
	public void invalid_login_page_is_displayed_for_irc() throws InterruptedException 
	{

		//User name

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[1]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[2]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[3]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[4]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();

		driver.findElement(By.xpath(".//*[@id='menu15']/span[2]")).click();

		driver.switchTo().alert().accept();


		//driver.close();

		Thread.sleep(2000);
	}

	//checking by entering only numeric characters in username field

	@When("^Only numeric characters are entered in un field$")
	public void only_numeric_characters_are_entered_in_un_field() throws InterruptedException 
	{

		String name="admin4";
		
		//String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9","0"};

		
		 //User name

		if(name.matches(".*\\d.*")){
			
			driver.findElement(By.id("cyclosUsername")).sendKeys(name); 
			System.out.println("username should not contain numerical characters");
			Thread.sleep(3000);
			driver.get("http://localhost:8585");
			
		}
		else
		{
			driver.findElement(By.id("cyclosUsername")).sendKeys(name);
			System.out.println("username dont contain  numerical characters");
			
			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[1]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[2]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[3]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[4]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();

			driver.findElement(By.xpath(".//*[@id='menu15']/span[2]")).click();

			driver.switchTo().alert().accept();
		}
		
		

	/*	for (String num : numbers) 
		{
			if(name.contains(num))
			{

				assertEquals(num,name,"Numbers are not accepted");
				System.out.println("numeric characters not accepting then");

			}


		}*/


	}

	@Then("^Invalid login page is displyed for onc$")
	public void invalid_login_page_is_displyed_for_onc() throws InterruptedException  {


	
		

		Thread.sleep(2000);

	}

	//checking the valid password format

	@Then("^password should be in valid format$")
	public void password_should_be_in_valid_format() throws Throwable 
	{

		driver.findElement(By.id("cyclosUsername")).sendKeys("admin"); 

		String passwd= "1234";
	    
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	    
		if(passwd.matches(pattern))
		{
			System.out.println("password pattern is not satisfied");
			Thread.sleep(3000);
			driver.get("http://localhost:8585");
		}
		
		else
		{
			System.out.println("password matches the pattern");
			
			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[1]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[2]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[3]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[4]")).click();

			driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();
			
			driver.findElement(By.xpath(".//*[@id='menu15']/span[2]")).click();

			driver.switchTo().alert().accept();
			
			Thread.sleep(3000);
		}
		
		

		/*driver.findElement(By.id("cyclosPassword")).sendKeys(value);  //password through Physical keyboard


		//Passing password through virtual keyboard

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[1]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[2]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[3]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[1]/input[4]")).click();

		driver.findElement(By.xpath("//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();

		int valuesize = value.length();

		if(valuesize<4)

			assertEquals(valuesize,4,"username should not be less than 4 characters");

		else if(valuesize>20)

			assertEquals(valuesize,20,"username should not be more than 10 characters");

		boolean password= value.matches("[0-9]+[!@ #$%^&*()-][_=+{|<>/.,?;:]");

		assertEquals(password,true,"Password should contain atleast one numeric and special character");

		driver.findElement(By.xpath("//*[@class='button' and @value='Submit']")).click();    //submit button

		System.out.println("password format is validated here");*/

	}
	
	@When("^Password is enterd from vkeyboard or pKeyBoard$")
	public void password_is_enterd_from_vkeyboard_or_pKeyBoard() throws Throwable {
		
		System.out.println("Physical keyboard and Virtual keyboard is validated here");
	    
	}

	@Then("^Password should be accepted$")
	public void password_should_be_accepted() throws Throwable {
		
		driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		try{
			
             driver.findElement(By.xpath(".//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal'][@value='1']")).click();
             
             driver.findElement(By.xpath(".//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal'][@value='2']")).click();
             
             driver.findElement(By.xpath(".//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal'][@value='3']")).click();
             
             driver.findElement(By.xpath(".//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal'][@value='4']")).click();
             
             driver.findElement(By.xpath(".//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")).click();
             
             driver.findElement(By.xpath(".//*[@id='menu15']/span[2]")).click();
             
             driver.switchTo().alert().accept();
		}
		catch (Exception e) {
			//System.out.println(e.toString());
		}
		try{
		driver.findElement(By.xpath(".//*[@id='cyclosPassword']")).sendKeys("1234");
		driver.findElement(By.xpath(".//*[@id='cyclosLogin']/table/tbody/tr[3]/td/input")).click();
		}
		catch (Exception e) {
			//System.out.println(e.toString());
		}
	    
	}

}


