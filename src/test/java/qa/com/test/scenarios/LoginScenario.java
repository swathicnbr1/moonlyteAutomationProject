package qa.com.test.scenarios;

import qa.com.baseclass.Baseclass;
import qa.com.pages.LaunchPage;
import qa.com.pages.LoginPage;

public class LoginScenario extends Baseclass {

	LoginPage moonlyteloginPage = new LoginPage();
	LaunchPage pageObjLogin = new LaunchPage();

//MANUAL LOGIN SCENARIOS
	public void manualLogin(String email, String pass) {


		pageObjLogin.signInButtonClick();
		moonlyteloginPage.setEmail(email);
		moonlyteloginPage.clickProceed();
		moonlyteloginPage.setPassword(pass);
		moonlyteloginPage.clickSignIn();

	}
	
	// FACEBOOK LOGIN SCENARIOS
	
	public void facebookLogin(String facebookmailId , String facebookPassword ) {
		// TODO Auto-generated method stub

		pageObjLogin.signInButtonClick();
		moonlyteloginPage.facebookButtonClick();
		moonlyteloginPage.facebookemailIdEnter(facebookmailId);
		moonlyteloginPage.facebookPasswordEnter(facebookPassword);
		moonlyteloginPage.facebookLoginButtonclick();
		
	}

	
	
	//GOOGLE LOGIN SCENARIOS
   public void googleLogin(String googlemailId ,String googlePassword )

{

	pageObjLogin.signInButtonClick();
	moonlyteloginPage.googleButtonClick();
	moonlyteloginPage.googleemailIdEnter(googlemailId );
	moonlyteloginPage.googlenextButtonClick();
	moonlyteloginPage.googlePasswordEnter(googlePassword);
	moonlyteloginPage.googlePasswordNextClick();
	
	
		
	
}




	
	



	
	}
