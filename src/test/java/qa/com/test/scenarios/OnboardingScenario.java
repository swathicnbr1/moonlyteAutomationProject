package qa.com.test.scenarios;

import qa.com.baseclass.Baseclass;
import qa.com.pages.LaunchPage;
import qa.com.pages.OnboardingPage;

public class OnboardingScenario extends Baseclass{
	
	
	LaunchPage pageObjOnboard = new LaunchPage();
	OnboardingPage PageObj2=new OnboardingPage();

	public void sellerOnboarding(String sellerName, String skill) {
		// TODO Auto-generated method stub
		
		
		pageObjOnboard.freelancerButtonLinkClick();
		
		PageObj2.setName(sellerName);
		
	
		PageObj2.clickOnboardProceed1();
		PageObj2.selectSkill(skill);
		PageObj2.clickOnboardProceed2();
		
		
	}
	
	

	


	
	
	
	
	
	
	
}
