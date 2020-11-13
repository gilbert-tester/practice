package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		// it will work if there is a "Title name = file "   title named "file" in the dom
		driver.findElement(By.id("file-upload")).sendKeys("/Users/mac/Downloads/MBA ATISH.pdf");
	}

}
