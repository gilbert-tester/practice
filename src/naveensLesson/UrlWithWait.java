package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlWithWait {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign up"))).click();
		
		if(wait.until(ExpectedConditions.urlContains("signup"))){
			System.out.println("Sign up page url is correct");
		}
		else {
			
			System.out.println("Sign up page URL is not correct");
		}
		
	}

}
