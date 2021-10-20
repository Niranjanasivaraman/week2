package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("UserFirstName")).sendKeys("Niranajana");
		Thread.sleep(5000);
		driver.findElement(By.name("UserLastName")).sendKeys("Sivaraman");
		Thread.sleep(5000);
		driver.findElement(By.name("UserEmail")).sendKeys("niranjana@salesforce.com");
		Thread.sleep(1000);
		WebElement Title = driver.findElement(By.name("UserTitle"));
		Select Title1 = new Select(Title);
		Title1.selectByIndex(7);
		Thread.sleep(5000);
		driver.findElement(By.name("CompanyName")).sendKeys("Qualcomm");
		Thread.sleep(5000);
		WebElement Title2 = driver.findElement(By.name("CompanyEmployees"));
		Select Title3 = new Select(Title2);
		Title3.selectByIndex(5);
		Thread.sleep(1000);
		driver.findElement(By.name("UserPhone")).sendKeys("9677258403");
		WebElement company = driver.findElement(By.name("CompanyCountry"));
		Select country1 = new Select(company);
		country1.selectByValue("US");
		
		System.out.println("-------Country selected successfully----------");
		Thread.sleep(1000);
		driver.close();
	}

}
