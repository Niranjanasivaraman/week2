package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {

		// intialition setting up of chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch browser and
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		Thread.sleep(5000);
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		Thread.sleep(1000);
		WebElement link1 = driver.findElement(By.linkText("Leads"));
		link1.click();
		WebElement link2 = driver.findElement(By.linkText("Create Lead"));
		link2.click();
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("niranjana");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.id("createLeadForm_lastName"));
		lname.sendKeys("sivaraman");
		Thread.sleep(2000);
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.sendKeys("TESTLEAF");
		Thread.sleep(2000);
		WebElement DOB = driver.findElement(By.id("createLeadForm_birthDate"));
		DOB.sendKeys("10/03/95");
		Thread.sleep(2000);
		WebElement Department = driver.findElement(By.id("createLeadForm_departmentName"));
		Department.sendKeys("Test");
		Thread.sleep(2000);
//		WebElement CountryCode = driver.findElement(By.name("primaryPhoneCountryCode"));
//		CountryCode.sendKeys("1");
//		Thread.sleep(2000);
		WebElement Extension = driver.findElement(By.name("primaryPhoneExtension"));
		Extension.sendKeys("2034");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("Testleaf@gmail.com");
		Thread.sleep(2000);
		WebElement phonenumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phonenumber.sendKeys("190780678");
		Thread.sleep(2000);
		WebElement personToAskFor = driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		personToAskFor.sendKeys("sivararaman");
		WebElement url = driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		url.sendKeys("http://leaftaps.com/opentaps");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("createLeadForm_generalToName"));
		name.sendKeys("siva");
		Thread.sleep(2000);
		WebElement address1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		address1.sendKeys("Gulmohar");
		Thread.sleep(2000);
		WebElement address2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		address2.sendKeys("Tellapur");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("blore");
		Thread.sleep(2000);
		WebElement createlead = driver.findElement(By.name("submitButton"));
		createlead.click();
		Thread.sleep(5000);
		driver.close();
	}

}
