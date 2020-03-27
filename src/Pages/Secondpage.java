package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.ExplicitCode;

public class Secondpage {
	WebDriver dr;
	ExplicitCode e;
	public Secondpage(WebDriver dr) {
	this.dr=dr;
	e= new ExplicitCode();
	}
	By tech=By.xpath("//div[@class='scroll-navigation-content tw-h-full']//div[3]");
	By horse=By.xpath("//div[@id=\"top-of-content\"]/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[1]/div/table/tbody/tr[4]/td[2]/div");
	By km=By.xpath("//div[@id=\"top-of-content\"]/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[2]/div");
	public void data() {
		WebElement d= e.Clickable(tech, 50);
		d.click();
	}
	public String power() {
		WebElement d= e.waitforElement(horse, 50);
		String s=d.getText();
		String q=s.substring(5,8);
		System.out.println(q);
		return q;
	}
	public String hour() {
		WebElement d= e.waitforElement(km, 50);
		String s=d.getText();
		return s;
	}
}
