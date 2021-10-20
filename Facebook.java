package week2.day2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// click on create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(10000);
		// enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Abi");
		// enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ram");
		// enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		// enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("***********");
		// for date in facebook
		WebElement day = driver.findElement(By.id("day"));
		Select date = new Select(day);
		date.selectByIndex(14);
		Thread.sleep(1000);
		// for month in facebook
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Mar");
		Thread.sleep(1000);
		// for year in facebook
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByValue("2021");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(1000);
		driver.close();

	}
}
