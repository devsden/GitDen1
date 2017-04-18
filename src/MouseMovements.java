import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseMovements {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://americangolf.co.uk");
		
		
		//driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
		WebElement golfClubs = driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(golfClubs).build().perform();
		//box
		WebElement box = driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]"));
		List<WebElement> links  =box.findElements(By.tagName("a"));
		int totalLinks=links.size();
		System.out.println("Total -> "+totalLinks);
		
		Random r = new Random();
		int randomNumber = r.nextInt(links.size());
		WebElement link = links.get(randomNumber);
		System.out.println(link.getText());
		link.click();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")));
		
		driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
		
		
		WebElement icon = driver.findElement(By.xpath("//*[@id='secondary']/div[1]/div[2]/div[1]/div[1]/span[1]"));
		act.dragAndDropBy(icon, 50, 0).build().perform();
		

	}

}
