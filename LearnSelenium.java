package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(1000);
	   //Entering id
		Driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//entering username
	    Driver.findElement(By.tagName("input")).sendKeys("Demosalesmanager");
	    //entering Password
	    //Driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    
	    Driver.findElement(By.className("decorativeSubmit")).click();

	    
	    Driver.findElement(By.tagName("a")).click();
}
	
	
}