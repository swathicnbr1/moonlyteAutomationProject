package qa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;

public class OnboardingPage extends Baseclass {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	By name;
	By proceedButton;
	By skillSelection;
	By proceedButton1;
	

	
	
	public OnboardingPage()
	{


		name=By.xpath("//input[@type='text']");
		proceedButton=By.xpath("//button[contains(text(),'PROCEED')]");
		skillSelection=By.xpath("//*[@id='onboard-add-skills']/div[1]/mat-form-field/div/div[1]/div");
		 proceedButton1=By.xpath("//button[@class='btn btn-primary btn-ml pulse']");
		
	}
	
	public void setName(String sellerName) {


		//WebDriverWait some_element = new WebDriverWait(driver,200); 
		
		//some_element.until(ExpectedConditions.visibilityOfElementLocated(name)); 

		driver.findElement(name).sendKeys(sellerName);
		//driver.findElement(name).sendKeys(sellerName + Keys.ARROW_DOWN.ENTER);


	}	
	
public void clickOnboardProceed1()  {


		
		WebElement ele = driver.findElement(proceedButton);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		

	}
	
public void selectSkill(String skill) {
	
	driver.findElement(name).sendKeys(skill+ Keys.ARROW_DOWN.ENTER);

}

public void clickOnboardProceed2()  {


	
	WebElement ele = driver.findElement(proceedButton1);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	

}


}