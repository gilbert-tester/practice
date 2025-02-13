package naveensLesson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElements {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
		
		By footerLinks = By.xpath("//ul[@class='footer-nav']//a");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		List<WebElement> footerLinksList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));
		
//		for (WebElement ele : footerLinksList) {
//			System.out.println(ele.getText());
//		}
		
		//footerLinksList.stream().forEach(ele -> System.out.println(ele.getText()));
		getPageLinksText(footerLinks, 10);
	
	}
	
	public static List<WebElement> visibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public static void getPageLinksText(By locator, int timeOut) {
		
		visibilityOfAllElements(locator, timeOut).stream().forEach(ele -> System.out.println(ele.getText()));
		
	}
	
}
