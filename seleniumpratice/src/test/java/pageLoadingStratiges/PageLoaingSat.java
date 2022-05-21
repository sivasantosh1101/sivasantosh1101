package pageLoadingStratiges;

//import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoaingSat {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);//normal
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(opt);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://google.com");
	//egar
	//none
	driver.quit();
	
	
}
}
