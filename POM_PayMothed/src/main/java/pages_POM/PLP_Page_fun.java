package pages_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PLP_Page_fun {
	
	WebDriver driver;
	
	public PLP_Page_fun(WebDriver driver) {
		this.driver=driver;
	}

	By Click_ring = By.xpath("//*[@id=\"store.links\"]/nav/div/div/div/div/ul/li[2]/a");
	
	public void explore_plp() {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement clk_ring = driver.findElement(Click_ring);
		JavascriptExecutor clk= (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click();", clk_ring);
		
	}
	public void scroll() {	
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,400);");
	}
	
}
