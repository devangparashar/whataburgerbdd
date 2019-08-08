package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;



public class StartNewOrderPage extends Testbase {
	
	@FindBy(how=How.XPATH, using="//div[@class='startOrderingBtnDiv desktop-view']//a[@class='btn wb-btn-default start-btn'][contains(text(),'Start New Order')]")
	@CacheLookup
	public WebElement taponstrtneworderbtn;
	
	@FindBy(how=How.XPATH, using=" //div[@class='col-lg-6 col-md-6 col-sm-12 col-xs-12']//div[@class='row']//span[contains(text(),'1 Item')]")
	@CacheLookup
	public WebElement taponfavoriteorder;
	
	public StartNewOrderPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Tap on Start New Order button 
	public void TaponStartNewOrdrbutton()
	{
		taponstrtneworderbtn.click();
	}

	//Tap on Favorite order button 
	public void TaponFavoriteorder() throws InterruptedException{
		
		taponfavoriteorder.click();
			
	}

}
