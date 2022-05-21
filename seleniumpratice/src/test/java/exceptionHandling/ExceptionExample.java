package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionExample {
private static final Function<? super WebDriver, Object> ExceptedCondtions = null;

public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	URL ur=new URL("https://google.com");
	FileInputStream fis= new FileInputStream("D://test.properties ");
	Properties prop=new Properties();
	prop.load(fis);
	Thread.sleep(5000);
	
}

public void webdriveExceptions() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	WebDriverWait wetw=new WebDriverWait(driver,10);
	wetw.until(ExceptedCondtions//presenceOfElementLocatd(By.id("testhdd")));
}

//WebDriverManager.chromedriver().setup();
//WebDriver driver=new ChromeDriver();
 
}
