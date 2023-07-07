package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Normal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Sable\\Software\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://candere.com/");
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div/div[2]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"customer-popup-registration\"]")).click();
		driver.findElement(By.id("firstname")).sendKeys("vvcrst");
		driver.findElement(By.id("popup-email_address")).sendKeys("ces0@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9909621755");
		driver.findElement(By.xpath("//*[@id=\"customer-popup-form-register\"]/fieldset/label[1]/div/div/div/span"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"customer-popup-form-register\"]/div[2]/button")).click();
		
		String Url = driver.getCurrentUrl();
		if(Url.equals("https://www.candere.com/")) {
			System.out.println("User login Successfully");
		}
		else {
			System.out.println("User not login Successfully");
		}

//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollTo(0,400);");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   
//		driver.navigate().refresh();
//		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		//click on ring plp
//		JavascriptExecutor rn = (JavascriptExecutor) driver;
//		WebElement ring1 = driver.findElement(By.xpath("//*[@id=\"store.links\"]/nav[1]/div/div/div/div/ul/li[2]/a"));
//		
//		rn.executeScript("arguments[0].click()", ring1);
//		String ring2 = "https://www.candere.com/jewellery/rings.html?jyuhdfbcv";
//		driver.get(ring2);
		
//		
//		String Url1 = driver.getCurrentUrl();
//		if(Url1.equals("https://www.candere.com/jewellery/rings.html")) {
//			System.out.println("login user get redirect");
//		}else {
//			System.out.println("login user not get redirect");
//		}
		
		
	}

}
