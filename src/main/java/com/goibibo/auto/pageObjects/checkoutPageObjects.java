package com.goibibo.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPageObjects 
{
	//Initialize a driver
		WebDriver driver;
		
		//WebElements
		private By nameBox = By.id("---------enterLocatorHere---------");
		private By emailBox = By.id("---------enterLocatorHere---------");
		private By paymentOptions = By.id("---------enterLocatorHere---------");
		private By amazonPay = By.id("---------enterLocatorHere---------");
		
		public WebElement getNameBox()
		{
			return driver.findElement(nameBox);
		}
		public WebElement getEmailBox()
		{
			return driver.findElement(emailBox);
		}
		public void choosePayment()
		{
			driver.findElement(paymentOptions).click();
		}
		public void chooseAmazonPay()
		{
			driver.findElement(amazonPay).click();
		}
}
