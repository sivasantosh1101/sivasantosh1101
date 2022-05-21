package invokingDifferentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokingDifferentBrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();//webdriver object
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	System.out.println("Chrome Opened");
	Thread.sleep(3000);
	driver.close();
	
	System.out.println("Chrome Closed");
	
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver2 = new FirefoxDriver();
	driver2.manage().window().maximize();
	driver2.get("https://www.google.com/");
	System.out.println("FireFox Opened");
	Thread.sleep(3000);
	driver2.close();
	System.out.println("FireFox Closed");
	System.out.println("Successfully automated!!!");
	
}
}
