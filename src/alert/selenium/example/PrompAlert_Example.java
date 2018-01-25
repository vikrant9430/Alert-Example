package alert.selenium.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrompAlert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
				+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector("ul.nav-tabs 7> li:nth-child(3) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#Textbox > button")).click();
		
		Thread.sleep(5000);
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.sendKeys("Hello Guys!!");
		String AlertText = confirmationAlert.getText();
		System.out.println(AlertText);
		confirmationAlert.accept();
		

	}

}
