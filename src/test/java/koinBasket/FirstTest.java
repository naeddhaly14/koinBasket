package koinBasket;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstTest {

	public static  IOSDriver DesiredCapabilities() throws MalformedURLException
	{
		// TODO Auto-generated method stub
	 DesiredCapabilities cap = new DesiredCapabilities();
	 
	  
	  cap.setCapability("platformName", "iOS");
	  cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
	  cap.setCapability(MobileCapabilityType.UDID, "C57EC9F2-4439-4451-A3E4-65F68B7B20D6");
	  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
	  cap.setCapability(MobileCapabilityType.NO_RESET, false);
	  cap.setCapability(IOSMobileCapabilityType.TIMEOUTS,500000);
	  // crashing // cap.setCapability(MobileCapabilityType.APP, "/Users/naeddhaly.suresh/eclipse-workspace/koinBasket/src/test/java/koinbasket.app");
	  //cap.setCapability(MobileCapabilityType.APP, "/Users/naeddhaly.suresh/Desktop/koinbasket.app");
	  //not working // cap.setCapability(MobileCapabilityType.APP,"/Users/naeddhaly.suresh/eclipse-workspace/koinBasket/src/test/java/koinBasket/koinbasket.app");
	  cap.setCapability(MobileCapabilityType.APP, "/Users/naeddhaly.suresh/Library/Developer/Xcode/DerivedData/koinbasket-gtkjndsclsxgypbxyoclwcstrzae/Build/Products/Debug-iphonesimulator/koinbasket.app");
	  
	  URL url = new URL("http://127.0.0.1:4723/wd/hub");
	  IOSDriver driver = new IOSDriver(url,cap);
	  
	  return driver;
	  
 }
}
