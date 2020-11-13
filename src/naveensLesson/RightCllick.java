package naveensLesson;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.AcceptedW3CCapabilityKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightCllick {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement rightClickMe_Btn = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickMe_Btn).perform();
		
		List <WebElement> rightClickOptionsList = driver.findElements(By.xpath("//li[contains(@class, 'context-menu-icon')]"));
		System.out.println(rightClickOptionsList.size());
		
		for (WebElement ele : rightClickOptionsList) {
			String text = ele.getText();
			System.out.println(text);
			if (text.equals("Copy")) {
				ele.click();
				break;
			}
			
		}		
	}

}
