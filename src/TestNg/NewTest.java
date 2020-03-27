package TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Firstpage;
import Pages.Secondpage;
import Utilities.ExplicitCode;

public class NewTest  extends ExplicitCode {
	WebDriver dr;
	Firstpage f;
	Secondpage s;
	@BeforeClass
	public void  f1() {
		launchbrowser("chrome","https://www.bmw.in/en/index.html");
	}
  @Test
  public void f() {
	 f= new Firstpage(dr);
	 f.mo();
	 f.mse();
	 f.mfind();
	 f.find();
  }
  @Test 
  public void g() {
	s= new Secondpage(dr);
	s.data();
	String q=s.power();
	writeexcel(q,0,1);
	String w=s.hour();
    int x=Integer.parseInt(q);
    boolean b= true;
	if(x<500) {
		b= false;
		Assert.assertTrue(b, "Don't meet my requirements");
	}else {
		b= true;
		Assert.assertTrue(b, "meet my requirements");
	}
  }
}
