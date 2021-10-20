package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoom {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		Thread.sleep(1000);
		WebElement lead = driver.findElement(By.linkText("Create Lead"));
		lead.click();
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("niranjana");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.id("createLeadForm_lastName"));
		lname.sendKeys("sivaraman");
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.sendKeys("TESTLEAF");
		Thread.sleep(2000);
		WebElement createlead = driver.findElement(By.name("submitButton"));
		createlead.click();
		Thread.sleep(5000);
	}
}
