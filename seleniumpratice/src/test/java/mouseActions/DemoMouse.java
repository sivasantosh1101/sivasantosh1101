package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMouse {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA= driver.findElement(By.xpath("//li[text()='A']"));

		WebElement boxD= driver.findElement(By.xpath("//li[text()='D']"));
		Actions action= new Actions(driver);
		action.moveToElement(boxA);
		action.clickAndHold();
		action.moveToElement(boxD);
		//action.release().perform();

		 
		//action.contextClick(boxD);
		action.doubleClick(boxD);
		action.build().perform();*/
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement drag =	 driver.findElement(By.id("draggable"));
		WebElement drop =driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		action.dragAndDrop(drag,drop);
		action.build().perform();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("last");
	}

}
