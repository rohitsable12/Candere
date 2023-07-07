package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Canderetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\project\\Automation\\DriverNew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.candere.com/majestic-solitaire-daimond-ring.html");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		//login
		driver.findElement(By.xpath("//div[@class='link_items actions-custom customer-links']")).click();
		driver.findElement(By.id("customer-popup-sign-in")).click();
		driver.findElement(By.id("email-login-one")).sendKeys("sablerohit105@gmail.com");
		driver.findElement(By.id("send2-login-one")).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(By.id("pass-login")).sendKeys("Rohitsable1234");
		driver.findElement(By.id("send2-login-two")).click();
		Thread.sleep(3000);
		
		//click on ring
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-menu='Rings']")).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		
		Actions e=new Actions(driver);
		e.moveToElement(driver.findElement(By.xpath("//a[@data-menu='Rings/Shop by Design/Engagement']"))).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,300);");
		
		//Click on wishlist
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@id='wish_36236']")).click();
		
		//scroll Up
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(300,0);");
		
		//wishlist
		WebElement wishlist=driver.findElement(By.xpath("//img[@src='https://d2yx3hwqxay3vo.cloudfront.net/static/version1666292105/frontend/Codilar/candere_desktop/en_US/Magento_Wishlist/images/icons/heart.svg']"));
		//driver.findElement(By.id(smc.getStringCellValue())).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		JavascriptExecutor sm=(JavascriptExecutor)driver;
		sm.executeScript("arguments[0].click();",wishlist);
		//driver.findElement(By.xpath("//div[@class='link_items link wishlist']")).click();
		
		//remove from wishlist
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@data-post-remove='{\"action\":\"https:\\/\\/www.candere.com\\/wishlist\\/index\\/remove\\/\",\"data\":{\"item\":\"1503499\",\"uenc\":\"\"}}']")).click();
		driver.findElement(By.xpath("//button[@class='action-primary action-accept']")).click();
	}

}
