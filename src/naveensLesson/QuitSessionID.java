package naveensLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitSessionID {

	public static void main(String[] args) throws InterruptedException {

		String userDirPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDirPath+"/driver/chromedriver");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://salliemae.com");
			
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/college-planning/']")).click();
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		driver.findElement(By.xpath("//a[text()='Register now']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_registration_UserName']")).sendKeys("AbulK");
		driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_registration_Password']")).sendKeys("M@rhaba1234");
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[3]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/div[1]/div[8]/div[1]/div[1]/span[1]")).sendKeys("M@rhaba1234");
	
		
		Thread.sleep(5000);
		
		
		
		//driver.quit();
		
		
	}

}
