package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Candere_DGRP_Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "C:\\project\\Automation\\Drivernew2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.candere.com/majestic-solitaire-daimond-ring.html");
		
		
		//Scroll till DGRP
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement DGRP= driver.findElement(By.xpath("//a[@data-gtm='DGRP']"));
		js.executeScript("arguments[0].scrollIntoView();", DGRP);
		
		//Explore DGRP Link
		driver.findElement(By.xpath("//a[@data-gtm='DGRP']")).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		//click start shopping
		JavascriptExecutor shop=(JavascriptExecutor)driver;
		WebElement startshoping= driver.findElement(By.xpath("//a[@class='dgrp_cta']"));
		shop.executeScript("arguments[0].scrollIntoView();",startshoping);
		driver.findElement(By.xpath("//a[@class='dgrp_cta']")).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		
		JavascriptExecutor up=(JavascriptExecutor)driver;
		up.executeScript("window.scroll(200,0);");
		
		//Come to Home page
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.xpath(
				"//img[@src='https://d2yx3hwqxay3vo.cloudfront.net/media/logo/stores/1/Candere_logo_diwali.gif']"));
		js.executeScript("arguments[0].click();",home);
		
		
	}

}
