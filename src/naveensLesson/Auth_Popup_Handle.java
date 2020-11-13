package naveensLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auth_Popup_Handle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // driver is reference variable

		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// here username = admin and password = admin
		// add userName and Password right after https://admin:admin@
		// after userName add ":" after password add "@"

		
		String text = driver.findElement(By.id("content")).getText();
		System.out.println(text);
	
	}

}
