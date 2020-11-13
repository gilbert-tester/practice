package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // driver is reference variable
		
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//WebElement industry = driver.findElement(By.id("Form_submitForm_Industry"));
		// drop down with Select html tag-- have to use Select class in Selenium
		
//		Select select_ind = new Select(industry);
//		
//		select_ind.selectByIndex(5);
//		select_ind.selectByVisibleText("Electronics"); // advised to use Visible text
//		select_ind.selectByValue("media");
		//driver.quit();
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By employee = By.id("Form_submitForm_NoOfEmployees");
		
		doDropDownSelectByVisibleText(industry, "Healthcare");
		doDropDownSelectByVisibleText(country, "Bangladesh");
		
		doDropDownSelectByValue(employee, "26 - 50");
		
		
	}
	
public static WebElement getElement (By locator) {
	return driver.findElement(locator);
}	
	
	public static void doDropDownSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
public static void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

public static void doDropDownSelectByIndex(By locator, int value) {
	Select select = new Select(getElement(locator));
	select.selectByIndex(value);
}

}
