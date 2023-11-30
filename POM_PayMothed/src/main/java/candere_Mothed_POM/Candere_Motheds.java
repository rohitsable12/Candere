package candere_Mothed_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_POM.Check_out_security_page;
import pages_POM.PLP_Page_fun;
import pages_POM.PdP_Page_fun;
import pages_POM.SignUp_page;

public class Candere_Motheds {
	
	 WebDriver driver;
	// Sauce_Filter_page objectrepo;
	 SignUp_page creatuser;
	 PLP_Page_fun click_dcroll;
	 PdP_Page_fun PDP_page_fun;
	 Check_out_security_page checksecurity;
	 
	@BeforeTest
	public void browse_Url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Sable\\Software\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.candere.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	// sign up code
	@Test(priority=1)
	public void SignUp_User() {
		//SignUp_page creat= new SignUp_page(driver);
		creatuser =new SignUp_page(driver);
		creatuser.creat_account("dgafcfd", "bsfg3431@gmail.com","9971212731");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	}
	@Test(priority=2)
	public void plp_page() {

		click_dcroll = new PLP_Page_fun(driver);
		click_dcroll.explore_plp();
		click_dcroll.scroll();
	}
	
	@Test(priority=3)
	public void PDP_Page() {
		PDP_page_fun = new PdP_Page_fun(driver);
		PDP_page_fun.product_fun();	
		PDP_page_fun.switch_win();
		
		
	}
	
	@Test(priority=4)
	public void chck_secrty() {
		checksecurity = new Check_out_security_page(driver);
		checksecurity.clk_check_sec();
		
		
	}
	
}
