package keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_frame {

	public void signup(WebDriver driver, XSSFSheet sh) {

		int i = 1;
		XSSFRow rw = sh.getRow(i);
		XSSFCell us = rw.getCell(4);
		XSSFCell exp_res = rw.createCell(5);
		XSSFCell act_res = rw.createCell(6);
		XSSFCell sts = rw.createCell(7);

		WebElement user = driver.findElement(By.xpath(us.getStringCellValue()));
		driver.findElement(By.xpath(us.getStringCellValue())).click();

		if (user.isDisplayed()) {
			System.out.println("User profile logo is clicked");
			exp_res.setCellValue("User profile logo is clicked");
			act_res.setCellValue("As expected");
			sts.setCellValue("Pass");
		} else {
			System.out.println("User profile logo not clicked");
			exp_res.setCellValue("User profile logo not clicked");
			act_res.setCellValue("As expected");
			sts.setCellValue("fail");
		}

		int i1 = 2;
		XSSFRow rw1 = sh.getRow(i1);
		XSSFCell up = rw1.getCell(4);
		XSSFCell exp_res1 = rw1.createCell(5);
		XSSFCell act_res1 = rw1.createCell(6);
		XSSFCell sts1 = rw1.createCell(7);

		WebElement sign_up_butt = driver.findElement(By.id(up.getStringCellValue()));
		driver.findElement(By.id(up.getStringCellValue())).click();

		if (sign_up_butt.isEnabled()) {
			System.out.println("signUp button is clicked");
			exp_res1.setCellValue("SignUp button is clicked");
			act_res1.setCellValue("As expected");
			sts1.setCellValue("Pass");
		} else {
			System.out.println("signUp button not clicked");
			exp_res1.setCellValue("SignUp button not clicked");
			act_res1.setCellValue("As expected");
			sts1.setCellValue("fail");
		}

		int i2 = 4;
		XSSFRow rw2 = sh.getRow(i2);
		XSSFCell nm = rw2.getCell(4);
		XSSFCell exp_res2 = rw2.createCell(5);
		XSSFCell act_res2 = rw2.createCell(6);
		XSSFCell sts2 = rw2.createCell(7);

		WebElement name = driver.findElement(By.id(nm.getStringCellValue()));
		driver.findElement(By.id(nm.getStringCellValue())).sendKeys("ronacrsf roy");

		if (name.isDisplayed()) {
			System.out.println("name is entered");
			exp_res2.setCellValue("entered name is display in entered field");
			act_res2.setCellValue("As expected");
			sts2.setCellValue("pass");
		} else {
			System.out.println("name is not entered");
			exp_res2.setCellValue("entered name is not display in entered field");
			act_res2.setCellValue("As expected");
			sts2.setCellValue("fail");
		}

		int i3 = 5;
		XSSFRow rw3 = sh.getRow(i3);
		XSSFCell gm = rw3.getCell(4);
		XSSFCell exp_res3 = rw3.createCell(5);
		XSSFCell act_res3 = rw3.createCell(6);
		XSSFCell sts3 = rw3.createCell(7);

		WebElement gmail = driver.findElement(By.id(gm.getStringCellValue()));
		driver.findElement(By.id(gm.getStringCellValue())).sendKeys("roasfver2@gmail.com");

		if (gmail.isDisplayed()) {
			System.out.println("gmail is entered");
			exp_res3.setCellValue("entered gmail is display in entered field");
			act_res3.setCellValue("As expected");
			sts3.setCellValue("pass");

		} else {
			System.out.println("gmail is not entered");
			exp_res3.setCellValue("entered gmail is display in entered field");
			act_res3.setCellValue("As expected");
			sts3.setCellValue("fail");
		}

		int i4 = 6;
		XSSFRow rw4 = sh.getRow(i4);
		XSSFCell ph = rw4.getCell(4);
		XSSFCell exp_res4 = rw4.createCell(5);
		XSSFCell act_res4 = rw4.createCell(6);
		XSSFCell sts4 = rw4.createCell(7);

		WebElement phone = driver.findElement(By.id(ph.getStringCellValue()));
		driver.findElement(By.id(ph.getStringCellValue())).sendKeys("9972118169");

		if (phone.isDisplayed()) {
			System.out.println("phone number is entered");
			exp_res4.setCellValue("entered phone number is display in entered field");
			act_res4.setCellValue("As expected");
			sts4.setCellValue("pass");
		} else {
			System.out.println("phone number is not entered");
			exp_res4.setCellValue("entered phone number is not display in entered field");
			act_res4.setCellValue("As expected");
			sts4.setCellValue("fail");
		}

		// clickon checkbox
		int i5 = 7;
		XSSFRow rw5 = sh.getRow(i5);
		XSSFCell ch = rw5.getCell(4);
		XSSFCell exp_res5 = rw5.createCell(5);
		XSSFCell act_res5 = rw5.createCell(6);
		XSSFCell sts5 = rw5.createCell(7);

		WebElement checkbox = driver.findElement(By.id(ch.getStringCellValue()));
		// driver.findElement(By.id(ch.getStringCellValue())).click();
		JavascriptExecutor check = (JavascriptExecutor) driver;
		check.executeScript("arguments[0].click();", checkbox);

		if (checkbox.isEnabled()) {
			System.out.println("checkbox is clicked");
			exp_res5.setCellValue("checkbox is clicked");
			act_res5.setCellValue("As expected");
			sts5.setCellValue("Pass");
		} else {
			System.out.println("checkbox is not clicked");
			exp_res5.setCellValue("checkbox is not clicked");
			act_res5.setCellValue("As expected");
			sts5.setCellValue("fail");
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// click on create account
		int i6 = 8;
		XSSFRow rw6 = sh.getRow(i6);
		XSSFCell ca = rw6.getCell(4);
		XSSFCell exp_res6 = rw6.createCell(5);
		XSSFCell act_res6 = rw6.createCell(6);
		XSSFCell sts6 = rw6.createCell(7);

		WebElement creat_account = driver.findElement(By.xpath(ca.getStringCellValue()));
		driver.findElement(By.xpath(ca.getStringCellValue())).click();

		if (creat_account.isDisplayed()) {
			System.out.println("creat account is clicked");
			exp_res6.setCellValue("creat account is click and navigate to home page");
			act_res6.setCellValue("As expected");
			sts6.setCellValue("Pass");
		} else {
			System.out.println("creat account is not clicked");
			exp_res6.setCellValue("creat account is not clicked");
			act_res6.setCellValue("As expected");
			sts6.setCellValue("fail");
		}

		// click Ring on plp page
		int i7 = 10;
		XSSFRow rw7 = sh.getRow(i7);
		XSSFCell rn = rw7.getCell(4);
		XSSFCell exp_res7 = rw7.createCell(5);
		XSSFCell act_res7 = rw7.createCell(6);
		XSSFCell sts7 = rw7.createCell(7);

		driver.get(driver.getCurrentUrl());
		WebElement ring = driver.findElement(By.xpath(rn.getStringCellValue()));
		JavascriptExecutor rng = (JavascriptExecutor) driver;
		rng.executeScript("arguments[0].click();", ring);

		if (ring.equals(rng)) {
			System.out.println("ring listing page is not clicked");
			exp_res7.setCellValue("ring listing page is not clicked and not should be show ring product");
			act_res7.setCellValue("As expected");
			sts7.setCellValue("fail");
		} else {
			System.out.println("ring listing page is clicked");
			exp_res7.setCellValue("ring listing page is clicked and should be show ring product");
			act_res7.setCellValue("As expected");
			sts7.setCellValue("pass");
		}

		// click ptoduct on plp page
		int i8 = 11;
		XSSFRow rw8 = sh.getRow(i8);
		XSSFCell pr = rw8.getCell(4);
		XSSFCell exp_res8 = rw8.createCell(5);
		XSSFCell act_res8 = rw8.createCell(6);
		XSSFCell sts8 = rw8.createCell(7);

		WebElement product = driver.findElement(By.xpath(pr.getStringCellValue()));
		driver.findElement(By.xpath(pr.getStringCellValue())).click();

		if (product.isDisplayed()) {
			System.out.println("product is clicked");
			exp_res8.setCellValue("product is clicked and should be nevigate to PDP page");
			act_res8.setCellValue("As expected");
			sts8.setCellValue("pass");
		} else {
			System.out.println("product is clicked");
			exp_res8.setCellValue("product is clicked and should be nevigate to PDP page");
			act_res8.setCellValue("As expected");
			sts8.setCellValue("fail");
		}

		// switch Window handle
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);

		// scroll
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,400);");

		// click on size
		int i9 = 13;
		XSSFRow rw9 = sh.getRow(i9);
		XSSFCell sz = rw9.getCell(4);
		XSSFCell exp_res9 = rw9.createCell(5);
		XSSFCell act_res9 = rw9.createCell(6);
		XSSFCell sts9 = rw9.createCell(7);

		WebElement size = driver.findElement(By.xpath(sz.getStringCellValue()));
		driver.findElement(By.xpath(sz.getStringCellValue())).click();

//				WebElement size = driver.findElement(By.id(sz.getStringCellValue()));
//				JavascriptExecutor siz = (JavascriptExecutor)driver;
//				//driver.findElement(By.id(sz.getStringCellValue())).click();
//				siz.executeScript("arguments[0].click();", size);

		if (size.isDisplayed()) {
			System.out.println("size droupdown is clicked");
			exp_res9.setCellValue("size droupdown is clicked and it should be show option os size number");
			act_res9.setCellValue("As expected");
			sts9.setCellValue("pass");
		} else {
			System.out.println("size droupdown is not clicked");
			exp_res9.setCellValue("size droupdown is not clicked and it should not be show option os size number");
			act_res9.setCellValue("As expected");
			sts9.setCellValue("fail");
		}

		// click on addcard
		int i10 = 14;
		XSSFRow rw10 = sh.getRow(i10);
		XSSFCell ad = rw10.getCell(4);
		XSSFCell exp_res10 = rw10.createCell(5);
		XSSFCell act_res10 = rw10.createCell(6);
		XSSFCell sts10 = rw10.createCell(7);

		WebElement addcard = driver.findElement(By.xpath(ad.getStringCellValue()));
		driver.findElement(By.xpath(ad.getStringCellValue())).click();

		if (addcard.isDisplayed()) {
			System.out.println("addcard button is clicked");
			exp_res10.setCellValue("addcard button is clicked and it should be display cart page");
			act_res10.setCellValue("As expected");
			sts10.setCellValue("pass");

		} else {
			System.out.println("addcard button is not clicked");
			exp_res10.setCellValue("addcard button is nt clicked and it should be nor display cart page");
			act_res.setCellValue("As expected");
			sts10.setCellValue("fail");
		}
		
		//click on checkout security button
		int i11 = 16;
		XSSFRow rw11 = sh.getRow(i11);
		XSSFCell sec = rw11.getCell(4);
		XSSFCell exp_res11 = rw11.createCell(5);
		XSSFCell act_res11 = rw11.createCell(6);
		XSSFCell sts11 = rw11.createCell(7);

		WebElement checkout_sec = driver.findElement(By.xpath(sec.getStringCellValue()));
		//JavascriptExecutor sec1= (JavascriptExecutor)driver;
		//sec1.executeScript("argumens[0].click()",checkout_sec );
		driver.findElement(By.xpath(sec.getStringCellValue())).click();

		if (checkout_sec.isDisplayed()) {
			System.out.println("checked security button is clicked");
			exp_res11.setCellValue("checked security button is clicked and it should be redirect to address page");
			act_res11.setCellValue("As expected");
			sts11.setCellValue("pass");

		} else 
		{
			System.out.println("checkout security is not clicked");
			exp_res11.setCellValue(
					"checkout security button is not clciked and it should not be redirect to address page");
			act_res11.setCellValue("As expected");
			sts11.setCellValue("fail");
		}	

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Sable\\Software\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mcstaging2.candere.com/");

		FileInputStream fis = new FileInputStream("C:\\Users\\Rohit Sable\\Test frame work\\sign_up_excel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);

		Login_frame login = new Login_frame();
		login.signup(driver, sh);	
		fis.close();

		FileOutputStream fos = new FileOutputStream("sign_up_excel.xlsx");
		wb.write(fos);
	}

}
