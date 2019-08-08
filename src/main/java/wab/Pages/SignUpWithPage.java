package wab.Pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.DataTable;
import wab.util.Testbase;

public class SignUpWithPage extends Testbase {

	@FindBy(xpath = "//div[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12 pad-tp-lft-rgt-24']//div[1]//input[1]")
	@CacheLookup
	public WebElement FirstName;

	@FindBy(xpath = "//div[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12 pad-tp-lft-rgt-24']//div[2]//input[1]")
	@CacheLookup
	public WebElement LastName;

	@FindBy(xpath = "//input[@type='tel']")
	@CacheLookup
	public WebElement PhoneNumber;

	@FindBy(xpath = "//input[@type='email']")
	@CacheLookup
	public WebElement Emailid;

	@FindBy(xpath = "/html/body/app-root/app-landing/app-modal/div/div/div/div[2]/app-register/div/div[4]/form/div[2]/div[2]/div[1]/input")
	@CacheLookup
	public WebElement CreatePassword;

	@FindBy(xpath = "/html/body/app-root/app-landing/app-modal/div/div/div/div[2]/app-register/div/div[4]/form/div[2]/div[2]/div[2]/input")
	@CacheLookup
	public WebElement ConfirmPassword;

	@FindBy(xpath = "//label[@for='addToEmail_']")
	@CacheLookup
	public WebElement EmailCheckbox;

	@FindBy(xpath = "//button[@class='btn wb-btn-default center-block']")
	@CacheLookup
	public WebElement SignUpbtn;

	@FindBy(xpath = "//span[@class='forget-sign-link already-link']")
	@CacheLookup
	public WebElement Alreadyhaveaacountlink;

	public SignUpWithPage() {
		PageFactory.initElements(driver, this);

	}

	// Tap on enter fname, lname, pnumber, cpassword, cpassword, emailid, checkbox,
	// sign up button

	public void user_entersignupdetails(DataTable signupDetails) {
		List<List<String>> accountvalues = signupDetails.raw();
		FirstName.sendKeys(accountvalues.get(1).get(0));
		LastName.sendKeys(accountvalues.get(1).get(1));
		PhoneNumber.sendKeys(accountvalues.get(1).get(2));
		CreatePassword.sendKeys(accountvalues.get(1).get(3));
		ConfirmPassword.sendKeys(accountvalues.get(1).get(3));

	}

//	public void EnterValuesnsignup() throws Exception {
//
//		FirstName.click();
//
//	}
//
//	public boolean verifyFirstNamefield() {
//
//		return FirstName.isDisplayed();
//
//	}
//
//	public boolean verifyLastNamefield() {
//
//		return LastName.isDisplayed();
//
//	}
//
//	public void EnterValiLastName() {
//		LastName.clear();
//		LastName.sendKeys("Burger");
//	}
//
//	public boolean verifyPhoneNumberfield() {
//
//		return PhoneNumber.isDisplayed();
//
//	}
//
//	public void EnterValiPhoneNumber() {
//
//		PhoneNumber.clear();
//		PhoneNumber.sendKeys("4848494249");
//
//	}
//
//	public boolean verifyEmailAddressfield() {
//		return Emailid.isDisplayed();
//	}
//
	public void EnterValiEmailid() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		Emailid.sendKeys("wabburger" + randomInt + "@gmail.com");

	}
//
//	public boolean VerifyCreatePasswordfield() {
//		return CreatePassword.isDisplayed();
//	}
//
//	public void EnterValiPassword() {
//
//		CreatePassword.clear();
//		CreatePassword.sendKeys("burger01");
//	}
//
//	public boolean VerifyConfirmPassowrdfield() {
//		return ConfirmPassword.isDisplayed();
//	}
//
//	public void EnterValiConfirmPassowrd() {
//		ConfirmPassword.clear();
//		ConfirmPassword.sendKeys("burger01");
//	}

//	public boolean verifyEmailCheckbox() {
//		return EmailCheckbox.isDisplayed();
//	}

	public void checkCheckbox() throws Exception {
		EmailCheckbox.click();
		
	}

//	public boolean verifySignUpbtnbutton() {
//		return SignUpbtn.isDisplayed();
//	}

	public void TaponSignUpbutton() throws Exception {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("window.scrollBy(0,1020)", "");
		SignUpbtn.click();
		Thread.sleep(8000);
	}

}
