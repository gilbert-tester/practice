package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForClickableElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		By signUpLink = By.linkText("Sign up");
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
		
//		ElementUtil ele = new ElementUtil(driver);
//		ele.clickWhenReady(signUpLink, 10);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		
		
	}

}
