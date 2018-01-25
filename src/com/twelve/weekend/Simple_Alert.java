package com.twelve.weekend;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
				+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector(".btn-danger")).click();
		
		Thread.sleep(5000);
		
		Alert simplealert = driver.switchTo().alert();
		
		String value = simplealert.getText();
		
		System.out.println("Text in Alert Box:" + value);
		
		simplealert.accept();
		
		System.out.println("Alert Handled");
		
		

	}

}
