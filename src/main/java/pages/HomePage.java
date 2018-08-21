package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Home Page
 * @author saurav
 *
 */
public class HomePage
{	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='navigation']//a[contains(text(),'Logout')]")
	private WebElement logoutBtn;

	public void logout()
	{
		logoutBtn.click();
	}
}
