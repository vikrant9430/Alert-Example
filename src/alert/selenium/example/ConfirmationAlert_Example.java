package alert.selenium.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationAlert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Second Commit
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
				+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		Thread.sleep(5000);
		Alert confirmationAlert = driver.switchTo().alert();
		String AlertText = confirmationAlert.getText();
		System.out.println(AlertText);
		confirmationAlert.accept();
		

	}

}
