package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM1.Homepage;
import POM1.LoginHome;
import POM1.Logout;
import POM1.Wishlistpopup;
import generic.auto_constant;
import generic.Excel;

public class WishlistToCart implements auto_constant
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(key, value);
		
		
		String address = Excel.abc(excelpath,"Sheet1",1,0);
		String un = Excel.abc(excelpath,"Sheet1",1,1);
		String pwd = Excel.abc(excelpath,"Sheet1",1,2);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(address);
		
		LoginHome l = new LoginHome(driver);
		l.cancelpopup();
		l.login();
		Thread.sleep(3000);
		l.username(un);
		l.password(pwd);
		l.loginbutton();
		
		Thread.sleep(3000);
		
		Homepage h=new Homepage(driver);
		h.wishlistlogo();
		
		Wishlistpopup w=new Wishlistpopup(driver);
		w.addtocart();
		w.closepopup();
		
		Logout lo=new Logout(driver);
		lo.profiledropdown();
		lo.logout();		

	}

}
