package koinBasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class ProfilePage {
public IOSDriver driver;
By profile = By.xpath("//XCUIElementTypeButton[@name='Profile, tab, 3 of ']");

public ProfilePage(IOSDriver driver) {
	this.driver=driver;
}

public WebElement clickOnProfileIcon() {
	return driver.findElement(profile);
}
}


