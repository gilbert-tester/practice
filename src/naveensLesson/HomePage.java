package naveensLesson;

public class HomePage {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
		br.init_driver("chrome");
		br.launchUrl("https://www.salliemae.com");
		
		String title = br.getPageTitle();
		System.out.println(title);
		
		String currentURL = br.getCurrentPageUrl();
		System.out.println(currentURL);
		
		
		
		br.quitBrowser();
	}

}
