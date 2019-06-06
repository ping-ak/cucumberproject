package stepdef3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
WebDriver driver; 
	
	
	
	@Given("Enter user name {string}")
	public void enter_user_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\New Folder\\chromedriver.exe");		  
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

		driver.findElement(By .id("userName")).sendKeys(string);
	  
	}

	@Given("Enter the password {string}")
	public void enter_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .id("password")).sendKeys(string);
	}
	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By. name("Login")).click();
	}
	
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\New Folder\\chromedriver.exe");		  
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By .id("userName")).sendKeys("lalitha");
		driver.findElement(By .id("password")).sendKeys("Password123");
		driver.findElement(By. name("Login")).click();
	   System.out.println("User is in Home page");
	}
	
	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		  driver.findElement(By .xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		  driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
	}

	@When("Try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Item is not added in the cart");
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Cannot proceed to payment");
	}
	
	@Given("open the web browser and click on sign in")
	public void open_the_web_browser_and_click_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("enter the username {string}")
	public void enter_the_username(String string) {
	  
	}

	@Given("enter the first name {string}")
	public void enter_the_first_name(String string) {
	 
	}

	@Given("enter the last name {string}")
	public void enter_the_last_name(String string) {
	 
	}

	@Given("enter the password {string}")
	public void enter_the_Password(String string) {
	}
	
	  

	@Given("enter the confirm password {string}")
	public void enter_the_confirm_password(String string) {
	   
	}

	@Given("click on gender{string}")
	public void click_on_gender(String string) {
	  
	}

	@Given("enter the email {string}")
	public void enter_the_email(String string) {
	    
	}

	@Given("enter the mobile number {string}")
	public void enter_the_mobile_number(String string) {
	  
	}

	@Given("click on DOB {string}")
	public void click_on_DOB(String string) {
	    
	}

	@Given("enter the address {string}")
	public void enter_the_address(String string) {
	    
	}

	@Given("Select the Security question {string}")
	public void select_the_Security_question(String string) {
	   
	}

	@Given("enter the answer {string}")
	public void enter_the_answer(String string) {
	    
	}

	@Then("click on register")
	public void click_on_register() {
	   
	}

	
	
	
	
	
	
}
