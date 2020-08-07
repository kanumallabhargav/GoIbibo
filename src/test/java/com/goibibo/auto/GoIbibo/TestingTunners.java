package com.goibibo.auto.GoIbibo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTunners {

	public static void main(String[] args) 
	{
		//BOMDEL20200813EUK:UK863UK826UK834radioBtn
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("");
	}

}
