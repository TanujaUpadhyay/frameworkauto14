package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.makemytrip.com/flights?cmp=SEM%7cD%7cDF%7cG%7cBrand%7cB_M_Makemytrip_Search_Exact%7cBrand_Top_5_Exact%7cExpanded%7c162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%2520my%2520trip&ef_id=WfcEjQAAAZwcBLZ%40%3A20171030105301%3As");
		//System.out.println("Before clicking on MultiCity Radio Button");
		System.out.println(d.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		//d.findElement(By.xpath(".//*[@id='multicity']/label")).click();
		System.out.println("After clicking on MultiCity Radio Button");
		System.out.println("After clicking on MultiCity Radio Button");
		System.out.println("After clicking on MultiCity Radio Button");
				d.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
		Thread.sleep(3000L);
		d.findElement(By.xpath(".//*[@id='dp1509388264749']/div/div[1]/table/tbody/tr[3]/td[4]")).click();
		System.out.println(d.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		Thread.sleep(3000L);
		//System.out.println(d.findElement(By.xpath(".//*[@id='fd-wrap']/div[2]/h2")).getText());
		
		


}
}
