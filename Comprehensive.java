package Mindtree.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Comprehensive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://tide.com/en-us");
	//	 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
	//	 driver.manage().window().fullscreen();
		
		  Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\'lilo3746-wrapper\']/div/a")).click();
         Actions action = new Actions(driver); 
 		WebElement webdriver = driver.findElement(By.linkText("Shop Products"));
 		action.moveToElement(webdriver).build().perform();
 		Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\'site-header\']/div[3]/div/div/div/div[1]/div/div[2]/div[1]/a/span")).click();
 	/*	driver.findElement(By.className("active")).click();
 		Thread.sleep(2000);
      
    	driver.findElement(By.className("ps-button-label")).click();
    	Thread.sleep(2000);
    	//driver.findElement(By.className("ps-online-buy-button unavailable ps-online-seller-button")).click(); */
	     driver.findElement(By.className("active")).click();
	}
	
}