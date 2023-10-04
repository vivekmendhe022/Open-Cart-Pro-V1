package com.object.repository.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.utility.WebDriverUtility;

public class SearchProductPage extends WebDriverUtility{

	@FindBy(xpath = "//a[contains(text(),'Apple Cinema')]")
	private WebElement ProductTextLink;

	public SearchProductPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void clickOnProductTextLink(WebDriver d) {
		jsClickOnElement(d, ProductTextLink);
		ProductTextLink.click();
	}
}
