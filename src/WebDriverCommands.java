

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

public static void main(String[] args) {
		
		String driverExecutablePath = "C:\\Users\\aiman\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver 
		WebDriver driver = new ChromeDriver(); 	
		// Storing the Application Url in the String variable 
		String url = "https://www.shop.demoqa.com"; 
				
				//Launch the ToolsQA WebSite 
		driver.get(url); 
				
				// Storing Title name in the String variable 
		String title = driver.getTitle(); 
		System.out.println(title);
}
}