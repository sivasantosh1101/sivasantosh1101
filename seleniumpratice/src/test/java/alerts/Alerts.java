package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//js alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
		if(driver.getPageSource().contains("you successfully clicked an alret"))
			System.out.println("you successfully clicked an alret");
		//js conform
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept(); 
		if(driver.getPageSource().contains("you  clicked :cancel"))
			System.out.println("you  clicked : cancel");
		//promt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("siva here");
		System.out.println(alert2.getText());
		alert2.accept(); 
		if(driver.getPageSource().contains("you enetred :siva here"))
			System.out.println("you enetred :siva here ");
		
		
		
	}
	

}
