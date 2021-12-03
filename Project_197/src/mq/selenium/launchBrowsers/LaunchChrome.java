package mq.selenium.launchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under chrome click on documentation link
		 * 		=> Find chrome browser version and download chromeDriver
		 * 				w.r.t chrome browser version
		 * 				Chrome Browser =>  96.0
		 * 				Chrome Driver  =>  96.0
		 * 		=> Click on ChromeDriver version [It navigate to Index page]
		 * 		=> Downlaod Zip format file w.r.t Operating Systems
		 * 		=> Unzip file to back folder 
		 * 		=> with this action [You receive chromedriver.exe file]
		 * 		=> either set up environment variabe for chromedriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		
		
		//Setting Runtime Envrionment path for chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		
		//Open ChromeBrowser and Storring into Reference
		ChromeDriver chrome=new ChromeDriver();
		
		//Using Chrome Reference Load webpage
		chrome.get("http://facebook.com");
		
		//printing a title of current browser window
		System.out.println(chrome.getTitle());
		
		//Close active browser window
		chrome.close();
		
		
		
		
		
		
	}

}
