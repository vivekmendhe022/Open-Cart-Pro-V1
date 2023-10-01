package com.object.repository.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.utility.WebDriverUtility;
import com.object.repository.HomePage;

public class UserLoginPage extends WebDriverUtility {

	@FindBy(id = "input-email")
	private WebElement EmailTextField;

	@FindBy(id = "input-password")
	private WebElement PasswordTextField;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement LoginButton;

	public UserLoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void userLogin(WebDriver d, String EMAIL, String PASSWORD) {
		HomePage hp = new HomePage(d);
		hp.clickOnLoginLinkText();
		EmailTextField.sendKeys(EMAIL);
		PasswordTextField.sendKeys(PASSWORD);
		LoginButton.click();
	}
}
