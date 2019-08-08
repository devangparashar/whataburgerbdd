package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wab.Pages.HomePage;
import wab.Pages.SignUpWithPage;
import wab.Pages.TermsandConditionsPage;
import wab.Pages.WelcomePage;
import wab.util.Testbase;

public class SignupStepDefination extends Testbase {
	WelcomePage welcomepage;
	SignUpWithPage signupwithpage;
	HomePage homepage;
	TermsandConditionsPage tcp;
	// global hooks

	@Given("^User is in sign up page$")
	public void user_is_in_sign_up_page() throws Throwable {
		initialization();
		driver.switchTo().alert().dismiss();
		welcomepage= new WelcomePage();
		welcomepage.taponSignupbutton();
	}

	@Then("^user enters details in all fields$") // datadriven approach datatable and raw keyword
	public void user_enters_details_in_all_fields(DataTable signupDetails) {
		signupwithpage = new SignUpWithPage();
		signupwithpage.user_entersignupdetails(signupDetails);

	}

	// @Then("^user enters details in all fields$") //datadriven approach datatable
	// and raw keyword
	// public void user_enters_details_in_all_fields(DataTable signupDetails) {
	// List<List<String>> accountvalues = signupDetails.raw();
	// driver.findElement(
	// By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12
	// pad-tp-lft-rgt-24']//div[1]//input[1]"))
	// .sendKeys(accountvalues.get(0).get(0));
	// driver.findElement(
	// By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12
	// pad-tp-lft-rgt-24']//div[2]//input[1]"))
	// .sendKeys(accountvalues.get(0).get(1));
	// driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(accountvalues.get(0).get(2));
	// driver.findElement(By.xpath(
	// "/html/body/app-root/app-landing/app-modal/div/div/div/div[2]/app-register/div/div[4]/form/div[2]/div[2]/div[1]/input"))
	// .sendKeys(accountvalues.get(0).get(3));
	// driver.findElement(By.xpath(
	// "/html/body/app-root/app-landing/app-modal/div/div/div/div[2]/app-register/div/div[4]/form/div[2]/div[2]/div[2]/input"))
	// .sendKeys(accountvalues.get(0).get(3));
	//
	// }

	// @When("^user enters details in all fields$") //datadriven approach datatable
	// and raw keyword
	// public void user_enters_details_in_all_fields(DataTable signupDetails) {
	//
	// //Map<String, String> data = signupDetails.asMap(String.class, String.class);
	// for (Map<String, String> data: signupDetails.asMaps(String.class,
	// String.class)){
	//
	// driver.findElement(
	// By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12
	// pad-tp-lft-rgt-24']//div[1]//input[1]"))
	// .sendKeys(data.get("FirstName"));
	// driver.findElement(
	// By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12
	// pad-tp-lft-rgt-24']//div[2]//input[1]"))
	// .sendKeys(data.get("Last name"));
	// driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(data.get("Phone
	// number"));
	// driver.findElement(By.xpath(
	// "/html/body/app-root/app-landing/app-modal/div/div/div/div[2]/app-register/div/div[4]/form/div[2]/div[2]/div[1]/input"))
	// .sendKeys(data.get("Create Password"));
	// driver.findElement(By.xpath(
	// "/html/body/app-root/app-landing/app-modal/div/div/div/div[2]/app-register/div/div[4]/form/div[2]/div[2]/div[2]/input"))
	// .sendKeys(data.get("Confirm Password"));
	//
	// }}

	@Then("^user enters email id$")
	public void user_enters_email_id() {
		signupwithpage.EnterValiEmailid();

	}

	@Then("^user taps on email checkbox & tap on Signup button$")
	public void user_taps_on_email_checkbox_tap_on_Signup_button() throws Exception {
		signupwithpage = new SignUpWithPage();
		signupwithpage.checkCheckbox();
		signupwithpage.TaponSignUpbutton();
		tcp= new TermsandConditionsPage();
		tcp.TaponTermsCheckbox();
		tcp.TaponAgreebutton();
		//homepage.Validatehomepagetitle();
		System.out.println("Sign up is done successfully");

	}

	@Then("^user signout$")
	public void user_signout() throws Exception {
		homepage = new HomePage();
		homepage.TaponSignoutbutton();
		homepage.TaponSignoutpopupbutton();
		System.out.println("user signout succesfully");
		driver.quit();
	}

}
