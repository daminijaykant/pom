package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM1.ArchitectandDesigners;
import POM1.Homepage;
import POM1.LoginHome;
import generic.auto_constant;
import generic.Excel;

public class BecomeArchitect implements auto_constant
{

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty(key, value);
		
		
		String address = Excel.abc(excelpath,"Sheet1",1,0);
		String un = Excel.abc(excelpath,"Sheet1",1,1);
		String pwd = Excel.abc(excelpath,"Sheet1",1,2);
		
		String name = Excel.abc(excelpath,"Sheet1",3,0);
		String email = Excel.abc(excelpath,"Sheet1",3,1);
		String number = Excel.abc(excelpath,"Sheet1",3,2);
		String experience = Excel.abc(excelpath,"Sheet1",3,3);
		String city = Excel.abc(excelpath,"Sheet1",3,4);
		String ctc = Excel.abc(excelpath,"Sheet1",3,5);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(address);
		
		LoginHome l = new LoginHome(driver);
		l.cancelpopup();
		//l.login();
		Thread.sleep(3000);
		l.username(un);
		l.password(pwd);
		l.loginbutton();
		
		Homepage h=new Homepage(driver);
		h.architectanddesigners();
		
		ArchitectandDesigners a=new ArchitectandDesigners(driver);
		a.name(name);
		a.email(email);
		a.number(number);
		a.submit1();
		a.experience(experience);
		a.city(city);
		a.ctc(ctc);
		a.submit2();

	}

}
