package naveensLesson;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement industry = driver.findElement(By.id("Form_submitForm_Industry"));
		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		
		Select industry_select = new Select(industry);
		
		List <WebElement> ind_options_list = industry_select.getOptions();
		
		
		System.out.println(ind_options_list.size());
		
		
//		for(WebElement ele : ind_options_list) {
//			String text = ele.getText();
//			System.out.println(text);
//		}
		
		//or
		
		for (int i = 0; i < ind_options_list.size(); i++) {
			String text = ind_options_list.get(i).getText();
			System.out.println(text);
			
			if (text.equalsIgnoreCase("automotive")) 
			{
				ind_options_list.get(i).click();
				break;
			}
		}
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static List<String> getAllDropDownOptionsList(By locator) {
		
		WebElement element = getElement(locator);
		List<String> optionsValueList = new ArrayList<String>();
		
		
		Select select = new Select (element);
		
		List <WebElement> optionsList = select.getOptions();
		
		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
optionsValueList.add(text);			
				
	}
	
		return optionsValueList;
	
	
	
				
		
		}
	
}
