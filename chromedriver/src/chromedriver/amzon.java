 package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzon {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//d.manage().window().maximize();
		//Thread.sleep(30000);
		//d.get("https://www.amazon.com/");
	    
	    //Thread.sleep(30000);
		/*Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		a.moveToElement(d.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();*/
		//build represents that script is ready to be executed but it will not execute but its ready.
		//To execute the action we need to perform the build.
		 d.get("https://www.ebay.com/");
		 WebElement col=d.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		 col.findElements(By.tagName("a")).size();
		 String Afterclick;
		 String Beforeclick=null;
		 
		 //System.out.println("Text of the third link");
		 for(int j=0;j<col.findElements(By.tagName("a")).size();j++)
		 {
			
			//(col.findElements(By.tagName("a")).get(2).getText());
			 if(col.findElements(By.tagName("a")).get(j).getText().contains("Site map"))
			 {
				 //System.out.println(d.getTitle());
				 Beforeclick = d.getTitle();
				 col.findElements(By.tagName("a")).get(j).click();
				 
				 break; 
			 }
			
			 Afterclick = d.getTitle();
			 if(Beforeclick!=Afterclick)
			 {
				System.out.println("PASS"); 
			 }
			 else
			 {
				 System.out.println("FAIL");
			 }
			 
		 }
      
	}

}
