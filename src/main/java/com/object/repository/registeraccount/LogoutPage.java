package com.object.repository.registeraccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	@FindAll({ @FindBy(xpath = "//span[normalize-space()='My Account']"),
			@FindBy(xpath = "//span[normalize-space()='123456789']/../following-sibling::li/div//a[.='Logout']") })
	private WebElement MyAccountDropDownList;

	@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Logout']")
	private WebElement LogoutLinkText;

	public LogoutPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getMyAccountDropDownList() {
		return MyAccountDropDownList;
	}

	public WebElement getLogoutLinkText() {
		return LogoutLinkText;
	}

	public void clickOnLogoutLinkText() {
		MyAccountDropDownList.click();
		LogoutLinkText.click();
	}
}
