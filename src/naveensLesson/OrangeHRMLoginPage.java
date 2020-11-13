package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {
static WebDriver driver;
	public static void main(String[] args) {

	
	
		By userId = By.id("txtUsername");
		By pwd = By.id("txtPassword");
		By loginBtn = By.id("btnLogin");
		By logo = By.id("divLogo");
		By adminLink = By.xpath("//b[contains(text(),'Admin')]");
		By welcomeName = By.id("welcome");
		By pimLink = By.xpath("//b[contains(text(),'PIM')]");
		By leaveLink = By.xpath("//b[contains(text(),'Leave')]");
		By timeLink = By.xpath("//b[contains(text(),'Time')]");
		By recruitmentLink = By.xpath("//b[contains(text(),'Recruitment')]");
		By myInfoLink = By.xpath("//b[contains(text(),'My Info')]");
		By performanceLink = By.xpath("//b[contains(text(),'Dashboard')]");
		By dashboardLink = By.xpath("//b[contains(text(),'PIM')]");
		By directoryLink = By.xpath("//b[contains(text(),'Directory')]");
		By buzzLink = By.xpath("//b[contains(text(),'Buzz')]");
		
	
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		
		br.launchUrl("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(br.getPageTitle());
		
		ElementUtil ele = new ElementUtil(driver);
		
		ele.doSendKeys(userId, "Admin");
		ele.doSendKeys(pwd, "admin123");
		Boolean logoDisplay = ele.doDisplay(logo);
		System.out.println(logoDisplay);
		
		ele.doClick(loginBtn);
		String title = br.getPageTitle();
		System.out.println(title);
		ele.doClick(adminLink);
		
		String welcome = ele.doGetText(welcomeName);
		System.out.println(welcome);
		
		ele.doClick(buzzLink);
		ele.doClick(directoryLink);
		ele.doClick(dashboardLink);
		ele.doClick(performanceLink);
		ele.doClick(myInfoLink);
		ele.doClick(recruitmentLink);
		ele.doClick(timeLink);
		ele.doClick(leaveLink);
		ele.doClick(pimLink);
		
		br.quitBrowser();
		
	}

}
