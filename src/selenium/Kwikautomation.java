package selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kwikautomation {

	//private static WebElement user;
	
	public void login(WebDriver driver, XSSFSheet sh) throws InterruptedException {
			
		//user name
		int i=1;
		XSSFRow rw=sh.getRow(i);
		XSSFCell us=rw.getCell(4);
		XSSFCell exp_res=rw.createCell(5);
		XSSFCell act_res=rw.createCell(6);
		XSSFCell sts=rw.createCell(7);
	
		
			WebElement user=driver.findElement(By.id(us.getStringCellValue()));
		driver.findElement(By.id(us.getStringCellValue())).sendKeys("25608");
		
		if(user.isDisplayed())
		{
			System.out.println("entered user name is display");
			exp_res.setCellValue("entered user name is display in text field");
			act_res.setCellValue("As expected");
			sts.setCellValue("Pass");
		}
		else
		{
			System.out.println("entered user name is not display");
			exp_res.setCellValue("entered user name is not display in text field");
			act_res.setCellValue("As expected");
			sts.setCellValue("fail");
		}

		
		Thread.sleep(1000);
		
		//password
		int p=2;
		XSSFRow rw2=sh.getRow(p);
		XSSFCell ps=rw2.getCell(4);
		XSSFCell exp_res1=rw2.createCell(5);
		XSSFCell act_res1=rw2.createCell(6);
		XSSFCell sts1=rw2.createCell(7);
	
		WebElement	pass=driver.findElement(By.id(ps.getStringCellValue()));
		driver.findElement(By.id(ps.getStringCellValue())).sendKeys("mosl@123");
		
		if(pass.isDisplayed())
		{
			System.out.println("entered password is display");
			exp_res1.setCellValue("entered password is display in text field");
			act_res1.setCellValue("As expected");
			sts1.setCellValue("Pass");
		}
		else
		{
			System.out.println("entered password is not display");
			exp_res1.setCellValue("entered password is not display in text field");
			act_res1.setCellValue("As expected");
			sts1.setCellValue("fail");
	
		}
		
		Thread.sleep(3000);
		
		//sign in button
		int b=3;
		XSSFRow rw3=sh.getRow(b);
		XSSFCell but=rw3.getCell(4);
		XSSFCell exp_res2=rw3.createCell(5);
		XSSFCell act_res2=rw3.createCell(6);
		XSSFCell sts2=rw3.createCell(7);
	
		WebElement	button=driver.findElement(By.id(but.getStringCellValue()));
		driver.findElement(By.id(but.getStringCellValue())).click();
		
		if(button.isDisplayed())
		{
			System.out.println("button is click");
			exp_res2.setCellValue("button is clicked successfully");
			act_res2.setCellValue("As expected");
			sts2.setCellValue("Pass");
		}
		else
		{
			System.out.println("button is not click");
			exp_res2.setCellValue("button is not clicked successfully");
			act_res2.setCellValue("As expected");
			sts2.setCellValue("fail");
	
		}
		Thread.sleep(2000);
		
//		//Search element
//		int s=4;
//		XSSFRow rw4=sh.getRow(s);
//		XSSFCell ser=rw4.getCell(4);
//		XSSFCell exp_res3=rw4.createCell(5);
//		XSSFCell act_res3=rw4.createCell(6);			
//		XSSFCell sts3=rw4.createCell(7);
//		
//		Thread.sleep(1000);
//
//		
//		WebElement search=driver.findElement(By.xpath(ser.getStringCellValue()));
//		
//		//to click element( intercepted exception) of click button
//		JavascriptExecutor ex=(JavascriptExecutor) driver;
//		ex.executeScript("arguments[0].click();",search);
//		
//		if(search.isDisplayed())
//		{
//			System.out.println("search button is clicked");
//			exp_res3.setCellValue("search is clicked successfully");
//			act_res3.setCellValue("As expected");
//			sts3.setCellValue("Pass");
//		}
//		else
//		{
//			System.out.println("search button is not clicked");
//			exp_res3.setCellValue("search is not clicked successfully");
//			act_res3.setCellValue("As expected");
//			sts3.setCellValue("fail");
//		}
		
		Thread.sleep(3000);
//		//menu button
		int m=5;
		XSSFRow rw5=sh.getRow(m);
		XSSFCell men=rw5.getCell(4);
		XSSFCell exp_res4=rw5.createCell(5);
		XSSFCell act_res4=rw5.createCell(6);
		XSSFCell sts4=rw5.createCell(7);
		
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"lnk_menutoggle\"]"));
		driver.findElement(By.xpath(men.getStringCellValue())).click();
//		JavascriptExecutor me=(JavascriptExecutor) driver;
//		me.executeScript("arguments[0].click();",menu);
		
		
		if(menu.isDisplayed())
		{
			System.out.println("menu is clicked");
			exp_res4.setCellValue("menu button should be clicked");
			act_res4.setCellValue("menu is clicked");
			sts4.setCellValue("pass");
			}
		else
		{
			System.out.println("menu is not clicked");
			exp_res4.setCellValue("menu button should be clicked");
			act_res4.setCellValue("menu button is not clicked");
			sts4.setCellValue("fail");
		}
		
		//scroll down
		
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#js-primary-nav').scrollBy(0,120)");
//		
		
		
///		//click on SMC2 
		Thread.sleep(2000);
		int s=6;
		XSSFRow rw6=sh.getRow(s);
		XSSFCell smc=rw6.getCell(4);
		XSSFCell exp_res5=rw6.createCell(5);
		XSSFCell act_res5=rw6.createCell(6);
		XSSFCell sts5=rw6.createCell(7);
		
		
//		Actions ne=new Actions(driver);
//		ne.moveToElement(driver.findElement(By.xpath(smc.getStringCellValue())));
//		ne.click();
		WebElement smc2=driver.findElement(By.id(smc.getStringCellValue()));
		//driver.findElement(By.id(smc.getStringCellValue())).click();
		Thread.sleep(2000);

		JavascriptExecutor sm=(JavascriptExecutor)driver;
		sm.executeScript("arguments[0].click();",smc2);
		
		
		if(smc2.isDisplayed())
		{
			System.out.println("SMC2 is clicked");
			exp_res5.setCellValue("SMC2 button should be clicked");
			act_res5.setCellValue("SMC2 is clicked");
			sts5.setCellValue("pass");
			}
		else
		{
			System.out.println("SMC2 is not clicked");                                            
			exp_res5.setCellValue("SMC2 button should be clicked");
			act_res5.setCellValue("SMC2 button is not clicked");
			sts5.setCellValue("fail");
		}                         
		//for time pass
//		int tp=7;
//		XSSFRow rw7=sh.getRow(s);
//		XSSFCell tps=rw7.getCell(4);
//		XSSFCell exp_res6=rw7.createCell(5);
//		XSSFCell act_res6=rw7.createCell(6);
//		XSSFCell sts6=rw7.createCell(7);
//	
		
	
	}
	
	
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Sable\\Software\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://kwikuat.motilaloswal.com:8082/index.html");
		
		driver.manage().window().maximize();
		
		//File sc=new File("C:\\Rohit\\TestCases\\kwik automation.xlsx");
		FileInputStream fis=new FileInputStream("C:\\Rohit\\kwik automation.xlsx");
		//@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		Kwikautomation login1=new Kwikautomation();
		login1.login(driver, sh);
		fis.close();
		
		FileOutputStream fos=new FileOutputStream("kwik automation.xlsx");
		wb.write(fos);
		
	
	}
	
	}
