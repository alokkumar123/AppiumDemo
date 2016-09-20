package com.chrome.Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class NativeAppDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilites= DesiredCapabilities.android();

		//		set the capability to execute our test on chrome browser
		capabilites.setCapability(CapabilityType.BROWSER_NAME, "");

		capabilites.setCapability("deviceName", "Ak Android");
		//		set the capability platform name
		capabilites.setCapability("platformVersion", "5.1");


		capabilites.setCapability("platformName", "Android");
		//		set the platform name
		capabilites.setCapability("apppackage", "io.selandroid.testapp");
		//		set app package
		capabilites.setCapability("appactivity", ".HomeScreenActivity");
		//		set app platform name



		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println("url");
		WebDriver driver = new AndroidDriver(url,capabilites);
		System.out.println("driver");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("driver waited fro 5 seconds..........");

		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Mukesh Selenium Appium");


		// click on registration button  

		driver.findElement(By.xpath("//android.widget.Button[@content-desc='waitingButtonTestCD']")).click();	

		System.out.println("Clicked on progress bar");
		//driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();



		// Wait for 10 second

		Thread.sleep(10000);



		// close the application
		driver.quit();
		System.out.println("Closed the application");

	}
}
