package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	
	
	
	
	//Element Library
	@FindBy(how=How.XPATH, using="//*[@id='username']")WebElement USER_NAME_FILD;
	@FindBy(how=How.XPATH, using="//*[@id=\'password\']")WebElement USER_PASSWORD_FILD;
	@FindBy(how=How.XPATH, using="/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON;
	
	
	public void insertUserName(String userName) {
		USER_NAME_FILD.sendKeys(userName);
		
		
	}
	
	public void insertPassword(String password) {
		USER_PASSWORD_FILD.sendKeys(password);
		
		
	}
	public void clickSigninButton() {
		SIGNIN_BUTTON.click();
		
		
	}
}
