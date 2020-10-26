package naveensLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
/*		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
*/		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo = new FirefoxOptions();
		
		WebDriver driver = new FirefoxDriver(fo);
		fo.addArguments("--headless");
		
		System.out.println(fo.getBrowserName());
		
		
		
		
		driver.get("https://salliemae.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
	}

}
