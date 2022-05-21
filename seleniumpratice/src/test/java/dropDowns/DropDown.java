package dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropdown =driver.findElement(By.id("option"));
		Select selectObject= new Select(dropdown);
		selectObject.selectByIndex(1);
		 selectObject.selectByValue("option 2");
		// selectObject.selectByVisibleText("Option 3");
		 selectObject.deselectByValue("option 2");
		 
		
		 
		 Thread.sleep(5000);
		 driver.quit();
		 
		 System.out.println("completed");
		
	}

}
