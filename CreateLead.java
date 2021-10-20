package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		
		//entering username
	    //driver.findElement(By.tagName("input")).sendKeys("Demosalesmanager");
	    
	    //entering Password
	    WebElement password=driver.findElement(By.name("PASSWORD"));
	    password.sendKeys("crmsfa");
	    
	    driver.findElement(By.className("decorativeSubmit")).click();

	    driver.findElement(By.tagName("a")).click();
	    
	    driver.findElement(By.linkText("Create Lead")).click();
	   
	    
	    //for textbox want to use sendkeys
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sivani");
	    Thread.sleep(5000);
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raman");
	    Thread.sleep(5000);
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("venkycompany");
	    Thread.sleep(5000);
	    
	    
	    driver.close();
		
	}

}
