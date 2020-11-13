package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Movement_SpiceJet {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement loginLink = driver.findElement(By.cssSelector("#ctl00_HyperLinkLogin"));
		//WebElement membersLink = driver.findElement(By.partialLinkText("SpiceClub Members"));
		
		Actions action = new Actions (driver);
		
		action.moveToElement(loginLink).perform();
		//action.moveToElement(membersLink).build().perform();
		
		
		
		
	}

}
