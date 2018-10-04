package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHome 
{
	@FindBy(id="wzrk-cancel")
	private WebElement popupcancel;
	@FindBy(id="loginPopupLink")
	private WebElement log;
	@FindBy(xpath="(//input[@name='user[new]'])[1]")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(id="popup_login_form")
	private WebElement loginbutton;	

	public LoginHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cancelpopup()
	{
		popupcancel.click();
	}
	
	public void login()
	{
		log.click();
	}
	public void username(String user)
	{
		username.sendKeys(user);
	}
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
	
	
}
