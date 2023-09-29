package com.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement MyAccountDropDownList;

	@FindBy(partialLinkText = "Register")
	private WebElement RegisterLinkText;

	@FindBy(partialLinkText = "Login")
	private WebElement LoginLinkText;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Logout']")
	private WebElement LogoutLinkText;

	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getMyAccountDropDownList() {
		return MyAccountDropDownList;
	}

	public WebElement getRegisterLinkText() {
		return RegisterLinkText;
	}

	public WebElement getLoginLinkText() {
		return LoginLinkText;
	}

	public void clickOnRegisterLinkText() {
		MyAccountDropDownList.click();
		RegisterLinkText.click();
	}

	public void clickOnLoginLinkText() {
		MyAccountDropDownList.click();
		LoginLinkText.click();
	}
	
	public void clickOnLogoutLinkText() {
		MyAccountDropDownList.click();
		LogoutLinkText.click();
	}
	
	
}
