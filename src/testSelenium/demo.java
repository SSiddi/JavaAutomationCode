package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {
	public static void main(String[] args) {

		String driverExecutablePath = "C:\\Users\\aiman\\chromedriver-win64\\chromedriver.exe";
		// System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver;

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		driver = new ChromeDriver(option);
		driver.get("https://selenium.dev/");

		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.DemoQA.com");
		driver.navigate().forward();	
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.findElement(By.id(""));
	}
}
