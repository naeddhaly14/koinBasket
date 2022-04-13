package koinBasket;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;

public class AppLaunch extends FirstTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		 IOSDriver driver = DesiredCapabilities();
		 Home homePage = new Home(driver);
		 BasketPage basketPage = new BasketPage(driver);
		 OrderPage orderPage = new OrderPage(driver);
		 MyPortfolioPage myPortfolioPage = new MyPortfolioPage(driver);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 Thread.sleep(2000);
		String bucketName = "Test";

		homePage.clickOnBasket(bucketName);
		
      Thread.sleep(2000);
      basketPage.calculateAmount();
      basketPage.validateTotalBuyValue();
      Thread.sleep(2000);
      orderPage.calculateBuyAmount();
      orderPage.validateTotalBuyValue();
      myPortfolioPage.velidateBasket(bucketName);
     
	}
}
	
	
	





