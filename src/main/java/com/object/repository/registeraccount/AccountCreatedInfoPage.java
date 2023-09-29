package com.object.repository.registeraccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedInfoPage {

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	private WebElement AccountCreatedInfoHeader;

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement ContinueButton;

	public AccountCreatedInfoPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public String accountCreatedHeader() {
		return AccountCreatedInfoHeader.getText();
	}

	public void clickOnContinueButton() {
		ContinueButton.click();
	}
}
