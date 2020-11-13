package naveensLesson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		
		String userDirPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", userDirPath+"/driver/chromedriver");
		WebDriver driver = new ChromeDriver(); //driver is reference variable
		
		driver.get("https://amazon.com");
		
		//get total number of images:
		
		List <WebElement> imageList = driver.findElements(By.tagName("img"));
		
		System.out.println("Total Images : "+imageList.size());
		
		for (int i = 0; i<imageList.size(); i++) {
			String source = imageList.get(i).getAttribute("src");
			String altText = imageList.get(i).getAttribute("alt");
			
			System.out.println(source);
			System.out.println(altText);
		}
		
		
		
		
		driver.quit();
	}

}
