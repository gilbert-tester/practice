package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By emailID = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		doActionsSendKeys(emailID, "modon@gmail.com");
		doActionsSendKeys(pwd, "modon@gmail.com");
		doActionsClick(loginBtn);
		
//		WebElement emailID = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

//		Actions action = new Actions(driver);
//		action.sendKeys(emailID, "modon@gmail.com").perform();
//		action.sendKeys(pwd, "modon@gmail.com").perform();
//		action.click(loginBtn).perform();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(element, value).perform();
	}

	public static void doActionsClick(By locator) {
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.click(element).perform();

	}

}
