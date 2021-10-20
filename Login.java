package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the window
				driver.manage().window().maximize();
		
				driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
		//step 1.we assign username field to the find element object
	//locate element
		WebElement findElement = driver.findElement(By.id("username"));
		//step 2. to type a value in a text field
		findElement.sendKeys("Demosalesmanager");
		
		
		

	}

}
