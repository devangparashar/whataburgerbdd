package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;



public class Cutomize2Page extends Testbase  {
	
	
	@FindBy(how=How.XPATH, using="(//div[@class='radio custom-radio'])[1]")
	public WebElement tapondrink;
		
	@FindBy(how=How.XPATH, using="//*[@id=\"customizationScreen2\"]/div/div/div/div[2]/div[1]/div[3]/div[2]/button")
	@CacheLookup
	public WebElement AddtoMyorder;
	
	
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'No Drink')]")
	@CacheLookup
	public WebElement Nodrinkpopup;
	
	
	public Cutomize2Page() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Tap on drink button and tap on Addtomyorder button
    public void taponAddtoMyOrder() throws Exception{
		 
		tapondrink.click();
		AddtoMyorder.click();
		Thread.sleep(5000);
		
		
		//Nodrinkpopup.click();
		
	}

	
	
	

}
