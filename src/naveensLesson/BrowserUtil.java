package naveensLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to launch or initialize browser
	 * 
	 * @param browser
	 * @return this return driver
	 */

	public WebDriver init_driver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}

		else {

			System.out.println("Please pass the correct browser " + browser);
		}
		return driver;
	}

	/**
	 * This is used to launch url
	 * 
	 * @param url
	 */

	public void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * This is used to get the title of the page
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * This is used to get current page URL
	 * 
	 * @return
	 */
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();

	}

}
