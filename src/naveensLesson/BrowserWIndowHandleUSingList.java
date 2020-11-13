package naveensLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWIndowHandleUSingList {

	public static void main(String[] args) {

		String userDirPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDirPath+"/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		
		Set <String> handlesSet = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handlesSet); // top casting  
		
//		for(String s : handlesList) {
//			System.out.println(s);
//		}
		
		String parentWindowID = handlesList.get(0);
		String chilWindowID = handlesList.get(1);
		
		driver.switchTo().window(chilWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		
		
		
		driver.quit();
	}

}
