package UserModules.RegisterUser;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.utility.BaseClass_User;
import com.object.repository.HomePage;
import com.object.repository.registeraccount.AccountCreatedInfoPage;
import com.object.repository.registeraccount.RegisterAccountPage;

public class RegisterAsUserTest extends BaseClass_User {

	@Test
	public void registerAsUserTest() {

		int r = jutil.getRandomValue();

		String FIRSTNAME = "Jeva";
		String LASTNAME = "Dass";
		String EMAIL = "dass@gmail.com" + r;
		String PASSWORD = "12345678";

		String expectedTitleOfRegisterPage = "Register Account";
		String expectedTitleOfAccountCreatedPage = "Your Account Has Been Created!";

		HomePage hp = new HomePage(d);
		hp.clickOnRegisterLinkText();
		Assert.assertEquals(d.getTitle(), expectedTitleOfRegisterPage, "Error: Register account page is not display.");
		Reporter.log("Test Script Passed: Register account page is display.", true);

		RegisterAccountPage rap = new RegisterAccountPage(d);
		rap.registerNewUser(d, FIRSTNAME, LASTNAME, EMAIL, PASSWORD);
		
		Assert.assertEquals(rap.getFirstNameTextField().getAttribute("value"), FIRSTNAME, "Error: Firstname is not entered properly.");
		Reporter.log("Firstname is entered properly.", true);
		Assert.assertEquals(rap.getLastNameTextField().getAttribute("value"), LASTNAME, "Error: Lastname is not entered properly.");
		Reporter.log("Lastname is entered properly.", true);
		Assert.assertEquals(rap.getEmailTextField().getAttribute("value"), EMAIL, "Error: Email is not entered properly.");
		Reporter.log("Email is entered properly.", true);
		Assert.assertEquals(rap.getPasswordTextField().getAttribute("value"), PASSWORD, "Error: Password is not entered properly.");
		Reporter.log("Password is entered properly.", true);
		Assert.assertEquals(rap.getSubscribeToggleButton().isEnabled(), true, "Error: Subscribe toggle button is not selected");
		Reporter.log("Subscribe toggle button is selected", true);
		Assert.assertEquals(rap.getPrivacyPolicyToggleButton().isEnabled(), true, "Error: Privacy Policy toggle button is not selected");
		Reporter.log("Privacy Policy toggle button is selected", true);

		AccountCreatedInfoPage acip = new AccountCreatedInfoPage(d);
		String header = acip.accountCreatedHeader();
		Assert.assertTrue(header.contains(expectedTitleOfAccountCreatedPage));

	}
}
