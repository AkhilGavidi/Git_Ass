package Mindtree.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TideComprehensive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setproperty(key,value);
		 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		 //create a driver object for chrome browser
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://tide.com/en-us");
	//	 Thread.sleep(2000)
		 System.out.println(driver.getTitle());
	driver.manage().window().maximize();
		
		  Thread.sleep(3000);
	boolean A=  driver.findElement(By.xpath("//*[@id=\'lilo3746-wrapper\']/div/a")).isDisplayed();
	if(A==true)
	{
		 driver.findElement(By.xpath("//*[@id=\'lilo3746-wrapper\']/div/a")).click();	
	}
		
	  
	 
		  Actions action = new Actions(driver); 
	 		WebElement webdriver = driver.findElement(By.linkText("Shop Products"));
	 		action.moveToElement(webdriver).build().perform();
	 		Thread.sleep(2000);
	 		driver.findElement(By.linkText("Stain Removal")).click();
	 		Thread.sleep(2000);
	 		driver.findElement(By.className("ps-button-label")).click();
		
	}

}
