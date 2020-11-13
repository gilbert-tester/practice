package naveensLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
		// custom css:
		// id --> #id or html#id
		// class --> .className or htmlTag.className
		
/*		
		
		https://app.hubspot.com/login
	
	id	
		#username
		input#username

	class
		
		--> form-control private-form__control login-email
				 
		 .form-control 
		 input.form-control 
		 
		 .private-form__control
		 input.form-control
		
		.login-email 
		 input.login-email
		.form-control.private-form__control.login-email
		input.form-control.private-form__control.login-email
		
		
		id and class combine
		.login-email#username
		input.login-email#username
		
		#username.login-email
		input#username.login-email
		
		input.form-control.private-form__control.login-email#username

		
		custom css: 
		htmlTag[attribute = 'value']
		input[id='username'] --> css selector
		//input[@id='username'] --> x-path
		
		
		[attr1 = 'value'][attr2 = 'value']
		htmlTag[attr1 = 'value'][attr2 = 'value']
		htmlTag[attr1 = 'value'][attr2 = 'value'][attr3 = 'value']
		htmlTag[attr1 = 'value'][attr2 = 'value'][attr3 = 'value'][attr4]
		
		
		input[id='username'][tabindex='1'][type='email']
		
		input[id='username'][tabindex='1'][type='email'][class]
		
		input[id][type][class]
		input[id][type]
		input[id]
		
		Parent to child
		
		div.private-form__input-wrapper input#username
		div.private-form__input-wrapper > input#username

	https://www.freshworks.com/
	
	ul.footer-nav li a 					//parent to child
or
	ul.footer-nav > li > a 					//parent to child
	
	
	#note# we can not doo backward traversing like child to parent
	
	https://app.hubspot.com/login
	
	=> contains keyword = * 
	
	input[id*='username']
	input[id* ='user']
	input[id*='name']
	
	
	=> starts-with keywords = ^ (keyboard shift 6)
	
	input[id^='user']
	
	=> ends-with keyword = $
	
	input[id$='name']
	
	# No text function or CSS #
	
	Comma in CSS:
	https://app.hubspot.com/login
	
	input#username, input#password, button#loginBtn   --> 3 elements together
	
	
*/		
driver.get("https://app.hubspot.com/login");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")); // ok
driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")); //ok
driver.findElement(By.className("form-control private-form__control login-email")); //wrong
driver.findElement(By.className("login-email")); // ok

int loginFormCount = driver.findElements(By.cssSelector("input#username, input#password, button#loginBtn")).size();

if(loginFormCount==3) {
	
	System.out.println("My login form count is displayed with all the elements...");
	
}

	}

}
