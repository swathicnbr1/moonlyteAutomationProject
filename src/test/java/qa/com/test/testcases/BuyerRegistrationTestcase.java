package qa.com.test.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;
import qa.com.test.scenarios.BuyerRegistrationScenario;
import qa.com.test.scenarios.OnboardingScenario;

public class BuyerRegistrationTestcase extends Baseclass{

	
	
	
	@Test
	public static void buyerRegistration() throws InterruptedException, IOException {

		
		  LoginTestcase.LoginManualEmailPasswordOnboard();
		    Thread.sleep(10000);
			TestData testData = new TestData();
			ArrayList<String> getOnboardDataList = testData.dataSetUp("BuyerRegistrationNonasanIndividual","BuyerRegistration");

			String companyName = getOnboardDataList.get(3);
			String sellerName = getOnboardDataList.get(4);
			
		
			 BuyerRegistrationScenario buyerRegObj=new BuyerRegistrationScenario();
		        buyerRegObj.buyerRegistrationNonasanIndividual(companyName, sellerName);
				
		
		/*
		 * String companyName = "akarsh technology"; String sellerName = "swathi";
		 * LoginTestcase.LoginManualEmailPasswordOnboard(); Thread.sleep(5000);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * BuyerRegistrationScenario buyerRegObj=new BuyerRegistrationScenario();
		 * buyerRegObj.buyerRegistrationNonasanIndividual(companyName, sellerName);
		 */

	}
}
