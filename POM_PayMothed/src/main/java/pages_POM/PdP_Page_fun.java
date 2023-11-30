package pages_POM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PdP_Page_fun {

	WebDriver driver;

	public PdP_Page_fun(WebDriver driver) {

		this.driver = driver;
	}

	By selct_product = By.xpath("//*[@id=\"amasty-shopby-product-list\"]/div[2]/ol/li[1]/div[2]/a[2]/span/span/img");
	By select_size = By.id("mt_size");
	By Add_cart = By.id("product-addtocart-button");
	
	public void product_fun() {
		// TODO Auto-generated method stub
		driver.findElement(selct_product).click();	
	}

	public void switch_win() {
		// TODO Auto-generated method stub
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,400);");
		
		WebElement siz = driver.findElement(select_size);
		JavascriptExecutor sz= (JavascriptExecutor)driver;
		sz.executeScript("arguments[0].click();", siz);
		
		//select size
		Select size=new Select(driver.findElement(select_size));
		size.selectByVisibleText("20");
		
		if(size.equals(size)) {
			System.out.println("size is selected");
		}else {
			System.out.println("size is not selected");
		}

		
		//click on addcart
		driver.findElement(Add_cart).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.navigate().refresh();
	
	}
}
