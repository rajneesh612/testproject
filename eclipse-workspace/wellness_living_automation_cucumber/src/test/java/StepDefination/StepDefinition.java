package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import PageObject.AddClientPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import utility.BrowserManager;

public class StepDefinition {
	WebDriver driver ;
	LoginPage loginPage;
	AddClientPage addClientPage;
	@Given("Open the {string} browser and go to {string}")
	public void open_the_browser_and_go_to(String browser, String url) {
	    // Write code here that turns the phrase above into concrete actions
		  BrowserManager.setDriver(browser);
		    driver = BrowserManager.getDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get(url);
		    
		    //loginPage = new LoginPage(driver);
		   // addClientPage = new AddClientPage(driver);
		    BrowserManager.setLC(driver);
		   
	}

	@Then("Verify {string} heading is there")
	public void verify_heading_is_there(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("pass");
	}

	@Then("Enter {string} in Email")
	public void enter_in_email(String email) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = BrowserManager.getLoginPage();
	   loginPage.enterEmail(email);
	}

	@Then("Enter {string} in password")
	public void enter_in_password(String passwd) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterPasswd(passwd);
	}

	@When("click on Sign In button")
	public void click_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	   loginPage.signin();
	   
	}

	@Given("Verify the BO name will display")
	public void verify_the_bo_name_will_display() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("pass");
	    addClientPage = BrowserManager.getClientPage();
		addClientPage.closePopup();
	}

	@When("Click on the Add client tab")
	public void click_on_the_add_client_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		addClientPage = BrowserManager.getClientPage();
		Thread.sleep(3000);
		addClientPage.clickAddClient();
		
	    
	}

	@Given("Verify {string} page is open")
	public void verify_page_is_open(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("pass");
	}

	@Then("^Enter First Name (.*)$")
	public void enter_first_name(String firstname) {
	    // Write code here that turns the phrase above into concrete actions
	    addClientPage.enterFirstName(firstname);
	}

	@Then("^Enter Last Name (.*)$")
	public void enter_last_name(String lasttname) {
	    // Write code here that turns the phrase above into concrete actions
		 addClientPage.enterlast(lasttname);
	}

	@Then("^Enter  (.*) in the Email")
	public void enter_in_the_email(String email) {
	    // Write code here that turns the phrase above into concrete actions
	    addClientPage.enterEmail(email);
	}

	@Then("Click on Create Account")
	public void click_on_create_account() {
	    // Write code here that turns the phrase above into concrete actions
	   addClientPage.createAccount();
	}

}
