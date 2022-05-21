package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemeDemo {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://google.com");
		WebElement sech =driver.findElement(By.name("q"));
		sech.sendKeys(" i love you");
		driver.findElement(By.name("btnK")).click();
		String sep=driver.switchTo().activeElement().getAttribute("title");
		System.out.println(sep);
	*/
		
		
	driver.get("https://the-internet.herokuapp.com/checkboxes");	
		 WebElement chbox= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		System.out.println("chbox.isEnabled();");
		
		driver.quit();
		System.out.println("i at last");

	}
}

