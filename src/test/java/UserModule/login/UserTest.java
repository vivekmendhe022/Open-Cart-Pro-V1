package UserModule.login;

import org.testng.annotations.Test;

import com.generic.utility.BaseClass_User;
import com.object.repository.UserHomePage;

public class UserTest extends BaseClass_User {

	@Test
	public void test() {
		UserHomePage uhp = new UserHomePage(d);

		String navbarText = uhp.getTextFromNavBar();
		System.out.print(navbarText + " ");

		System.out.println("--------------------");
		
		uhp.clickOnCurrencyDropDownList();

		String textFromCurrencyDropDownList = uhp.getTextFromCurrencyDropDownList();
		System.out.println(textFromCurrencyDropDownList);
	}
}
