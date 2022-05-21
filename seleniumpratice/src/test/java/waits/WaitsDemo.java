package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://google.com" );
		driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);
		//explicate wait
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement myLink= wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: Never Stop Learning ...")));
		myLink.click();
		
		driver.close();
		driver.quit();
		
	}
	

}
