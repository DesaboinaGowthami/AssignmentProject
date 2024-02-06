package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage 
{

	public RegistrationPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement txt_firstname;
	@FindBy(xpath="//input[@id='lastname']")
	WebElement txt_lastname;
	@FindBy(xpath="//input[@id='email_address']")
	WebElement txt_email;
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_pwd;
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement txt_Confirmpwd;
	@FindBy(xpath="//span[text()='Create an Account']")
	WebElement btn_createacct;
	public void setFirstname(String uname) {
		txt_firstname.sendKeys(uname);
	}
	public void setLastname(String lname) {
		txt_lastname.sendKeys(lname);
	}
	public void setEmail(String mailid) {
		txt_email.sendKeys(mailid);
	}
	public void setPassword(String password) {
		txt_pwd.sendKeys(password);
	}
	public void setConfirmPassword(String cpassword) {
		txt_Confirmpwd.sendKeys(cpassword);
	}
	public void Create() {
		
		btn_createacct.click();
		
	}


}
