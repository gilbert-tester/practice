package naveensLesson;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery_DropDown_Handle {
	static WebDriver driver;
static final String SELECT_ALL_OPTIONS = "all";



	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("justAnInputBox")).click();

		By choices_span = By.xpath("//span[@class='comboTreeItemTitle']");

		// Multi selection:
		// selectChoiceFromDropDown(choices_span, "choice 2", "choice 4", "choice 6 2
		// 2", "choice 1", "choice 7");

		// Single Selection:
		selectChoiceFromDropDown(choices_span, "choice 2");

		// all the value selection
		// if (!value[0].equalsIgnoreCase("all")) { }
		 selectChoiceFromDropDown(choices_span, Jquery_DropDown_Handle.SELECT_ALL_OPTIONS);
	}

	
	
	/**
	 * This method is used to select Single, Multiple and all choices from the Drop Down.
	 * Please pass the unique values.
	 * @param locator
	 * @param value...
	 */
	public static void selectChoiceFromDropDown(By locator, String... value) {

		List<WebElement> choiceList = driver.findElements(locator);

		if (!value[0].equalsIgnoreCase("all")) {

			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}

				}
			}

		}

		else {
			try {

				for (int a = 0; a < choiceList.size(); a++) {
					choiceList.get(a).click();
				}
			} catch (Exception e) {
			}
		}
	}
}
