import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleAutoSuggest {

	public static void main(String[] args) {
			WebDriver  driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.get("http://google.com");
			
			driver.findElement(By.name("q")).sendKeys("hello there");
			//*[@id='sbse2']/div[2]
			//*[@id='sbse3']/div[2]
			//*[@id='sbse4']/div[2]
			//*[@id='sbse5']/div[2]
			
			String part1="//*[@id='sbse";
			String part2="']/div[2]";
			
			for(int i=2;i<=5;i++){
				String text = driver.findElement(By.xpath(part1+i+part2)).getText();
				System.out.println(text);
			}
			
			// You
	}

}
