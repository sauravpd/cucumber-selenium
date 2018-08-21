package steps;

import org.openqa.selenium.firefox.FirefoxDriver;

import Base.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseTest
{
	@Before
	public void InitializeTest() 
	{
		System.out.println("Opening the browser : Firefox");
        BaseTest.driver = new FirefoxDriver();
	}

	@After
	public void TearDownTest(Scenario scenario) 
	{
		if (scenario.isFailed()) 
		{
			System.out.println(scenario.getName());
		}
		BaseTest.driver.close();
	}
}
