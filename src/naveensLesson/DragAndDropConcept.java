package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {
 static WebDriver driver;
 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
	
	Actions action = new Actions(driver);
	
	//action.dragAndDrop(source, target).perform();
	action.clickAndHold(source).moveToElement(target).release().build().perform();
	}

}
