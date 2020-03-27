package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import getExcel.WriteExcel;

public class ExplicitCode extends WriteExcel {
protected static WebDriver dr;
int counter =1;
public WebElement waitforElement(By locator,int timeout) {
	WebElement e= null;
	try {
	WebDriverWait p= new WebDriverWait(dr,timeout);
	e=p.until(ExpectedConditions.visibilityOfElementLocated(locator));
	System.out.println("element located");
	}catch(Exception f) {
	System.out.println("Element not located");	
	}
	return e;
}
public WebElement Clickable(By locator,int timeout) {
	WebElement e= null;
	try {
		WebDriverWait p= new WebDriverWait(dr,timeout);
		e=p.until(ExpectedConditions.elementToBeClickable(locator));
		System.out.println("Element located");
	}catch(Exception f) {
		System.out.println("element not located");
	}
	return e;
}
public void launchbrowser(String browser,String url) {
	if(browser.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
		dr= new ChromeDriver();
		
	}else if(browser.contains("firefox")) {
		System.setProperty("webdriver.gecko.driver", "geckodriver_v73.exe");
		dr= new FirefoxDriver();
	}
	dr.get(url);
	dr.manage().window().maximize();
}
public void Screenshot() {
	String filename="";
	String path=counter+".png";
	File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	File f2=new File(filename+path);
	try {
		FileUtils.copyFile(f1, f2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(counter+" failed");
		e.printStackTrace();
	}
}
}
