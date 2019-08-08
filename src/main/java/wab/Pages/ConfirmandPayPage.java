package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;


public class ConfirmandPayPage extends Testbase  {
	
	@FindBy(how=How.XPATH, using="//strong[contains(text(),'ASAP')]")	
	public WebElement SetPickUpTimeASAP;	
	
	@FindBy(how=How.XPATH, using="//strong[contains(text(),'Schedule Time')]")	
	public WebElement SetPickUpTimeScdehuleTime;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn wb-btn-default']")	
	public WebElement SetPickUpTimebtn;
	
	
	//@FindBy(how=How.XPATH, using="//label[@for='dinein']")	
//	public WebElement Radiobtn;		
	
	@FindBy(how=How.XPATH, using="//label[@for='drivethru']")	
	public WebElement Radiobtn;		
	
	 
	
	@FindBy(how=How.XPATH, using="//button[@class='btn wb-btn-default mg-top-38']")	
	public WebElement SetPickMethodbtn;		
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Place Order')]")	
	public WebElement PlaceOrder;
	
	
	
	public ConfirmandPayPage() {
		
		PageFactory.initElements(driver, this);
	}
	  
	// To select pickuptime, pickup method and tap on place order button 
	public void ConfirmandPayscreen() {	
		SetPickUpTimeASAP.click();
		SetPickUpTimebtn.click();
		Radiobtn.click();		
		SetPickMethodbtn.click();		
		PlaceOrder.click();

}
}