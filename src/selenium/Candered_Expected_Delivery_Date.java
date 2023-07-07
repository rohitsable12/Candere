package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Candered_Expected_Delivery_Date {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Sable\\Software\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.candere.com/majestic-solitaire-daimond-ring.html");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		// login
		driver.findElement(By.xpath("//div[@class='link_items actions-custom customer-links']")).click();
		driver.findElement(By.id("customer-popup-sign-in")).click();
		driver.findElement(By.id("email-login-one")).sendKeys("sablerohit105@gmail.com");
		driver.findElement(By.id("send2-login-one")).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(By.id("pass-login")).sendKeys("Rohitsable1234");
		driver.findElement(By.id("send2-login-two")).click();
		Thread.sleep(3000);

		// click on Search

		driver.findElement(By.id("search")).click();
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Louis Diamond
		// Ring");
		driver.findElement(By.id("search")).sendKeys("Louis Diamond Ring");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//img[@src='https://d2yx3hwqxay3vo.cloudfront.net/static/version1666292105/frontend/Codilar/candere_desktop/en_US/Magento_Search/images/icons/search.svg']"))
				.click();									

		// select product for selecting size
		driver.findElement(By.xpath("//a[normalize-space()='Louis Diamond Ring']")).click();

		// Switch the window use getwindow handle
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);

		// scroll
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(400,0);");

		// Expected Delivery Date
		WebElement date = driver.findElement(By.id("eedpincode"));
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", date);

		driver.findElement(By.id("eedpincode")).sendKeys("400060");
		driver.findElement(By.id("check-eed")).click();

	}

}
