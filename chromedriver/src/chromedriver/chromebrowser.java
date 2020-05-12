package chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=hyPVWbKYGILz8AebkIeIAw");
				
				
				
		
		}

	
}
