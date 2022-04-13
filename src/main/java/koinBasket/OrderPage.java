package koinBasket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class OrderPage {
	public IOSDriver driver;
    int sum = 0;
	
    By amount = By.xpath("//XCUIElementTypeStaticText[@name='col3']");
    By totalBuyValue = By.xpath("//XCUIElementTypeStaticText[@name='total']");
    By filBuyOrder = By.xpath("//XCUIElementTypeButton[@name='Fill by Order']");
    By portfolioBtn = By.xpath("//XCUIElementTypeButton[@name='PORTFOLIO']");

	public OrderPage(IOSDriver driver) {
		this.driver=driver;
	}
	
	public List<WebElement> getAmount() {
		return driver.findElements(amount);
	}
	public String totalBuyValue() {
		return driver.findElement(totalBuyValue).getText();
	}
	public WebElement clickOnFillBuyOrderBtn() {
		return driver.findElement(filBuyOrder);
	}
	public WebElement clickOnPortfolioBtn() {
		return driver.findElement(portfolioBtn);
	}
	public void calculateBuyAmount() {
	      for (WebElement amount : this.getAmount()) {
	        int nums =  Integer.parseInt(amount.getText());
	         sum +=nums;
	         
	      }
	      System.out.println(sum);
	}
	public void  validateTotalBuyValue() throws InterruptedException {
		int totalBuyValueInt = Integer.parseInt(this.totalBuyValue());
	     if(totalBuyValueInt == sum) {
	    	 System.out.println("value match");
	    	 this.clickOnFillBuyOrderBtn().click();
	    	 Thread.sleep(2000);
	    	 this.clickOnPortfolioBtn().click();
	     }
	}
}
