package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.ExplicitCode;

public class Firstpage {
WebDriver dr;
ExplicitCode e;
public Firstpage(WebDriver dr) {
this.dr=dr;
e= new ExplicitCode();
}
By models=By.xpath("//div[@class='tab-bar tw-flex-1']//div[1]//div[1]//div[@class='tw-cursor-pointer'][1]");
By Seven=By.xpath("//div[@class='tw-flex tw-flex-row tw-items-center tw-justify-center']//div[1]//div[1]//div[1]//div[4]");
By car= By.xpath("//h4[@class='title tw-text-500 tw-mb-100']");

By findout=By.xpath("//div[@class='enhanced-model-card tw-relative tw-p-300 tw-mb-200 tw-mt-200 tw-relative tw-bg-white hover-in enhanced-model-card-small']//div//div//div");
public void mo() {
	WebElement d=e.Clickable(models, 50);
	d.click();
}
public void mse() {
	WebElement d=e.Clickable(Seven, 50);
	d.click();
}
public void mfind() {
	WebElement d=e.Clickable(car, 50);
	d.click();
//	Actions a= new Actions(dr);
//	a.moveToElement(d).build().perform();
//	try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
}
public void find() {
	WebElement d=e.Clickable(findout, 50);
	d.click();
}
}
