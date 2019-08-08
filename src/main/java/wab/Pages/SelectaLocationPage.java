package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;






public class SelectaLocationPage extends Testbase  {

	
	@FindBy(how=How.ID, using="search")
    @CacheLookup
    public WebElement enterlocation;
    
    @FindBy(how=How.XPATH, using="//button[@type='submit']")
    @CacheLookup
    public WebElement taponsearch;
    
    
    @FindBy(how=How.XPATH, using="//span[@id='select-loc-chevron']")
    @CacheLookup
    public WebElement taponcoret;
    
    
      public SelectaLocationPage() {
	  PageFactory.initElements(driver, this);
	  ;
  }    
       //Enter location and tap on search button and also tap on coret
       public void EnteraLocation() {
		
		enterlocation.sendKeys("906");
		taponsearch.click();
		
		taponcoret.click();
		
	}
  
  
  
}
