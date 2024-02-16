package remoteTest.dockerValidation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromeTest2 {
	
	@BeforeTest
	public void startDockerScale() throws IOException, InterruptedException
	{
		File f = new File("output.txt");
		if(f.delete()) {
			System.out.println("Output File Deleted");
		}
		
		startDocker s = new startDocker();
		s.startFile();
		
	}
	@AfterTest
	public void stopDockerDeleteFile() throws IOException, InterruptedException {
		stopDocker st = new stopDocker();
		st.stopFile();
	}
@Test
	public void test1() throws MalformedURLException {
		
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		//ChromeOptions ch = new ChromeOptions();
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(u,cap.chrome());
		
		driver.get("https://Facebook.com");
		System.out.println(driver.getTitle());
		System.out.println("Added from new commit");
		//comment
		//comment#3
		//develop in new branch develop
		// develop test new comment by bdev
		
		driver.quit();
	}

}
