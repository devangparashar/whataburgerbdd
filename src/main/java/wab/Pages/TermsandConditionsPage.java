/**
 * 
 */
package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;




/**
 * @author 703177869
 *
 */
public class TermsandConditionsPage extends Testbase  {
	
	
		
	@FindBy(xpath="//label[@for='agree']")
	@CacheLookup
	public WebElement termscheckbox;
	
	@FindBy(xpath="//button[@value='Sign up']")
	@CacheLookup
	public WebElement Agreebtn;
    
	
	@FindBy(xpath="//span[@name='signup']")
	@CacheLookup
	public WebElement DoNotAgreebtn;
	
		
	public TermsandConditionsPage() {
		PageFactory.initElements(driver, this);
	
	}
	
	//Tap on terms&conditions checkbox
	public void TaponTermsCheckbox() {
		
		
		termscheckbox.click();
		
		}
	//Tap on Agree button 
	public void TaponAgreebutton() throws Exception {
		
	
		Agreebtn.click();
		Thread.sleep(8000);		
	}

   	public boolean verifytermscheckbox() {
  	
  	return termscheckbox.isDisplayed();
  }
  
  public void checktermscheckbox() {
  	termscheckbox.click();
  	
  }
  
  public boolean verifyAgreebutton() {
  	return Agreebtn.isDisplayed();
  	}
  
 
}
