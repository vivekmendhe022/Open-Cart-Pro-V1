package com.object.repository.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	@FindBy(xpath = "//h1[normalize-space()='Apple Cinema 30\"']")
	private WebElement ProductHeaderInfo;

	public ProductDetailPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public String getProductHeaderText() {
		return ProductHeaderInfo.getText();
	}
}
