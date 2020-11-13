package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitConcept {
	
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
		String text = eleUtil.retryingElement(helloText).getText();
		Thread.sleep(6000);
	System.out.println(helloText);
	System.out.println(text);

}

}
