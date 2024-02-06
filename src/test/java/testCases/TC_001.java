package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;

import testBase.BaseClass;

public class TC_001 extends BaseClass 
{
     @Test
	public void CreateAccount() throws InterruptedException {
	
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		logger.debug("****Application logs*****");
		logger.info("********clicking on my account********");
		hp.click_Myacct();
		Thread.sleep(5000);
		rp.setFirstname(RB.getString("firstname"));
		rp.setLastname(RB.getString("lastname"));
		rp.setEmail(RB.getString("email"));
		rp.setPassword(RB.getString("password"));
		rp.setConfirmPassword("confirmpassword");
		rp.Create();
				
	
     
     }


}
