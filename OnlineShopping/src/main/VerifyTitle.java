package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
WebDriver driver;

@Test
public void verifyTitle() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");	 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
	
String pageTitle = driver.getTitle();

if(pageTitle.equals("Google")) {
System.out.println("Google Application is Launch Successfully....Passed");
}
else {
	System.out.println("Google Application is not Launch Successfully....Failed");	
}
Thread.sleep(3000);
driver.close();
}
	
	
	
}
