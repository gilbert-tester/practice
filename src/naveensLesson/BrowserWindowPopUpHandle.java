package naveensLesson;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpHandle {

	public static void main(String[] args) {

		String userDirPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDirPath + "/driver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();

		Set<String> handlesSet = driver.getWindowHandles();

		Iterator<String> it = handlesSet.iterator();

		String parentWindowID = it.next();

		System.out.println("Parent window id is : " + parentWindowID);

		String childWindowID1 = it.next();

		System.out.println("1st Child window id is : " + childWindowID1);

		
		driver.switchTo().window(childWindowID1);
		System.out.println("1st Child window title is : " + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowID);
		
		System.out.println("Title of the Parent window : " + driver.getTitle());
		System.out.println("Parent window id is : " + parentWindowID);
		

	
		driver.close();

	}

}
