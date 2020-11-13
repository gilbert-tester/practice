package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement content_parentMenu = driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(content_parentMenu).build().perform();
		
		driver.findElement(By.linkText("COURSES")).click();
		
		
	}

}
