package naveensLesson;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	WebDriver driver;

	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitleByJS() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.title").toString();
	}

	public void refreshBrowserByJS() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");

	}

	public void generateAlert(String message) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}

	public String getPageInnerText() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText").toString();
	}

	public void clickElementByJS(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public void sendKeysUsingJSwithID(String id, String value) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('" + id + "').value='" + value + "'");

	}

	public void scrolPageDown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrolPageDown(String height) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, '" + height + "')");
	}

	public void scrolPageUp() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public void scrolIntoView(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void drawBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '30px solid green'", element);
	}

	public void flashBorder(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgColor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 10; i++) {

			changeColor("rgb(0,200,0)", element); // 1
			changeColor(bgColor, element); // 2

		}

	}

	private void changeColor(String color, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}

	}

}
