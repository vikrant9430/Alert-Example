package gr.noi.alert.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert {

	static String key = "webdriver.gecko.driver";
	static String value =  "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
			+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe";
	static WebDriver driver = null;
	static String url = "http://demo.automationtesting.in/Alerts.html";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty(key, value);
		
		driver = new FirefoxDriver();
		
		driver.navigate().to(url);
		
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		
		System.out.println("Waiting for 5 Second.......");
		
		Thread.sleep(5000);
		
		Alert oalert = driver.switchTo().alert();
		
		String text = oalert.getText();
		
		System.out.println(text);
		
		oalert.accept();
		
		
		
		

	}

}
