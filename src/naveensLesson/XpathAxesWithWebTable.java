package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesWithWebTable {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/");
		driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
		driver.findElement(By.id("password")).sendKeys("selenium@123456");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.navigate().to("https://app.hubspot.com/contacts/8589842/contacts/list/view/all/");
		
		//span[text()='Tom Cruze']//ancestor::td/preceding-sibling::td//span/input
		
		
		
	}
	
	
}
