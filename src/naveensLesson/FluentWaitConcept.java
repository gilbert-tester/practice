package naveensLesson;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {

		// Explicit Wait:
			//1. WebDriverWait
			//2. FluentWait
				//a. Timeout b. pollingPeriod, c.  ignoringException
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		By userName = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@type = 'submit']");
		waitForElementWIthFluentWait(userName, 15, 2);
		driver.findElement(password).sendKeys("B@ngladesh1971");
		driver.findElement(login).click();
		
		//Wait is an interface and FluentWiat is a class
//		Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
//									.withTimeout(Duration.ofSeconds(15))
//									.pollingEvery(Duration.ofSeconds(3))
//									.ignoring(NoSuchElementException.class);
//		//WebElement is an interface
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(userName));
//		
//		username_ele.sendKeys("gilbert.baidya.tester@gmail.com");
//		
//		driver.findElement(password).sendKeys("B@ngladesh1971");
//		driver.findElement(login).click();
				
	}
	
	public static   WebElement waitForElementWIthFluentWait (By locator, int timeOut, int pollingTime) {
		//Wait is an interface and FluentWiat is a class
				Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
											.withTimeout(Duration.ofSeconds(timeOut))
											.pollingEvery(Duration.ofSeconds(pollingTime))
											.ignoring(NoSuchElementException.class);
				//WebElement is an interface
				return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				
		
	}
	

}
