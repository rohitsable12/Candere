package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Candere_Screen_Short {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//store screenshort in different timespam
		Date currentdate= new Date();
		String	screenshortfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		
		System.setProperty("webdriver.chrome.driver","C:\\project\\Automation\\DriverNew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.candere.com/majestic-solitaire-daimond-ring.html");
		
		//Screen short
		
		File sreenshort = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sreenshort, new File(".//Screensshort//" + screenshortfilename + ".png"));
		
	}

}
