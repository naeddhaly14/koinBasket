package koinBasket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class Home {
	public IOSDriver driver;
	
	By baskets = By.xpath("//XCUIElementTypeOther[@name='basket']");
	

	
	public Home(IOSDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public List<WebElement> getBaskets() {
		return driver.findElements(baskets);
	}
	public String clickOnBasket(String bucketName) {
		
	      for (WebElement element : this.getBaskets()) {
	         if(element.getText().equalsIgnoreCase(bucketName)) {
	        	element.click();
	        	break;	
	         }  
	      }
		return bucketName;
	}
}
