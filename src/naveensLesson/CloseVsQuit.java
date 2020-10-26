package naveensLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {

	String userDirPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", userDirPath+"/driver/chromedriver");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://salliemae.com");
		
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	//ChromeDriver: chrome on MAC (d0fe23def1ce98b3c41d6f14947f5fc8)
	}

}
