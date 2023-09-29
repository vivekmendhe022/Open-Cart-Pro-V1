package com.generic.utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.object.repository.HomePage;
import com.object.repository.registeraccount.LogoutPage;

public class BaseClass_User {

	public PropertyFileUtility putil = new PropertyFileUtility();
	public JavaUtility jutil=new JavaUtility();
	public ExcelFileUtility eutil=new ExcelFileUtility();
	public WebDriver d = null;

	@BeforeSuite
	public void BSConfig() {
		System.out.println(" ***** Database Connected ***** ");
	}

	@BeforeClass
	public void BCConfig() throws IOException {

		String BROWSER = putil.readDataFromPropertyFile("browser");
		String URL = putil.readDataFromPropertyFile("url");

		switch (BROWSER) {
		case "chrome":
			d = new ChromeDriver();
			System.out.println(BROWSER + " ***** Browser Launch ***** ");
			break;
		case "firefox":
			d = new FirefoxDriver();
			System.out.println(BROWSER + " ***** Browser Launch ***** ");
			break;
		case "edge":
			d = new EdgeDriver();
			System.out.println(BROWSER + " ***** Browser Launch ***** ");
			break;
		default:
			System.out.println(" ***** Invalid Browser Name ***** ");
			break;
		}

		d.manage().window().maximize();
		d.get(URL);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@BeforeMethod
	public void BMConfig() {
		// Login to an application
	}

	@AfterMethod
	public void AMConfig() {
		LogoutPage lp=new LogoutPage(d);
		lp.clickOnLogoutLinkText();
		
	}

	@AfterClass
	public void ACConfig() {
		// Quite the browser or terminate the execution.
		d.quit();
	}

	@AfterSuite
	public void ASConfig() {
		System.out.println(" ***** Database Disconnected ***** ");

	}
}
