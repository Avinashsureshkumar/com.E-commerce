package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BasePage {
	Select sc;

	public MainPage(WebDriver driver) {
		super(driver);
}
	
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement signuplogin;
	
	@FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
	WebElement signupText;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement regUserName;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement regEmailAdd;
	
	@FindBy(xpath = "//button[normalize-space()='Signup']")//div/h2[1]/b[1]
	WebElement signupBT;
	
	@FindBy(xpath = "//div/h2[1]/b[1]")
	WebElement accInfotext;
	
	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	WebElement homePageimg;
	
	@FindBy(id = "id_gender1")
	WebElement gender_MR;
	
	@FindBy(xpath = "(//input[@id='name'])[1]")
	WebElement nameIpBox;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passIpBox;
	
	@FindBy(xpath = "(//input[@id='newsletter'])[1]")
	WebElement newsLetterCK;
	
	@FindBy(xpath = "(//input[@id='optin'])[1]")
	WebElement splOfferCK;
	
	@FindBy(xpath = "(//input[@id='first_name'])[1]")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement company;
	
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1;
	
	@FindBy(css = "#address2")
	WebElement address2;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement State;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobileNO;
	
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement createAccBT;
	
	@FindBy(xpath="//select[@id='days']")
    WebElement day;
	
	@FindBy(xpath="//select[@id='months']")
    WebElement month;
	
	@FindBy(xpath="//select[@id='years']")
    WebElement year;
	
	@FindBy(css = "h2[class='title text-center'] b")
	WebElement accCreated;
	
	
	public void signUpLink() {
		signuplogin.click();	
	}
	
	public String signUpText() {
		return signupText.getText();
	}
	
	public void regUserName() {
		regUserName.sendKeys("demotestuser");
	}
	
	public void regEmail() {
		regEmailAdd.sendKeys("abedefgh1234@gmail.com");
	}
	
	public void signup_BT() {
		signupBT.click();
		
	}
	
	public String accInfoText() {
		return accInfotext.getText();
	}
	
	public boolean homePage() {
		return homePageimg.isDisplayed();
	}
	
	public void genderMR() {
		gender_MR.click();
	}
	
	public void password(String pwd) {
		passIpBox.sendKeys(pwd);
	}
	
	public void newsLetter() {
		newsLetterCK.click();
	}
	
	public void splOffer() {
		splOfferCK.click();	
	}
	
	public void firstName(String fn) {
		firstName.sendKeys(fn);
	}
	
    public void lastName(String ln) {
		lastName.sendKeys(ln);
	}

    public void Company(String comp) {
    	company.sendKeys(comp);
    }
    
    public void Address1(String Add1) {
    	address1.sendKeys(Add1);
 }
    public void Address2(String Add2) {
    	address2.sendKeys(Add2);
    }
    
    public void state(String state) {
    	State.sendKeys(state);
    }
    public void city(String City) {
    	city.sendKeys(City);
    }
    public void zipCode(String zip) {
    	zipCode.sendKeys(zip);
    }
    public void MobileNO(String no) {
    	mobileNO.sendKeys(no);
    }
    public void createAcc() {
    	createAccBT.click();
    }
    
    public void selectDay() {
    	sc = new Select(day);
    	sc.selectByVisibleText("20");
    }
    
    public void selectMonth() {
    	sc = new Select(month);
    	sc.selectByVisibleText("July");
    }
    
    public void selectYear() {
    	sc = new Select(year);
    	sc.selectByVisibleText("1997");
    }
    
    public boolean ConfMsgAccCreated() {
    	return accCreated.isDisplayed();
    }
   

}
