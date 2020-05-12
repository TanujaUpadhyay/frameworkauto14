package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablenavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.cricbuzz.com/live-cricket-scorecard/20091/rcb-vs-mi-31st-match-indian-premier-league-2018");
		WebElement table=d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<count-2;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			
		}
		
		

	}

}
