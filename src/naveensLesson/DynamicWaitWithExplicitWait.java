package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithExplicitWait {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		By start = By.cssSelector("div #start button");
		
		//By helloText = By.xpath("//h4[contains(text(),'Hello World!')]");
		By helloText = By.xpath("//div[@id='finish']/h4");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.retryingElement(start).click();

		//Thread.sleep(5000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.textToBe(helloText, "Hello World!"));
		System.out.println(driver.findElement(helloText).getText());
		
	}

}
