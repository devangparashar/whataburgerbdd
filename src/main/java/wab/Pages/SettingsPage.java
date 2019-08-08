package wab.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wab.util.Testbase;




public class SettingsPage extends Testbase {
	
	
	
	@FindBy(how=How.XPATH, using="//input[@type='firstName']")
	public WebElement fistname;
	
	@FindBy(how=How.XPATH, using="//input[@type='lastName']")
	public WebElement lastname;

	@FindBy(how=How.XPATH, using="//span[@class='ng-tns-c15-6 ui-calendar ui-calendar-w-btn']//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar']")
	public WebElement birthday;
	
	@FindBy(how=How.XPATH, using="//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12']//input[@type='string']")
	public WebElement zipcode;
	
	@FindBy(how=How.XPATH, using="//div[@class='form-group text-right']//button[@type='submit']")
	public WebElement savebtn;
	
	
	
	public SettingsPage() {
		
	
		PageFactory.initElements(driver, this);
		
		
	}

}
