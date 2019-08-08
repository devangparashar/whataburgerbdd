package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;



public class WelcomePage extends Testbase  {
	
	//wab logo
	@FindBy(xpath="//a[contains(@class, 'navbar-brand hidden-xs hidden-sm visible-md visible-lg')]//img")
	public WebElement WBlogo;
	
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	public WebElement Signinbtn;
	
	@FindBy(xpath="//span[contains(text(),'Sign up')]")
	public WebElement Signupbtn;
	
	
	@FindBy(xpath="//a[@class='btn btn-default btn-sm order-cart-btn desktop-view']")
	public WebElement Startcookingbtn;
	
	
	@FindBy(xpath="//a[contains(text(),'STORIES')]")
	public WebElement Storieslink;
	
	
	@FindBy(xpath="//a[contains(text(),'CAREERS')]")
	public WebElement Careerslink;
	
	@FindBy(xpath="//a[@class='last-menu-item']")
	public WebElement Communitylink;
	
	@FindBy(xpath="//a[contains(text(),'Contact Customer Care')]")
	public WebElement Contactcustomercarelink;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	public WebElement Contactuslink;
	
	
	public WelcomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Actions:
	//Verify wab logo 
	public boolean validateWelcomePagelogo() {
		
		return WBlogo.isDisplayed();
	}
	
	//Verify Signup button 
     public boolean verifySignupbutton() {
	
		return Signupbtn.isDisplayed() ;
		
	}
     //Tap on Signup button 
     public void taponSignupbutton() {
    	 Signupbtn.click();
    	 
     }
     
     //Verify Signin button 
     public boolean verifySigninbutton() {
    	 return Signinbtn.isDisplayed();
     }
     
     //Tap on Signin button 
     public void taponSigninbutton() throws Exception {
    	// Thread.sleep(10000);
    	 Signinbtn.click();
     }
     
     //Verify Start cooking button 
     public boolean verifyStartcookingbutton()
     {
    	 return Startcookingbtn.isDisplayed();
     }
     // Tap on Start Cooking button 
     public void taponStartcookingbutton() {
    	 Startcookingbtn.click();
     }
     //Verify Carrer link 
     public boolean verifyCareerslink() {
    	 return Careerslink.isDisplayed();
     }
     //Tap on Career link 
     public void taponCareerslink() {
    	 Careerslink.click();
     }
     //Verify Stories link
     public boolean verifyStorieslink() {
    	 return Storieslink.isDisplayed();
     }
      //Tap on Stories link 
      public void taponStorieslink() {
    	  Storieslink.click();
      }
      //Verify Community link      
      public boolean verifyCommunitylink() {
    	  return Communitylink.isDisplayed();
      }
      //Tap on Community link 
      public void taponCommunitylink() {
    	  Communitylink.click();
      }
      //Verify Contactcustomercare link 
      public boolean verifyContactcustomercarelink() {
    	  return Contactcustomercarelink.isDisplayed();
      }
      //Tap on Contactcustomercare link 
      public void taponContactcustomercarelink() {
    	  Contactcustomercarelink.click();
      }
      //Verify Contactus link 
      public boolean verifyContactuslink() {
    	  return Contactuslink.isDisplayed();
      }
      //Tap on Contactus link 
      public void taponContactuslink() {
    	  Contactuslink.click();
      }
      
      
} 
