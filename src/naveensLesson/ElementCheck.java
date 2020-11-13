package naveensLesson;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheck {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		By emailID = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		System.out.println(checkWebElementPresent(emailID));
		System.out.println(checkWebElementPresent(pwd));
		System.out.println(checkWebElementPresent(loginBtn));

//		List <WebElement> loginBynList = driver.findElements(By.id("loginBtn"));
//		
//		System.out.println(loginBynList.size());
//		
//		if (loginBynList.size()>0) {
//			System.out.println("Element is present on the page");
//		}else {
//			System.out.println("element is not present on the page");
//		}
	}

	
	public static boolean checkWebElementPresent (By locator) {
		
		int elementCount = driver.findElements(locator).size();
		System.out.println("Total element count : "+ elementCount);
	
	if (elementCount>0) {
		return true;
		
	}else {
		return false;
	}
	
	}
}
