package wab.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;



public class MyOrderSummaryPage extends Testbase {

	
	@FindBy(xpath="//button[contains(text(),'Checkout')]")	
	public WebElement Checkoutbtn;		
	
	
	@FindBy(xpath="//button[contains(text(),'Not Now')]")	
	public WebElement favpopupnotnow;
	
	@FindBy(xpath="//button[contains(text(),'Yes, Add to Favorite')]")	
	public WebElement favpopupyesaddtofavorite;
	
	@FindBy(xpath="//input[@id='favName']")	
	public WebElement savetofavoriteordereditbox;
	
	@FindBy(xpath="//button[@type='submit']")	
	public WebElement saveasfavoritebutton;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-plus']")
	public WebElement positivestepper;
	
	@FindBy(xpath="//button[contains(text(),'Schedule Order')]")
	public WebElement scheduleorderbtn;	
	
	
	
	
	public MyOrderSummaryPage()
{
		PageFactory.initElements(driver, this);
		
}
	
	
	//Tap on Checkout button 
    public void Taponcheckoput() {				
		
		Checkoutbtn.click();			}		
	
	//To scroll the page 		
	public void scrollDown(){		 //to perform Scroll on application using  Selenium		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("window.scrollBy(0,720)", "");}
	
	//Tap on Yes add to favorite button in favorite pop up 
	public void TaponYesaddtofavorite()
	{
		favpopupyesaddtofavorite.click();
	}
	
	//Tap on enter favorite order name and tap on Save as Favorite button in pop up 
	public void EnterFavoriteordername() throws InterruptedException
	{
		savetofavoriteordereditbox.sendKeys("devang");
		saveasfavoritebutton.click();
		
	}
	
	//Tap on '+' button in My Order Summary screen 
	public void TaponStepper() throws Exception {
		
		for (int i = 0; i < 10; i++){
			 //click the button
			 
			positivestepper.click();
			//wait 10 seconds
			  Thread.sleep(2000);
			  //check that data is being generated correctly
			  }
		}
	
	
	public void TaponSchedulebtn() {
		scheduleorderbtn.click();
	}
	
	//Tap on Not Now button in favorite pop up 
	public void TaponNotnowfav() {		
		
		favpopupnotnow.click();	
		}
}