package steps;

import java.util.List;

import Base.BaseTest;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class LoginStep 
{
	@Given("^I navigate to the login page$")
	public void iNavigateToTheLoginPage() throws Throwable 
	{
		System.out.println("Navigate Login Page");
		BaseTest.driver.get("http://localhost:8888/bank/");
	}

	@And("^I click login button$")
	public void iClickLoginButton() throws Throwable 
	{
		LoginPage page = new LoginPage(BaseTest.driver);
		page.ClickLogin();
	}

	@And("^I enter the following for Login$")
	public void iEnterTheFollowingForLogin(DataTable table) throws Throwable 
	{
		LoginPage page = new LoginPage(BaseTest.driver);
		List<String> data = table.asList(String.class);
		page.Login(data.get(2),data.get(3));
	}

	@Then("^I click on logout$")
	public void i_click_on_logout() throws Throwable
	{
		System.out.println("logout");
		HomePage homepage=new HomePage(BaseTest.driver);
		homepage.logout();
	}
}
