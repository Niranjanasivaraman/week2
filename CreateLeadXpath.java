package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Demosalesmanager");
		Thread.sleep(1000);

	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sivani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("ram");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();



	}

}
