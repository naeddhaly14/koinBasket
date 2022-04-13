package koinBasket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class MyPortfolioPage {
	public IOSDriver driver;
	
	By completedBtn = By.xpath("//XCUIElementTypeButton[@name='COMPLETED']");
	By verifyBasket = By.xpath("//XCUIElementTypeStaticText[@name='col1']");
	public MyPortfolioPage(IOSDriver driver) {
		this.driver=driver;
	}
	
	public WebElement clickOnCompleteBtn() {
		return driver.findElement(completedBtn);
	}
	
	public List<WebElement> getSelectedBasket() {
		return driver.findElements(verifyBasket);
	}
	
	public void velidateBasket(String bucketName) {
		this.clickOnCompleteBtn().click();
		for (WebElement basket : this.getSelectedBasket()) {
		     if(basket.getText().equalsIgnoreCase(bucketName)) {
		    	 System.out.println(basket.getText());
		     }else {
		    	 System.out.println("name does not match");
		     }
		    }
	}
}
