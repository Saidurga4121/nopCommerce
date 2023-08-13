package stepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pageObjects.LoginPage;

import io.cucumber.java.en.*;
import junit.framework.Assert;


public class LoginPageSteps 
{
	LoginPage loginPage= new LoginPage();

	String title;
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
	    DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() throws InterruptedException 
	{
		Thread.sleep(1000);
	    title=loginPage.getLoginPageTitle();
	    System.out.println(title + " is title");
	    Assert.assertEquals(title, "OrangeHRM");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) 
	{
	    Assert.assertEquals(title, expectedTitle);
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() throws InterruptedException 
	{
		Thread.sleep(1000);
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) throws InterruptedException 
	{
		Thread.sleep(1000);
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) throws InterruptedException 
	{
		Thread.sleep(1000);
	    loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException
	{
	   Thread.sleep(1000);
	   loginPage.clickOnLogin(); 
	}



}
