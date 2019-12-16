package qa.com.test.scenarios;

import java.sql.SQLException;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;
import qa.com.pages.LaunchPage;
import qa.com.pages.LoginPage;
import qa.com.pages.RegistrationPage;

public class RegisterScenario  extends Baseclass{

	RegistrationPage regPageObj= new RegistrationPage();
	LaunchPage pageObjLogin = new LaunchPage();

	
	
	
	//MANUAL REGISTER SCENARIOS 
	
	public void manualRegister(String email, String pass) throws SQLException {
		// TODO Auto-generated method stub
 
	
		pageObjLogin.registerButtonClick();
		regPageObj.setEmail(email);
		regPageObj.clickcreateAccount();
		regPageObj.clickRegisterOkPopoup();
		regPageObj.createPassword(pass);
		regPageObj.createPasswordProceedButtonClick();
		
	}
	
	
	
	
	//FACEBOOK REGISTER SCENARIOS
	
	public void facebookRegister(String facebookmailId , String facebookPassword) {
		// TODO Auto-generated method stub
	
		pageObjLogin.registerButtonClick();
		regPageObj.facebookButtonClick();
		regPageObj.facebookemailIdEnter(facebookmailId);
		regPageObj.facebookPasswordEnter(facebookPassword);
		regPageObj.facebookLoginButtonclick();
		


	}
	
	
	//GOOGLE REGISTER SCENARIOS
	
	public void googleRegister(String googlemailId, String googlePassword  )

	{
	
		
		pageObjLogin.registerButtonClick();
		regPageObj.googleButtonClick();
		regPageObj.googleemailIdEnter(googlemailId );
		regPageObj.googlenextButtonClick();
		regPageObj.googlePasswordEnter(googlePassword);
		regPageObj.googlePasswordNextClick();
	
		
		
		
		
	}



	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
