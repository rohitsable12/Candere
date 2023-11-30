package pages_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check_out_security_page {
	
	WebDriver driver;
	
	public Check_out_security_page(WebDriver driver) {
		
		this.driver = driver;
	}

	By clk_sec_butt = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[7]/div[2]/div[2]/button");
	
	public void clk_check_sec() {
		
		//driver.findElement(clk_sec_butt).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement sec_check = driver.findElement(clk_sec_butt);
		JavascriptExecutor cs= (JavascriptExecutor)driver;
		cs.executeScript("arguments[0].click();", sec_check);
		
		if(sec_check.isEnabled()) {
			System.out.println("checkout security is clicked");
		}
		else {
			System.out.println("checkout security is not clicked");
		}
	}
	

}
