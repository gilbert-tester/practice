package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
static WebDriver driver;
	
	public static void main(String[] args) {

		//ExplicitWait --> 1. WebDriverWait 2. FluentWait
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.salliemae.com/college-planning/registration/?lnkid=SM-PlanHP-hero");
		
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.titleIs("Registration- College Planning"));
//		System.out.println(driver.getTitle());
		
		String registrationTitle = waitForPageTitlePresent("Registration", 10);
		System.out.println(registrationTitle);
		
		
		By pwdConfirm = By.cssSelector("#ctl00_cphMainContent_registration_lblConfirmPW");
		By email = By.cssSelector("#ctl00_cphMainContent_registration_EmailAddress");
		By firstName = By.cssSelector("ctl00_cphMainContent_registration_FirstName");
		
		
		waitForElementToBeLocated(pwdConfirm, 10).sendKeys("dlkslfklklk");	
		driver.findElement(email).sendKeys("abul@gamil.com");
		waitForElementToBeLocated(firstName, 10).sendKeys("Gilbert");
		
		
		//WebDriverWait is not a global wait
		// it will be applied to a specific element
		// we can customize this wait
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element_pwd = wait.until(ExpectedConditions.presenceOfElementLocated(pwdConfirm));
//		
//		element_pwd.click();
//		element_pwd.sendKeys("dsfsiuoritksdfksjflksjdlfkdjsfl");
//		driver.findElement(email).sendKeys("abul@gamil.com");
//				
	}
	
	
	public static WebElement waitForElementToBeLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static String waitForPageTitlePresent(String titleValue, int timeOut) {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		 wait1.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}
	

}
