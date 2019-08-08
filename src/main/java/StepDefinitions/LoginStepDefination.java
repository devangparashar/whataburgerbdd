package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wab.Pages.HomePage;
import wab.Pages.SignInWithPage;
import wab.Pages.WelcomePage;
import wab.util.Testbase;

public class LoginStepDefination extends Testbase {
	WelcomePage welcomepage;
	HomePage homepage;
	SignInWithPage signinwithpage;

	@Given("^user is in welcome page$")
	public void user_is_in_welcome_page() {
		initialization();
		welcomepage = new WelcomePage();
		try {
			welcomepage.taponSigninbutton();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_credentials(String username, String password) {
		signinwithpage = new SignInWithPage();
		try {
			signinwithpage.VerifySignin(username, password);
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("sign in ");

	}

	@Then("^user is on Home Page and verify wab logo$")
	public void user_is_on_Home_Page_and_verify_wab_logo() throws Exception {

		homepage.Validatehomepagetitle();
	}

	@Then("^user signout the app$")
	public void user_signout_the_app() {
		homepage = new HomePage();
		try {
			homepage.TaponSignoutbutton();
		} catch (Exception e) {

			e.printStackTrace();
		}

		try {
			homepage.TaponSignoutpopupbutton();
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("user signout succesfully");

	}

	@Then("^Close the browser$")
	public void close_the_browser() {

		driver.quit();

	}

}
