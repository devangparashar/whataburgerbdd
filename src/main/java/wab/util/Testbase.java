package wab.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	// public static WebEventListener eventListener;

	public Testbase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"D:\\workspace\\BDDFramworkWithTestng\\src\\main\\java\\Config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
  
	//@BeforeMethod
	//@Parameters("browser")
	public static  void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("Chrome")) {

			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\WhataburgerTest\\exe\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("FF")) {
			System.out.println("launching firefox browser");
			System.setProperty("webdriver.gecko.driver", "D:\\workspace\\WhataburgerTest\\exe\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			System.setProperty("webdriver.edge.driver",
					"D:\\workspace\\WhataburgerCrossBrowserTest\\exe\\MicrosoftWebDriver.exe");
			// create Edge instance
			driver = new EdgeDriver();

			try {
				Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		else {
			// If no browser passed throw exception
			try {
				throw new Exception("Browser is not correct");
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		// e_driver = new EventFiringWebDriver(driver);
		// eventListener = new WebEventListener();
		// e_driver.register(eventListener);
		// driver=e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		return;
	}
}
