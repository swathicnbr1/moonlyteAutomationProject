package qa.com.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationPage extends Baseclass {

	WebDriverWait wait = new WebDriverWait(driver, 20);

	By email;
	By proceedButtonClick;
	By setPassword;
	By FacebbookButton;
	By facebookUsername;
	By facebookPassword;
    By facebookLoginButton;
	By googleButton;
	By googleEmailId;
	By googleNextButton;
	By googlePassword;
	By googlePaswordNext;
	By registerOkPopup;
	By createPasswordButton;
	String parentWindowId;
	String childWindowId;
	
	
	
	
	//manual registration 
	
	
	public RegistrationPage() {
		
		
		
		email=By.xpath("//*[@id='emailInput']");
        setPassword = By.xpath("//*[@id='password-field1']");
        createPasswordButton= By.cssSelector("button#mlui14");
        registerOkPopup=By.xpath("//button[@class='swal2-confirm swal2-styled']");
        
        
		FacebbookButton=By.xpath("//*[@id='mlui10']");
		facebookUsername=By.xpath("//*[@id='email']");
		facebookPassword=By.xpath("//*[@id='pass']");
		
		
		googleButton =By.xpath("//*[@id='mlui11']");
		googleEmailId=By.xpath("//input[@class='whsOnd zHQkBf']");
		googleNextButton=By.xpath("//*[@id='identifierNext']/span/span");
		googlePassword=By.name("password");
		googlePaswordNext=By.xpath("//*[@id='passwordNext']/span/span");
//		registerOkPopup=By.xpath("//button[contains(text(),'OK')]");
		
		
		
	}

	public void setEmail(String emailId) {
		
		
		WebDriverWait some_element = new WebDriverWait(driver,100); 
		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='emailInput']"))); 
		
		driver.findElement(email).sendKeys(emailId);
		
	}

	public void clickcreateAccount()  {

		WebElement ele = driver.findElement(By.cssSelector("button#mlui12"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		
		
		
		/*
		 * Statement s = con.createStatement(); ResultSet rs = s.
		 * executeQuery("SELECT email_verifications.verification_key FROM aspirants JOIN email_verifications\r\n"
		 * +
		 * "   ON aspirants.aspirant_id = email_verifications.aspirant_id where aspirants.email_address=\"swathicnbr@gmail.com\" ;"
		 * ); String key = null; while (rs.next()) { key =
		 * rs.getString("verification_key"); }
		 * 
		 * // String key = UUID.randomUUID().toString().replaceAll("-", "");
		 * 
		 * driver.get("https://www.qa.moonlyte.com/accounts/login-change-password/" +
		 * key);
		 */
	}

	public void clickRegisterOkPopoup() throws SQLException {

		
		WebElement ele = driver.findElement(registerOkPopup);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		
		
		
		 Statement s = con.createStatement(); 
		 ResultSet rs = s.executeQuery("SELECT email_verifications.verification_key FROM aspirants JOIN email_verifications\r\n"
		  + "   ON aspirants.aspirant_id = email_verifications.aspirant_id where aspirants.email_address=\"swathicnbr@gmail.com\" ;");
		   String key = null; 
		   while (rs.next()) { 
			   key = rs.getString("verification_key"); }
		 
		  // String key = UUID.randomUUID().toString().replaceAll("-", "");
		 
		 driver.get("https://www.qa.moonlyte.com/accounts/login-change-password/" +
		 key);
		
		
		
	}

	public void createPassword(String password)

	{

		WebDriverWait some_element = new WebDriverWait(driver, 100);
		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password-field1']")));

		driver.findElement(setPassword).sendKeys(password);

	}
	
	public void createPasswordProceedButtonClick()
	{
		
		
		WebElement ele = driver.findElement(createPasswordButton);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		
		
	}
	
	
	
	
	
	
	// facebookregistration
	
	
	public  void facebookButtonClick()

	{
		driver.findElement(FacebbookButton).click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it=handler.iterator();

		String parentWindowId=it.next();
		String childWindowId=it.next();

		driver.switchTo().window(childWindowId);



	}
	
	
	public void facebookemailIdEnter(String facebookmailId )
	{
		driver.findElement(facebookUsername).sendKeys(facebookmailId);

	}

	public void facebookPasswordEnter(String facebookPass) {


		driver.findElement(facebookPassword).sendKeys(facebookPass);

	}
	public void facebookLoginButtonclick()
	{

		WebElement ele = driver.findElement(By.cssSelector("input#u_0_0"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		

		//driver.switchTo().window(parentWindowId);

	}


	//GoogleRegistration
	
	public void googleButtonClick()
	{
	
		driver.findElement(googleButton).click();
		
		
		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it=handler.iterator();

		String parentWindowId=it.next();
		String childWindowId=it.next();

		driver.switchTo().window(childWindowId);
		
	
   }
	

	public void googleemailIdEnter(String googleemailId)
	{
		driver.findElement(googleEmailId).sendKeys(googleemailId);

	}

	public void googlenextButtonClick() 
	{
	
		WebElement ele = driver.findElement(googleNextButton);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
	}
	

	
	public void googlePasswordEnter(String googlePass) {

		
		WebDriverWait some_element = new WebDriverWait(driver,100); 
		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

		driver.findElement(googleEmailId).sendKeys(googlePass);
		//driver.findElement().sendKeys(facebookPass);

	}
	
	public void googlePasswordNextClick()
	
	
	{
	
		WebElement ele = driver.findElement(googlePaswordNext);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		driver.switchTo().window(parentWindowId);
		
	
	
}
}