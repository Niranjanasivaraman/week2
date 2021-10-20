package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		Thread.sleep(1000);
		WebElement link1 = driver.findElement(By.linkText("Leads"));
		link1.click();
		Thread.sleep(1000);
		WebElement link2 = driver.findElement(By.linkText("Create Lead"));
		link2.click();
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("niranjana");
		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.id("createLeadForm_lastName"));
		lname.sendKeys("sivaraman");
		Thread.sleep(1000);
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.sendKeys("TESTLEAF");
		Thread.sleep(1000);

		//// locate the select tag //create object for select//select the value
		//// using visible text
		// WebElement industry =
		//// driver.findElement(By.id("createLeadForm_industryEnumId"));
		// Select dropdown = new Select(industry);
		// dropdown.selectByVisibleText("Computer Hardware");
		// Thread.sleep(1000);
		//
		//// driver.findElement(By.id("createLeadForm_industryEnumId"));
		//// industry.sendKeys("Computer Hardware");
		//
		//// select by Index
		// dropdown.selectByIndex(5);
		// Thread.sleep(1000);
		//// select by value
		// dropdown.selectByValue("IND_AEROSPACE");
		// Thread.sleep(2000);
		//// marketing campaign drop down
		// WebElement marketing =
		//// driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		// Select dropdown1=new Select(marketing);
		// dropdown1.selectByVisibleText("Automobile");
		// Thread.sleep(2000);
		// indutry dropdown
		// WebElement industry1 =
		//// driver.findElement(By.id("createLeadForm_industryEnumId"));
		// Select dropdown2 = new Select(industry1);
		// dropdown2.selectByValue("IND_TELECOM");
		// Thread.sleep(1000);
		// WebElement Directmail =
		//// driver.findElement(By.id("createLeadForm_dataSourceId"));
		// Select mail = new Select(Directmail);
		// mail.selectByVisibleText("Cold Call");
		// Thread.sleep(1000);
		// WebElement industry =
		//// driver.findElement(By.id("createLeadForm_industryEnumId"));
		// Select indus = new Select(industry);
		// indus.selectByIndex(7);
		// Thread.sleep(1000);

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owner = new Select(ownership);
		owner.selectByValue("OWN_PARTNERSHIP");
		Thread.sleep(1000);
		driver.close();
	}

}
