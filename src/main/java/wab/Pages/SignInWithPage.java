package wab.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;



public class SignInWithPage extends Testbase  {
	
	  @FindBy(how=How.ID, using ="username")
	  @CacheLookup
	   public WebElement Emailid;
	   
	   @FindBy(how=How.ID, using="password")
	   @CacheLookup
	   public WebElement Password;
	   
	   @FindBy(how=How.XPATH, using="//button[@type='submit']")
	   @CacheLookup
	   public WebElement SignInbtn;
	  
	   	public SignInWithPage() {
		PageFactory.initElements(driver, this);
		
			
	   	}
	   	
	   	//Actions:
		//Enter email id, password, tap on Signin button 
		public HomePage VerifySignin(String username, String password) throws Exception {
		Emailid.sendKeys(username);
		Password.sendKeys(password);
		Thread.sleep(5000);
		SignInbtn.click();
		
		return new HomePage();		
	}
	
	
	

	}
