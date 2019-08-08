package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;


public class Customize1Page extends Testbase {
	
	

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Choose Side & Drink')]")
	@CacheLookup
	public WebElement choosedrinkbtn;
	
	public Customize1Page() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Tap on choosedrink button 
	public void taponchoosedrinkbtn(){
		
		choosedrinkbtn.click();
		}
	
	
	
	
	
	

}
