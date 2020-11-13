package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		System.out.println(jsUtil.getTitleByJS());
		
		//jsUil.refreshBrowserByJS();
		
		//jsUil.generateAlert("This is bengali Newspaper.. yellow news...");
		
	/*	String innerText = jsUil.getPageInnerText();
		
		System.out.println(innerText);
		
		if (innerText.contains("PrivacyTermsSettings")) {
			
			System.out.println("PrivacyTermsSettings is present on the page");
		}
	*/
		//jsUil.clickElementByJS(driver.findElement(By.xpath("//span[contains(text(),'Platform')]")));
		
		//jsUil.sendKeysUsingJSwithID("username", "modon@gail.com");
		
		jsUtil.scrolPageDown();
		Thread.sleep(500);
		jsUtil.scrolPageUp();
		
//		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Unlock with your fingerprints')]"));
//		jsUtil.scrolIntoView(element);
		
		WebElement formElement = driver.findElement(By.xpath("//form[@id ='hs-login']"));
		//jsUtil.drawBorder(formElement);
		
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.id("password"));
	WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
		jsUtil.flashBorder(username);
		username.sendKeys("modon@gail.com");
		jsUtil.flashBorder(password);
		password.sendKeys("lkflkdsklfjsdl");
		jsUtil.flashBorder(loginBtn);
		loginBtn.click();
		
		
		//driver.quit();
	}

}
