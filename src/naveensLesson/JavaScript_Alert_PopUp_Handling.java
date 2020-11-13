package naveensLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Alert_PopUp_Handling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // driver is reference variable

		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		if (text.equals("You clicked a button")) {
			System.out.println("Correct pop up message");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();

		driver.findElement(By.id("confirmButton")).click();

		alert.dismiss();

		driver.findElement(By.id("promtButton")).click();

		alert.sendKeys("Praise the Lord!");
		alert.accept();
		driver.switchTo().defaultContent();

	}

}
