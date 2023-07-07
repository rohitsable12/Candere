package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword {
	
	public void signup(WebDriver driver, XSSFSheet sh) {
		
		int i=1;
		XSSFRow rw=sh.getRow(i);
		XSSFCell us=rw.getCell(4);
		
		WebElement user= driver.findElement(By.xpath(us.getStringCellValue()));
		driver.findElement(By.xpath(us.getStringCellValue())).click();
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Sable\\Software\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.candere.com/");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Rohit Sable\\Test frame work\\sign_up_excel.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		Keyword login= new Keyword();
		login.signup(driver, sh);
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("sign_up_excel");
		wb.write(fos);
	}
	
}
