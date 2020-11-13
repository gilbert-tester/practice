package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// create webElement + actions (click, sendkeys, get text)

		// 1. id:
// 		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();

		// 2
//		WebElement userId = driver.findElement(By.id("txtUsername"));
//		WebElement pwd = driver.findElement(By.id("txtPassword"));
//		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
//
//		userId.sendKeys("Admin");
//		pwd.sendKeys("admin123");
//		loginBtn.click();

		// 3rd approach
		// By locator: POM
		By userId = By.id("txtUsername");
		By pwd = By.id("txtPassword");
		By loginBtn = By.id("btnLogin");

//		WebElement userInfo = driver.findElement(userId);
//		WebElement password = driver.findElement(pwd);
//		WebElement loginButton = driver.findElement(loginBtn);
//		
//		userInfo.sendKeys("Admin");
//		password.sendKeys("admin123");
//		loginButton.click();

		// 4th approach
//		getElement(userId).sendKeys("Admin");
//		getElement(pwd).sendKeys("admin123");
//		getElement(loginBtn).click();
//5th approach
		doSendKeys(userId, "Admin");
		doSendKeys(pwd, "admin123");
		doClick(loginBtn);
		driver.quit();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
