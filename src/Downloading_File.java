import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.xpath.compiler.Keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Downloading_File {

	public static void main(String[] args) throws AWTException, InterruptedException {
	// mime type
		/*
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);//0(desktop), 1(downloads  folder) , or 2(specified dir)
		profile.setPreference("browser.download.manager.showWhenStarting", false);// prevent Download Manager window
		profile.setPreference("browser.download.dir", "F:\\temp");//path
		//profile.setPreference("browser.helperApps.neverAsk.openFile",
				//"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/vnd.openxmlformats-officedocument.wordprocessingml.document,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet ");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/vnd.openxmlformats-officedocument.wordprocessingml.document,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);//warn the user attempting to open an executable from the Download Manager

	    WebDriver driver = new FirefoxDriver(profile);
	    driver.get("http://qtpselenium.com/test/testdownload.php");
	    driver.findElement(By.xpath("html/body/a[1]")).click();
	    driver.findElement(By.xpath("html/body/a[2]")).click();
	    driver.findElement(By.xpath("html/body/a[4]")).click();
	   */
		
		System.setProperty("webdriver.ie.driver", "f:\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://qtpselenium.com/test/testdownload.php");
	    driver.findElement(By.xpath("html/body/a[1]")).click();
	    
	    Robot rb = new Robot();
	    rb.keyPress(KeyEvent.VK_LEFT);
	    Thread.sleep(3000);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    
	 
	    
	   
	}
	

}
