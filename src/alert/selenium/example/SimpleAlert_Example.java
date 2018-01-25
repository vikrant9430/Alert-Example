package alert.selenium.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
				+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector("#OKTab > button")).click();
		Thread.sleep(5000);
		
		Alert simplealert = driver.switchTo().alert();
		
		String AlertText = simplealert.getText();
		
		System.out.println(AlertText);
		
		simplealert.accept();
		
		
	}

}
