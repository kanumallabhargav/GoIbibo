package com.goibibo.auto.GoIbibo;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.goibibo.auto.pageObjects.checkoutPageObjects;
import com.goibibo.auto.pageObjects.homePageObjects;

import testData.travelerInformation;
import utilities.Base;
import utilities.Cities;

public class SS1_bookFlight extends Base
{
	@Test
	public void bookFlight() throws IOException, InterruptedException
	{
		driver=driverInitialize();
		homePageObjects homeObjects = new homePageObjects(driver);
		Cities cts = new Cities();
		String fromCity = cts.getFromCity();
		String toCity = cts.getToCity();
		
		//click on roundTrip
		homeObjects.clickOnRoundTrip();
		
		//Enter departure
		homeObjects.getFromCityBox().sendKeys(fromCity);
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(homeObjects.getWaitLocator());
		homeObjects.getFromCityBox().sendKeys(Keys.DOWN);
		homeObjects.getFromCityBox().sendKeys(Keys.ENTER);
		
		//Enter destination
		homeObjects.getToCityBox().sendKeys(toCity);
		wait.until(homeObjects.getWaitLocator());
		homeObjects.getToCityBox().sendKeys(Keys.DOWN);
		homeObjects.getToCityBox().sendKeys(Keys.ENTER);
		
		//Select dates
		homeObjects.clickOnDepartureDate();
		homeObjects.clickOnReturnDate();
		
		//Search for flights
		homeObjects.clickOnSearch();
		
		
		wait.until(homeObjects.getWaitForFlightLocator());
		//Sort by highest price first
		homeObjects.sortPrice();
		
		//Select flight with highest price
		homeObjects.flightSelect();
		
		//GoIbibo webSite completely unresponsive beyond this point.
		//Can select a flight but it does not load any more elements, making me unable to select on book flight option
		//But I have written code logic to automate the elements once the WebSite goes live again.
		//Just have to locate certain elements and add them to homePageObjects class
		
		//To pass traveler information from command line, we can use maven commands.
		//mvn test -DtravelerName=typeNameHere -DtravelerEmail=typeEmailHere
		//Then catch this information in our TestCse using Strings and pass these strings as arguments where we use sendKeys.
		
		checkoutPageObjects checkout = new checkoutPageObjects();
		//enter traveler information
		checkout.getNameBox().sendKeys(travelerInformation.getTravelerName());
		checkout.getEmailBox().sendKeys(travelerInformation.getTravelerEmail());
		//Any more details regarding the traveler can be added in the same way
		
		//Finally locate the continue to pay button and click it
		checkout.choosePayment();
		checkout.chooseAmazonPay();
		
		//The logic of this code will work 
		//We just have to get locators for these webElements, which I could not do at this point because the WebSite is down 
		
	}
}
