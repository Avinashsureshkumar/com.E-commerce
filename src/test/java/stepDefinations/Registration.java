package stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.Pages.MainPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DriverFactory;

public class Registration {
	
	 private MainPage mp = new MainPage(DriverFactory.getDriver());
    
	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
		
	    DriverFactory.getDriver().get("https://automationexercise.com/");
	}

	@Given("The home page is visible")
	public void the_home_page_is_visible() {
	    Assert.assertEquals(mp.homePage(), true);
	}

	@When("The user Clicks on Signup link")
	public void the_user_click_on_signup_link() {
	    mp.signUpLink();
	}

	@Then("The New User Signup! text is visible")
	public void the_new_user_signup_text_is_visible() {
		String text = mp.signUpText();
		Assert.assertEquals(text,"New User Signup!");
	}

	@Then("The user enters name and email address")
	public void the_user_enters_name_and_email_address() {
	    mp.regUserName();
	    mp.regEmail();
	}

	@Then("The user Clicks on Signup button")
	public void the_user_clicks_on_signup_button() {
	    mp.signup_BT();
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public void verify_that_enter_account_information_is_visible() {
	    Assert.assertEquals("ENTER ACCOUNT INFORMATION",mp.accInfoText());
	}
	
	@Given("The user is on Reg page")
	public void the_user_is_on_reg_page() {
		Assert.assertEquals("ENTER ACCOUNT INFORMATION",mp.accInfoText());
	}
	@When("The user clicks on title radio button")
	public void the_user_clicks_on_title_radio_button() {
	   mp.genderMR();
	}
	@When("The user enters new password {string}")
	public void the_user_enters_new_password(String pwd) {
	   mp.password(pwd);
	}
	@When("The user selects date of birth")
	public void the_user_selects_date_of_birth() {
	    mp.selectDay();
	    mp.selectMonth();
	    mp.selectYear();
	}
	@When("The user clicks on NewsLetter checkbox")
	public void the_user_clicks_on_news_letter_checkbox() {
	    mp.newsLetter();
	}
	@When("The user clicks on SpecialOffer checkbox")
	public void the_user_clicks_on_special_offer_checkbox() {
	    mp.splOffer();
	}
	@When("The user fill all the required details")
	public void the_user_fill_all_the_required_details(DataTable UserInfo) {
		List<Map<String,String>> info = UserInfo.asMaps(String.class,String.class);
		String firstName = info.get(0).get("Firstname");
        String lastName = info.get(0).get("Lastname");
        String company = info.get(0).get("Company");
        String address = info.get(0).get("Address");
        String address2 = info.get(0).get("Address2");
        String state = info.get(0).get("State");
        String city = info.get(0).get("city");
        String zipCode = info.get(0).get("zipcode");
        String mobileNo = info.get(0).get("mobileno");
        
        mp.firstName(firstName);
        mp.lastName(lastName);
        mp.Company(company);
        mp.Address1(address);
        mp.Address2(address2);
        mp.state(state);
        mp.city(city);
        mp.zipCode(zipCode);
        mp.MobileNO(mobileNo);
   
		
	}
	@When("The user clicks on Create Account button")
	public void the_user_clicks_on_create_account_button() {
	    mp.createAcc();
	}
	@Then("Verify Account Created is visible")
	public void verify_account_created_is_visible() {
	    Assert.assertEquals(mp.ConfMsgAccCreated(),true);
	}

}
