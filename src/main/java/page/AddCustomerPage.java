package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;

	}

//Element lib
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_FIELD_LOCATOR;

	public void insertFullNAME(String FullName) {

		USERNAME_FIELD_LOCATOR.sendKeys(FullName + randomGenerator(999));
	}

	public void choosCompanyOption(String company) {

		selectDropDown(COMPANY_FIELD_LOCATOR, company);
	}

	public void insertEmail(String email) {

		EMAIL_FIELD_LOCATOR.sendKeys(randomGenerator(999) + email);
	}
	public void insertPhone(String phone) {

		PHONE_FIELD_LOCATOR.sendKeys(randomGenerator(999) + phone);

	}
	public void chooseCountryOption(String Country) {
	selectDropDown(COUNTRY_FIELD_LOCATOR, Country);	
		
	}
}
