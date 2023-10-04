package com.generic.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	// Scroll until a particular WebElement is in the view
	public void scrollToView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// Scroll by x, y coordinates
	public void scrollByCoordinates(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	// Scroll to the top of the page
	public void scrollToTop(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}

	// Scroll to the bottom of the page
	public void scrollToBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void waitForElementToBeClickable(WebDriver d, WebElement element) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This element handle drop down using action class, its hover on particular web
	 * element.
	 * 
	 * @param d
	 * @param element
	 */
	public void handleDropDown(WebDriver d, WebElement element) {
		Actions actions = new Actions(d);
		actions.moveToElement(element).perform();
		;
	}

	/**
	 * This method will click on element using javascript inteface.
	 * 
	 * @param d
	 * @param element
	 */
	public void jsClickOnElement(WebDriver d, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * This method will wait if there's an overlay (like a modal or a loading
	 * spinner), wait for it to disappear before clicking the element.
	 * 
	 * @param d
	 * @param element
	 */
	public void waitForOverlaysToDisappear(WebDriver d, WebElement element) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated((By) element));
	}

}
