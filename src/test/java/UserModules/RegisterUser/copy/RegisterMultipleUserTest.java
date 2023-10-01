package UserModules.RegisterUser.copy;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic.utility.BaseClass_User;
import com.object.repository.HomePage;
import com.object.repository.registeraccount.AccountCreatedInfoPage;
import com.object.repository.registeraccount.LogoutPage;
import com.object.repository.registeraccount.RegisterAccountPage;

public class RegisterMultipleUserTest extends BaseClass_User {

	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		return eutil.readMultipleDataFromExcelFile("MultipleUserRegistration");
	}

	@Test(dataProvider = "getData")
	public void registerAsUserTest(String FIRSTNAME, String LASTNAME, String EMAIL, String PASSWORD) {

		int r = jutil.getRandomValue();

		String expectedTitleOfRegisterPage = "Register Account";
		String expectedTitleOfAccountCreatedPage = "Your Account Has Been Created!";

		HomePage hp = new HomePage(d);
		hp.clickOnRegisterLinkText();
		Assert.assertEquals(d.getTitle(), expectedTitleOfRegisterPage, "Error: Register account page is not display.");
		Reporter.log("Test Script Passed: Register account page is display.", true);

		RegisterAccountPage rap = new RegisterAccountPage(d);
		rap.registerNewUser(d, FIRSTNAME, LASTNAME, EMAIL + r, PASSWORD);

		AccountCreatedInfoPage acip = new AccountCreatedInfoPage(d);
		String header = acip.accountCreatedHeader();
		Assert.assertTrue(header.contains(expectedTitleOfAccountCreatedPage));

	}
}
