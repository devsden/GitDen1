import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class Rediff {

	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
		
	//	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		
		// 1 window
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Total windows opened -> "+ windowIds.size());
		Iterator<String> it = windowIds.iterator();
		System.out.println(it.next());
		
		
		System.out.println("-------------------------");
		driver.get("http://in.rediff.com");
		//popup
		windowIds = driver.getWindowHandles();
		System.out.println("Total windows opened -> "+ windowIds.size());
		it = windowIds.iterator();
		String mainWindow = it.next();
		String popupWindow =it.next();
		System.out.println(mainWindow);
		System.out.println(popupWindow);
		driver.switchTo().window(popupWindow);
		driver.switchTo().activeElement();//IE
		driver.close(); // closes the window on which focus is there
		driver.switchTo().window(mainWindow);
		
		//popups/tabs
		//alerts
		//lightbox
		// http://qtpselenium.com/test/unpredictable.php
		
	}

}
