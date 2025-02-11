package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.Page1;

public class Test2 extends BaseTest
{
	@Test
	public void testB()
	{
		Reporter.log(driver.getTitle(),true);
		Page1 p=new Page1(driver);
		p.setElement("Bhanu Prakash H K");
	}
}
