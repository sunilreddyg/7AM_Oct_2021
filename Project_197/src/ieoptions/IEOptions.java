package ieoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IEOptions 
{

	public static void main(String[] args) {
		
		
		InternetExplorerOptions ieoptions=new InternetExplorerOptions();
		ieoptions.ignoreZoomSettings();
		ieoptions.enablePersistentHovering();
		ieoptions.introduceFlakinessByIgnoringSecurityDomains();
		ieoptions.requireWindowFocus();
		ieoptions.takeFullPageScreenshot();
		ieoptions.withInitialBrowserUrl("http://gmail.com");
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(ieoptions);
		driver.get("http://naukri.com");
		
	}

}
