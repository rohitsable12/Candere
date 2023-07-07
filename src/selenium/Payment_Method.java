package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payment_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Sable\\Software\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.candere.com/majestic-solitaire-daimond-ring.html");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		//login
		driver.findElement(By.xpath("//div[@class='link_items actions-custom customer-links']")).click();
		driver.findElement(By.id("customer-popup-sign-in")).click();
		driver.findElement(By.xpath("//div[@class='base_btn btn_md outlined_btn social_button social_button_google']")).click();
		
		// Switch the window use getwindow handle
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

				Set<String> windowhandles = driver.getWindowHandles();
				System.out.println(windowhandles);

				Iterator<String> iterator = windowhandles.iterator();
				String parentwindow = iterator.next();
				String childwindow = iterator.next();
				driver.switchTo().window(childwindow);
				
				//email id
				driver.findElement(By.id("identifierId")).sendKeys("rohit.sable@candere.com");
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				//driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
				
				WebElement date = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]"));
				JavascriptExecutor ex = (JavascriptExecutor) driver;
				ex.executeScript("arguments[0].click();", date);
				
				//password
				driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("prohitsable123");
				//driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]")).click();
				WebElement pass = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				ex.executeScript("arguments[0].click();", pass);
				
				//click on Rings header
				driver.switchTo().window(parentwindow);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				//driver.findElement(By.xpath("//*[@id=\"store.links\"]/nav[1]/div/div/div/div/ul/li[2]/a")).click();
				WebElement ring = driver.findElement(By.xpath("//a[@data-menu='Rings']"));
				JavascriptExecutor rs = (JavascriptExecutor) driver;
				ex.executeScript("arguments[0].click();", ring);
				
				//scroll for selecting product
				JavascriptExecutor sc = (JavascriptExecutor) driver;
				WebElement scrolti= driver.findElement(By.xpath("//a[@class='actions codilar-custom-sorter-actions nosto_personalized']"));
				sc.executeScript("arguments[0].scrollIntoView();", scrolti);
						
	}

}
