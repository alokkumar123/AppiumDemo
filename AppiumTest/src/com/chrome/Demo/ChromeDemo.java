package com.chrome.Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.sun.jna.Platform;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeDemo {


	@Test
	public void test1() throws MalformedURLException{
		DesiredCapabilities capabilites= DesiredCapabilities.android();

		//		set the capability to execute our test on chrome browser
		capabilites.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);

		//		set the capability to to execute our  test on android platform
		capabilites.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);

		//		need to define the platform name
		capabilites.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		System.out.println("mobile platform");

		//		set the device name
		capabilites.setCapability(MobileCapabilityType.DEVICE_NAME, "ALOK MOBILE");
		System.out.println("mobile name");

		//		set the version of the of android device
		capabilites.setCapability(MobileCapabilityType.VERSION, "5.1");	
		System.out.println("mobile version");

		//		create the object of the url and specify the appium server
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println("url");
		WebDriver driver = new AndroidDriver(url,capabilites);
		System.out.println("driver");
		driver.get("http://www.facebook.com");
		System.out.println("opened facebook");

	}
}
