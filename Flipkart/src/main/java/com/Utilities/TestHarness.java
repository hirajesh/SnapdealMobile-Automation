package com.Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TestHarness {

	public static AppiumDriver androiddriver;
	public static String Activity = "com.snapdeal.ui.material.activity.MaterialMainActivity";
	public String Package = "com.landmarkgroup.maxstores";
	public static String Appath = "/Users/rajesh/Downloads/Snapdeal.apk";


	public static AppiumDriver<MobileElement> StartAndroiDriver() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Activity);
		capabilities.setCapability("app", Appath);
		androiddriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		androiddriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return androiddriver;
	}

	public void resetApp() {
		androiddriver.resetApp();
	}
}
