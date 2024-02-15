package remoteTest.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeTest3 {

	@Test
	public void test2() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//ChromeOptions ch = new ChromeOptions();
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,cap.chrome());
		
		driver.get("https://x.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
