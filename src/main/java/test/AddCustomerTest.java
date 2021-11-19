package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	@Test
	public void validUserSholdBEAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

		dashboardPage.validateDashboardPage();

		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();

		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		
		addCustomerPage.insertFullNAME("Slenium33");
		addCustomerPage.choosCompanyOption("BITS");
		addCustomerPage.insertEmail("email@gmail.com");
		addCustomerPage.insertPhone("56866396+6");
		addCustomerPage.chooseCountryOption("Zambia");
	}

	
	
}
