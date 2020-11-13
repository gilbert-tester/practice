package naveensLesson;

public class Custom_Xpath_01 {

	public static void main(String[] args) {

		/*
		 * xpath : is a locator not an attribute in HTML DOM xPATH : 1. absolute xpath
		 * 2. Relative xpath
		 * 
		 * abs xpath:
		 * /html[1]/body[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[2]/
		 * input[1]
		 * 
		 * relative xpath: custom xpath using xpath functions and axes
		 * 
		 * https://app.hubspot.com/login //input[@id='username'] // htmlTag[@attribute1
		 * = 'value'] //input[@type ='email'] //input[@id = 'username' and @type =
		 * 'email'] //input[@id = 'username' and @type and @class and @value]
		 * //input[@id = 'username' and @type and @class] //input[@id = 'username'
		 * and @type] //input[@id = 'username' or @type = 'email']
		 * 
		 * https://www.freshworks.com/
		 * 
		 * //text() function
		 * 
		 * //htmlTag[text()='value']
		 * 
		 * //h1[text()='The smartphone moment in business software is here'] or
		 * //h1[contans(text()='The smartphone moment in business software is here')]
		 * //h1[contans(text()='The smartphone moment')]
		 * 
		 * //h2[text()='Refreshing business software that your teams will love'] or
		 * //h2[contains (text(),'Refreshing business')]
		 * 
		 * 
		 * //span[text()='Platform']
		 * 
		 * http://classic.crmpro.com/
		 * 
		 * //h3[text()='Companies & Contacts']
		 * 
		 * or //*[text()='Companies & Contacts']
		 * 
		 * //htmlTag[@id='value' and text()='value']
		 * 
		 * 
		 * Note # we don't use @ sign in function here text() is function but @id, @href
		 * these are attribute
		 * 
		 * //contains() function contains is used for dynamic attributes or dynamic text
		 * //htmlTag[contains(@id, 'value')]
		 * 
		 * //input[contains(@id,'user_')]
		 * 
		 * Tips: while using Contains method.. never use "=" sign always use ","
		 * 
		 * 
		 * class attribute in xpath https://app.hubspot.com/login //input[@class
		 * ='form-control private-form__control login-email']
		 * 
		 * 
		 * //input[contains(@class,'form-control')] // 2 result in same xpath
		 * 
		 * (//input[contains(@class,'form-control')])[1] <-- // method for 1st xpath or
		 * (//input[contains(@class,'form-control')])[position()=1]
		 * 
		 * (//input[contains(@class,'form-control')])[2] // method for 2nd xpath or
		 * (//input[contains(@class,'form-control')])[position()=2]
		 * 
		 * https://www.orangehrm.com/orangehrm-30-day-trial/
		 * 
		 * //input[@type='text'] // elements found
		 * 
		 * (//input[@type='text'])[1] // 1 out of number 6
		 * 
		 * (//input[@type='text'])[6] //6 out of number 6 or
		 * (//input[@type='text'])[position()=6]
		 * 
		 * or (//input[@type='text'])[last()] // it will work only for the last position
		 * 
		 * //input[starts-with(@id,'Form_submitForm_F')] // start-with
		 * 
		 * 
		 * https://www.freshworks.com/
		 * 
		 * //parent to child: single slash / -means direct child
		 * //ul[@class='footer-nav']/li/a -->// 28 links are available with this xpath
		 * FOR DRIVER.FINDELEMENTS
		 * 
		 * 
		 * SINGLE SLASH --> direct child //div[contains(@class,'copyrights-nav')]/a
		 * -->//GETTING 8 ELEMENTS
		 * 
		 * DOUBLE SLASH --> direct + indirect child
		 * //div[contains(@class,'copyrights-nav')]///a -->//GETTING 8 ELEMENTS
		 * 
		 * 
		 * https://app.hubspot.com/login
		 * 
		 * //div[@class='private-form__input-wrapper']/input --> it will show 2 elements
		 * 
		 * 
		 * //form[@id='hs-login']/div --> it will show 8 elements (only direct child
		 * element)
		 * 
		 * //form[@id='hs-login']//div --> it will show 20 elements (bot direct parent +
		 * child element)
		 * 
		 * 
		 * 
		 * // backward traversing:
		 * 
		 * from bottom to top or child to parent
		 * 
		 * //input[@id='username']/../../../../..
		 * 
		 * 
		 * //input[@id='username']/.. --> for going to child to parent or
		 * //input[@id='username']//parent::div --> using parent keyword
		 * 
		 * 
		 * //input[@id='username']//ancestor::form --> ancestor keyword for going to
		 * grand parent element
		 * 
		 * 
		 * //div[@class='private-form__control-wrapper']//child::input --> using child
		 * keyword showing 2 element
		 * 
		 * //div[@class='private-form__control-wrapper']//child::input[@id='username']
		 * --> showing 1 element only
		 * 
		 * parent to child: 
		  
		  //form[@id='hs-login']//div --> 20 elements with double slash
		  //form[@id='hs-login']/div --> 8 elements with double slash

		  //form[@id='hs-login']//child::div --> 20 elements with double slash
		  //form[@id='hs-login']/child::div --> 8 elements with double slash
		 * 
		 * //form[@id='Form_submitForm']//following::input[@type='text']
		 * --> following keyword
		 * 
		 * //input[@id='Form_submitForm_FirstName']//preceding::div
		 * --> keyword preceding used for get all the 60 elements with div inside the dom
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
