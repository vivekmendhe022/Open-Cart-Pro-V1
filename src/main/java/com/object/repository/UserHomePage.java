package com.object.repository;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.utility.WebDriverUtility;

public class UserHomePage extends WebDriverUtility {

	@FindBy(xpath = "//nav[@id='top']")
	private WebElement NavBar;

	@FindBy(xpath = "//span[normalize-space()='Currency']")
	private WebElement CurrencyDropDownList;

	@FindBy(xpath = "//ul[@class='dropdown-menu show']")
	private WebElement CurrencyDropDownListTextData;

	@FindBy(xpath = "//img[@title='Your Store']")
	private WebElement HomeLookUpIcon;

	// navigate to navbar links
	// Dekstops
	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	private WebElement DekstopsDropDownList;

	@FindBy(xpath = "//a[contains(text(),'PC')]")
	private WebElement PCLinkText;

	@FindBy(xpath = "//a[contains(text(),'Mac')]")
	private WebElement MacLinkTextFromDekstops;

	@FindBy(xpath = "//a[normalize-space()='Show All Desktops']")
	private WebElement ShowAllDesktopsLinkText;

	// Laptops & Notebooks
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksDropDown;

	@FindBy(xpath = "//a[contains(text(),'Mac')]")
	private WebElement MacLinkTextFromLaptopsAndNotebooks;

	@FindBy(xpath = "//a[contains(text(),'Windows')]")
	private WebElement WindowsLinkTextFromLaptopsAndNotebooks;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopsAndNotebooksLinkText;

	// Components
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='Components']")
	private WebElement ComponentsDropDownList;

	@FindBy(xpath = "//a[contains(text(),'Mice and Trackballs')]")
	private WebElement MiceAndTrackballsLinkText;

	@FindBy(xpath = "//a[contains(text(),'Monitors')]")
	private WebElement MonitorsLinkText;

	@FindBy(xpath = "//a[contains(text(),'Printers')]")
	private WebElement PrintersLinkText;

	@FindBy(xpath = "//a[contains(text(),'Scanners')]")
	private WebElement ScannersLinkText;

	@FindBy(xpath = "//a[contains(text(),'Web Cameras')]")
	private WebElement WebCamerasLinkText;

	@FindBy(xpath = "//a[normalize-space()='Show All Components']")
	private WebElement ShowAllComponentsLinkText;

	// Tablets
	@FindBy(xpath = "//a[normalize-space()='Tablets']")
	private WebElement TabletsLinkText;

	// Software
	@FindBy(xpath = "//a[normalize-space()='Software']")
	private WebElement SoftwareLinkText;

	// Phones & PDAs
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Phones & PDAs']")
	private WebElement PhonesAndPDAsLinkText;

	// Cameras
	@FindBy(xpath = "//a[normalize-space()='Cameras']")
	private WebElement CamerasLinkText;

	// MP3 Players
	@FindBy(xpath = "//a[normalize-space()='MP3 Players']")
	private WebElement MP3PlayersLinkText;

	/**
	 * User home page constructor for intiize all web elements.
	 * 
	 * @param d
	 */
	public UserHomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public String getTextFromNavBar() {
		return NavBar.getText();
	}

	public void clickOnCurrencyDropDownList() {
		CurrencyDropDownList.click();
	}

	public String getTextFromCurrencyDropDownList() {
		return CurrencyDropDownListTextData.getText();
	}

	public void clickOnHomeLookIUpIcon() {
		HomeLookUpIcon.click();
	}

	public void clickOnTabletsLinkText() {
		TabletsLinkText.click();
	}

	public void clickOnSoftwareLinkText() {
		SoftwareLinkText.click();
	}

	public void clickOnPhonesAndPDAsLinkText() {
		PhonesAndPDAsLinkText.click();
	}

	public void clickOnCamerasLinkText() {
		CamerasLinkText.click();
	}

	public void clickOnMP3PlayersLinkText() {
		MP3PlayersLinkText.click();
	}

	// Methods on navigate to dekstops.
	public void navigateToMacsDekstops(WebDriver d) {
		handleDropDown(d, DekstopsDropDownList);
		jsClickOnElement(d, MacLinkTextFromDekstops);
	}

	public void navigateToPCDekstops(WebDriver d) {
		handleDropDown(d, DekstopsDropDownList);
		jsClickOnElement(d, PCLinkText);
	}

	public void navigateToShowAllDekstops(WebDriver d) {
		handleDropDown(d, DekstopsDropDownList);
		jsClickOnElement(d, ShowAllDesktopsLinkText);
	}

	// Methods on Navigate to Laptops And NotebooksMac
	public void clickOnMacLinkTextFromLaptopsAndNotebooksMac(WebDriver d) throws InterruptedException {
		handleDropDown(d, LaptopsAndNotebooksDropDown);
		jsClickOnElement(d, MacLinkTextFromLaptopsAndNotebooks);
	}

	public void clickOnMacLinkTextFromLaptopsAndNotebooksWindows(WebDriver d) throws InterruptedException {
		handleDropDown(d, LaptopsAndNotebooksDropDown);
		jsClickOnElement(d, WindowsLinkTextFromLaptopsAndNotebooks);
	}

	public void clickOnShowAllLaptopsAndNotebooksLinkText(WebDriver d) throws InterruptedException {
		handleDropDown(d, LaptopsAndNotebooksDropDown);
		jsClickOnElement(d, ShowAllLaptopsAndNotebooksLinkText);
	}

	// Methods on Navigate to Components
	public void navigateToMiceAndTrackballsComponents(WebDriver d) {
		handleDropDown(d, ComponentsDropDownList);
		jsClickOnElement(d, MiceAndTrackballsLinkText);
	}

	public void navigateToMonitorsComponents(WebDriver d) {
		handleDropDown(d, ComponentsDropDownList);
		jsClickOnElement(d, MonitorsLinkText);
	}

	public void navigateToPrintersComponents(WebDriver d) {
		handleDropDown(d, ComponentsDropDownList);
		jsClickOnElement(d, PrintersLinkText);
	}

	public void navigateToScannersComponents(WebDriver d) {
		handleDropDown(d, ComponentsDropDownList);
		jsClickOnElement(d, ScannersLinkText);
	}

	public void navigateToWebCamerasComponents(WebDriver d) {
		handleDropDown(d, ComponentsDropDownList);
		jsClickOnElement(d, WebCamerasLinkText);
	}

	public void navigateToShowAllComponentsComponents(WebDriver d) {
		handleDropDown(d, ComponentsDropDownList);
		jsClickOnElement(d, ShowAllComponentsLinkText);
	}

	// method on navigate to tablets
	public void navigateToTables() {
		TabletsLinkText.click();
	}

	// method on navigate to software
	public void navigateToSoftware() {
		SoftwareLinkText.click();
	}

	// method on navigate to PhonesAndPDAs
	public void navigateToPhonesAndPDAs() {
		PhonesAndPDAsLinkText.click();
	}

	// method on navigate to Cameras
	public void navigateToCameras() {
		CamerasLinkText.click();
	}

	// method on navigate to mp3 players
	public void navigateToMP3Players() {
		MP3PlayersLinkText.click();
	}
}
