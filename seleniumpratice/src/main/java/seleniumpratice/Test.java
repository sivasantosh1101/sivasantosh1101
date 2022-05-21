package seleniumpratice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get(" https://google.com" );
		String originalWindow=driver.getWindowHandle();
				
		/*Thread.sleep(500);
		driver.get("https://youtube.com");
		//driver.get("https://https://www.youtube.com/watch?v=HjYEjKWSbe8");
		System.out.println(driver.getCurrentUrl());  
		System.out.println(driver.getTitle());
		driver.navigate().back();
		//driver.navigate().forward();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		//driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(originalWindow);
		Thread.sleep(5000);
		
		driver.manage().window().getSize().getWidth();
		
		Dimension size=driver.manage().window().getSize();
		int width=size.getWidth();
		int height=size.getHeight();
		
		System.out.println("width  ;"+width);
		System.out.println("height is"+height );
		driver.manage().window().setSize(new Dimension(800,600));
		
		Point  position=driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		driver.manage().window().setPosition(new Point(500,100));
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		Thread.sleep(5000);
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image.png"));
        */
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement button =driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();", button);

		//String text = (String) js.executeScript("return arguments[0].innerText", button);

		driver.close();
		
		driver.quit();
	}

}
