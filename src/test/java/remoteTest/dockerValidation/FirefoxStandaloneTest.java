package remoteTest.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxStandaloneTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//DesiredCapabilities cap = new DesiredCapabilities();
		ChromeOptions ch = new ChromeOptions();
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,ch);
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
