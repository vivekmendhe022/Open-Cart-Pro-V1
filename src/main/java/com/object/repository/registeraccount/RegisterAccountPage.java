package com.object.repository.registeraccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.utility.WebDriverUtility;

public class RegisterAccountPage extends WebDriverUtility {

	@FindBy(name = "firstname")
	private WebElement FirstNameTextField;

	@FindBy(name = "lastname")
	private WebElement LastNameTextField;

	@FindBy(name = "email")
	private WebElement EmailTextField;

	@FindBy(name = "password")
	private WebElement PasswordTextField;

	@FindBy(xpath = "//input[@id='input-newsletter']")
	private WebElement SubscribeToggleButton;

	@FindBy(name = "agree")
	private WebElement PrivacyPolicyToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement ContinueButton;

	public RegisterAccountPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getSubscribeToggleButton() {
		return SubscribeToggleButton;
	}

	public WebElement getPrivacyPolicyToggleButton() {
		return PrivacyPolicyToggleButton;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}

	public void registerNewUser(WebDriver d, String FIRSTNAME, String LASTNAME, String EMAIL, String PASSWORD) {
		FirstNameTextField.sendKeys(FIRSTNAME);
		LastNameTextField.sendKeys(LASTNAME);
		EmailTextField.sendKeys(EMAIL);
		PasswordTextField.sendKeys(PASSWORD);

		scrollToView(d, SubscribeToggleButton);
		waitForElementToBeClickable(d, SubscribeToggleButton);
		SubscribeToggleButton.click();

		scrollToView(d, PrivacyPolicyToggleButton);
		waitForElementToBeClickable(d, PrivacyPolicyToggleButton);
		PrivacyPolicyToggleButton.click();

		waitForElementToBeClickable(d, ContinueButton);
		ContinueButton.click();
	}

}
