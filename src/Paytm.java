import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Paytm {

	public static void main(String[] args) {
		WebDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://paytm.com");
		
		driver.findElement(By.xpath("//*[@id='logo-bar']/div[1]/ul/li[1]/a")).click();
		
		// switch over the control to frame
		//hit and trial way
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames -> "+frames.size());
		
		/*
		for(int i=0;i<frames.size();i++){
			driver.switchTo().frame(i);
			int s = driver.findElements(By.xpath("//*[@id='loginForm']/div[2]/input")).size();
			System.out.println(s);
			driver.switchTo().defaultContent();
		}
		*/
		driver.switchTo().frame(4);
		driver.findElement(By.xpath("//*[@id='loginForm']/div[2]/input")).sendKeys("1233");
		driver.switchTo().defaultContent();
	}

}
