package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wab.util.Testbase;

public class HomePage extends Testbase  {
	
	
	@FindBy(xpath="//a[contains(@class, 'navbar-brand hidden-xs hidden-sm visible-md visible-lg')]//img")
	public WebElement WBlogo;
	
	@FindBy(how=How.XPATH, using="//a[@class='btn btn-default btn-sm order-cart-btn desktop-view']")
	public WebElement taponstartorderingbtn;
	
	@FindBy(how=How.XPATH, using="//span[@class='signout']")
	public WebElement taponsignoutbtn;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Yes, Sign Out')]")
	public WebElement taponsignoutpopupbtn;
	
	//@FindBy(how=How.XPATH, using="//span[text()='Test!']")
	//public WebElement taponusername;
	
	@FindBy(how=How.XPATH, using="//span[@class ='user-name']")
	public WebElement taponusername;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav wab-nav']//li[1]//a[1]")
	public WebElement menulink;
	
	@FindBy(xpath="//img[@src='../../../assets/images/navigation/top-location-icon.png']")
	public WebElement searchlocationbox;
	
	@FindBy(xpath="//img[@src='../../../assets/images/navigation/top-location-icon.png']")
	public WebElement searchlocationbtn;
	
	@FindBy(xpath="//a[contains(text(),'COMPANY')]")
	public WebElement companylink;
	
	@FindBy(xpath="//a[contains(text(),'SHOP WHATASTORE™')]")
	public WebElement shopwhatastorelink;
	
	@FindBy(xpath="//a[contains(text(),'ORDERING & REWARDS')]")
	public WebElement orderingandrewardlink;
	
	@FindBy(xpath=" //a[contains(text(),'CONNECT')]")
	public WebElement connectlink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Verify WAB logo
	public void Validatehomepagetitle() throws Exception {
		driver.getCurrentUrl();
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Whataburger | Home", title);
		Thread.sleep(8000);
		
	}
	
	//Tap on StartOrdering button 
   public void TaponStartorderingbutton() throws Exception {
	
	Thread.sleep(8000);
	//wait.until(ExpectedConditions.elementToBeClickable(taponstartorderingbtn));
	taponstartorderingbtn.click();
		
		
			}
    //Tap on Signout button in home screen
	public void TaponSignoutbutton() throws Exception {
		Thread.sleep(5000);
		taponsignoutbtn.click();
		
			}
	
	//Tap on Sign out button in pop up 
	public void TaponSignoutpopupbutton() throws Exception {
		Thread.sleep(5000);
		taponsignoutpopupbtn.click();
	}
	
	//Tap on User name in Home screen 
	public void TapOnUsername() {
				
	 taponusername.click();
		
		 
	}
	
	//Tap on Menu link in home screen
	public void TaponMenulink() {
		
		menulink.click();
	}
	
	//Tap on Searchlocation button in home screen
	public void TaponSearchlocation() throws Exception {
		
		
		searchlocationbox.sendKeys("906");
	      searchlocationbox.click();
		}
	//Tap on Company link in Home screen 
	public void TaponCompanylink() {
		companylink.click();
	}
	
	//Tap on showwhatastore link in home screen 
	public void TaponShopwhatastorelink() {
		
		shopwhatastorelink.click();
	}
	
	//Tap on orderinggandreward link in home screen 
	public void TaponOrderingandrewardlink() {
		orderingandrewardlink.click();
	}
	
	//Tap on Connect link in home screen 
	public void TaponConnectlink() {
		connectlink.click();
	}
	
	

}
