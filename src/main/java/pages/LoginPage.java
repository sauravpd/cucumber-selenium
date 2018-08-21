package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class LoginPage
{
	@FindBy(name = "username")
	private WebElement txtusername;

	@FindBy(name = "password")
	private WebElement txtpassword;

	@FindBy(xpath = ".//*[@type='submit']")
	private WebElement submitbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Login(String userName, String password)
	{
		txtusername.sendKeys(userName);
		txtpassword.sendKeys(password);
	}


	public HomePage ClickLogin()
	{
		submitbtn.click();
		return new HomePage(BaseTest.driver);
	}
}
