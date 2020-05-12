package chromedriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class cookies {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	
		//d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://www.google.com");
		java.io.File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Tanuja\\Desktop\\screenshot\\screenshot.png"));
		
	}

}
