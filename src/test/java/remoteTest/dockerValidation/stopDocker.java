package remoteTest.dockerValidation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class stopDocker {
	
	@Test
	public void stopFile() throws IOException, InterruptedException 
	{
		boolean flag=false;
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("cmd /c start dockerdown.bat");
		
		String file = "output.txt";
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 45);
		long stopnow = cal.getTimeInMillis();
		
		while(System.currentTimeMillis()<stopnow)
		{
			if(flag) {
				break;
			}
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String currentLine = reader.readLine();
		
		while (currentLine != null && !flag)
		{
			if (currentLine.contains("Shutdown complete")) 
			{
				System.out.println("Found the expected Line");
				flag=true;
				break;				
			}
			currentLine=reader.readLine();
		}
		reader.close();
		}
		
		Assert.assertTrue(flag);
		}
			
	}
	

