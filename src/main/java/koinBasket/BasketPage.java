package koinBasket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class BasketPage {
public IOSDriver driver;
    int sum = 0;
	By amount = By.xpath("//XCUIElementTypeStaticText[@name='col3']");
	By totalBuyValue = By.xpath("//XCUIElementTypeStaticText[@name='total']");
	By buyBasketBtn = By.xpath("//XCUIElementTypeOther[@name='Buy Basket']");

	public BasketPage(IOSDriver driver) {
		this.driver=driver;
	}
	public String totalBuyValue() {
		return driver.findElement(totalBuyValue).getText();
	}
	public List<WebElement> getAmount() {
		return driver.findElements(amount);
	}
	public WebElement clickOnBuyBasketBtn() {
		return driver.findElement(buyBasketBtn);
	}
	
	public void calculateAmount() {
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
	    	 this.clickOnBuyBasketBtn().click();
	    	 Thread.sleep(2000);
	     }
	}
}
