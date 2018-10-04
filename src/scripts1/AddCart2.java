package scripts1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.auto_constant;
import generic.Excel;
import POM1.Cartpopup;
import POM1.Homepage;
import POM1.LoginHome;
import POM1.Logout;
import POM1.ProductPage;
import POM1.Searchlist1;

public class AddCart2 implements auto_constant
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(key, value);
		
		
		String address = Excel.abc(excelpath,"Sheet1",1,0);
		String un = Excel.abc(excelpath,"Sheet1",1,1);
		String pwd = Excel.abc(excelpath,"Sheet1",1,2);
		String ele = Excel.abc(excelpath, "Sheet1", 1, 3);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(address);
		
		LoginHome l=new LoginHome(driver);
		l.cancelpopup();
		l.login();
		Thread.sleep(3000);
		l.username(un);
		l.password(pwd);
		l.loginbutton();
		
		Homepage h=new Homepage(driver);
		Thread.sleep(3000);
		h.search(ele);
		h.searchbutton();		
		Thread.sleep(3000);
		
		Searchlist1 s=new Searchlist1(driver);
		s.clickitem();
		
		Thread.sleep(3000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    
	    ProductPage p=new ProductPage(driver);
		p.addbutton();		
		
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
		
		Logout lo=new Logout(driver);
		lo.profiledropdown();
		lo.logout();

	}

}
