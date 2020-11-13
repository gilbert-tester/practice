package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SallieMae {
static WebDriver driver;
	public static void main(String[] args) {

		
		By collegePlanningLink = By.xpath("//*[@href='/college-planning/']");
		By logoDisplay = By.xpath("//a[@id='logo']");
		By header_h1 = By.tagName("h1");
		By registerBtn = By.linkText("Register now");
		By userName = By.cssSelector("#ctl00_cphMainContent_registration_UserName");
		By passWord = By.cssSelector("#ctl00_cphMainContent_registration_Password");
		By confirmPass = By.cssSelector("#ctl00_cphMainContent_registration_lblConfirmPW");
		
		By state = By.cssSelector("#ctl00_cphMainContent_registration_State_lblState");
		
		By selectState = By.cssSelector("ctl00_cphMainContent_registration_State_StateList");
		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome"); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		br.launchUrl("http://salliemae.com");
		System.out.println(br.getPageTitle());
		
		ElementUtil ele = new ElementUtil(driver);
		System.out.println("Logo is displaying : "+ele.doDisplay(logoDisplay));
		ele.doClick(collegePlanningLink);
		ele.doClick(registerBtn);
		ele.doClick(userName);
		ele.doSendKeys(userName, "ModonK");
		ele.doClick(passWord);
		ele.doSendKeys(passWord, "@marsonarBangla1971");
		ele.doActionsClick(confirmPass);
		ele.doActionsSendKeys(passWord, "@marsonarBangla1971");
	//	ele.doSendKeys(confirmPass, "@marsonarBangla1971");
		ele.doClick(state);
		//Select select = new Select((WebElement) selectState);
		
	//	select.selectByIndex(5);	
		
		
		//driver.navigate().back();
		
		
		System.out.println(ele.doGetText(header_h1));
		
			//	br.quitBrowser();
		
		
		
		
		
		
	}

}
