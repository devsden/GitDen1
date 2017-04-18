package uploading;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("its.thakur@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Mobile@123");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='pagelet_welcome_box']/ul/li[1]/div/div/a")).click();
		///WebElement profileSelector = driver.findElement(By.xpath("//div[@id='fbProfilePicSelector']"));
		WebElement profilePic = driver.findElement(By.xpath("//img[@class='profilePic img']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(profilePic).build().perform();
		
		
		driver.findElement(By.xpath("//div[text()='Update Profile Picture']")).click();
		driver.findElement(By.xpath("//input[@title='Choose a file to upload']")).click();
		
		
		Process process = new ProcessBuilder("F:\\temp\\fb2.exe",
                "xxxxx", "Open").start();

	}
}




/*
 * act.moveToElement(driver.findElement(By.xpath("//ul[@role='menu']/li[3]/a/span/span/form/div/a"))).clickAndHold(driver.findElement(By.xpath("//ul[@role='menu']/li[3]/a/span/span/form/div/a"))).build().perform();
		Thread.sleep(5000);
		act.release(driver.findElement(By.xpath("//ul[@role='menu']/li[3]/a/span/span/form/div/a"))).build().perform();
		*/
