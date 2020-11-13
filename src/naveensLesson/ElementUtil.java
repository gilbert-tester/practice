package naveensLesson;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doActionsSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(element, value).perform();
	}

	public void doActionsClick(By locator) {
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.click(element).perform();

	}

	public boolean doDisplay(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean checkWebElementPresent(By locator) {

		int elementCount = driver.findElements(locator).size();
		System.out.println("Total element count : " + elementCount);

		if (elementCount > 0) {
			return true;

		} else {
			return false;
		}

	}

	// *************** Drop Down Utils ************************

	public void doDropDown_SelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public void doDropDown_SelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doDropDown_SelectByIndex(By locator, int value) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(value);
	}

	/**
	 * jquery dropdown handle
	 * "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/" This method is used
	 * to select Single, Multiple and all choices from the Drop Down. Please pass
	 * the unique values.
	 * 
	 * @param locator
	 * @param value...
	 */
	public void selectChoiceFromDropDown(By locator, String... value) {

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

	// ****** Wait utils ************
	
	public  List<WebElement> visibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public  void getPageLinksText(By locator, int timeOut) {
		
		visibilityOfAllElements(locator, timeOut).stream().forEach(ele -> System.out.println(ele.getText()));
		
	}

	public WebElement waitForElementToBeLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	public WebElement waitForElementToBeVisible(By locator, int timeOut) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOf(element));

	}

	public String waitForPageTitlePresent(String titleValue, int timeOut) {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}

	public Alert waitForAlertToBePresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public Boolean waitForUrl(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(url));

	}
	
	public void clickWhenReady(By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public WebElement waitForElementWIthFluentWait(By locator, int timeOut, int pollingTime) {
		// Wait is an interface and FluentWiat is a class
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);
		// WebElement is an interface
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public WebElement retryingElement(By locator) { //custom wait

		WebElement element = null;
		int attempts = 0;

		while (attempts < 30) {

			try {
				element = driver.findElement(locator);
				break;
			} 
			
			catch (StaleElementReferenceException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
			}

		}
			catch (NoSuchElementException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {

				}
				System.out.println("element is not found in attempt : " + (attempts + 1));
			}

			attempts++;
		}
		return element;
	}

}
