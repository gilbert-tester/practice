package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		//driver.switchTo().parentFrame(); move to parent frame
		String text =	driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
	}

}
