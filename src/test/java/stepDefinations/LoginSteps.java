package stepDefinations;

import org.junit.Assert;

import com.Pages.MainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageFactory.DriverFactory;

public class LoginSteps {
	MainPage mp = new MainPage(DriverFactory.getDriver());

	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
		DriverFactory.getDriver().get("https://automationexercise.com/");
	    mp.signUpLink();
	}

	@Then("Verify Login to your account should be visible")
	public void verify_login_to_your_account_should_be_visible() {
	    String loginText = mp.loginText();
	    Assert.assertEquals(loginText, "Login to your account");
	}

	@When("The usere Enters correct email address and password")
	public void the_usere_enters_correct_email_address_and_password() {
	    mp.loginEmail();
	    mp.loginPass();
	}

	@When("Click login button")
	public void click_login_button() {
	    mp.loginBT();
	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
	    String usernamecnf = mp.userVisible();
	    Assert.assertEquals(usernamecnf, "demotestuser");
	}
	
	@When("The user clicks on delete acc button")
	public void the_user_clicks_on_delete_acc_button() {
	    mp.deleteUser();
	}

	@Then("Verify that ACCOUNT DELETED is visible")
	public void verify_that_account_deleted_is_visible() {
	    String deleteText = mp.deleteText();
	    Assert.assertEquals(deleteText, "ACCOUNT DELETED!");
	}

}
