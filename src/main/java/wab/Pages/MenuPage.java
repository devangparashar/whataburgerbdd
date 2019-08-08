package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;



public class MenuPage extends Testbase {


	
	//BurgerCategorytap
		@FindBy(how=How.XPATH, using="//h4[contains(text(),'Burgers')]")
		@CacheLookup
		public WebElement taponburgercategoery; 
		
		//taponDoubleMeatWhataburger
		@FindBy(how=How.XPATH, using="//span[contains(text(),'Double Meat Whataburger®')]")
		@CacheLookup
		public WebElement taponchilditem; 
	
	
	public MenuPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	// Tap on Burger category and tap on Double Meat Whataburger menu 
	public void taponburgercat() throws Exception {
		Thread.sleep(5000);
		
		taponburgercategoery.click();
		taponchilditem.click();

	}
	
}
