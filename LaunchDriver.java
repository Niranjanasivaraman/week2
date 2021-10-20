package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchDriver {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/");
		
		Thread.sleep(10000);
		Driver.close();
		
	}
	
	}