package pages_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp_page {
	
	WebDriver driver;
	
	public SignUp_page(WebDriver driver) {
		
		this.driver= driver;
	}
	
	By User_Logo = By.xpath("//div[@class='link_items actions-custom customer-links']");
	By sign_up = By.id("customer-popup-registration");
	By user_name = By.id("firstname");
	By gmail = By.id("popup-email_address");
	By phone_no = By.id("phone");
	By Check_box = By.id("tcagreecreateaccount");
	By creataccount = By
			.xpath("//button[@class='base_btn btn_md primary_btn action submit primary create_account_button_click']");

	public void creat_account(String name, String gmail_id, String Phonenumber) {
		// TODO Auto-generated method stub
		driver.findElement(User_Logo).click();
		driver.findElement(sign_up).click();
		driver.findElement(user_name).sendKeys(name);
		driver.findElement(gmail).sendKeys(gmail_id);
		
		driver.findElement(phone_no).sendKeys(Phonenumber);
	   // driver.findElement(Check_box).click();
		WebElement check = driver.findElement(Check_box);
		JavascriptExecutor box=(JavascriptExecutor)driver;
		box.executeScript("arguments[0].click();", check);
		driver.findElement(creataccount).click();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
	}

}
