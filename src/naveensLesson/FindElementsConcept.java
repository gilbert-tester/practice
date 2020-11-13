package naveensLesson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

		// find out total number of lnks on the page
		// print the text of each link
		// and ignore the blank text links
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ebay.com");
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total links "+linkList.size());

		for (int i = 0; i < linkList.size(); i++) {
			
			String text = linkList.get(i).getText();
			//System.out.println(text);
			
			if(!text.isEmpty()) {
				//System.out.println(text);
				System.out.println(i+" ----> "+text); //include serial numbers
				String attributeList = linkList.get(i).getAttribute("href");
				System.out.println(attributeList);
			}
		}
		//or 
		//streams :
		linkList.stream().forEach(modon -> System.out.println(modon.getText()));
		
		
		driver.quit();
	
	
	
	}

}
