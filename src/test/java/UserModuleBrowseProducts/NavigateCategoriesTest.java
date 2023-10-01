package UserModuleBrowseProducts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.utility.BaseClass_User;
import com.object.repository.UserHomePage;

public class NavigateCategoriesTest extends BaseClass_User {

	@Test
	public void navigateToHomePage() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
	}

	// Navigate to Dekstop Nabbar Links
	@Test
	public void navigateToDekstopsMac() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToMacsDekstops(d);
		Assert.assertEquals(d.getTitle(), "Mac", "Error: Dekstop Mac page is not display");
		Reporter.log("Dekstop mac page is display.", true);
	}

	@Test
	public void navigateToDekstopsPC() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToPCDekstops(d);
		Assert.assertEquals(d.getTitle(), "PC", "Error: Dekstop PC page is not display");
		Reporter.log("Dekstop PC page is display.", true);
	}

	@Test
	public void navigateToDekstopsShowAllDekstops() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToShowAllDekstops(d);
		Assert.assertEquals(d.getTitle(), "Desktops", "Error: Show all dekstops page is not display");
		Reporter.log("Show all dekstops  page is display.", true);
	}

	// Navigate to Laptops & Notebook Navbar links
	@Test
	public void navigateToLaptopsAndNotebooksMac() throws InterruptedException {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.clickOnMacLinkTextFromLaptopsAndNotebooksMac(d);
		Assert.assertEquals(d.getTitle(), "Mac", "Error: Macs page is not display.");
		Reporter.log("Macs page is display", true);
	}

	@Test
	public void navigateToLaptopsAndNotebooksWindows() throws InterruptedException {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.clickOnMacLinkTextFromLaptopsAndNotebooksWindows(d);
		Assert.assertEquals(d.getTitle(), "Windows", "Error: Windows page is not display");
		Reporter.log("Windows page is display", true);
	}

	@Test
	public void navigateToLaptopsAndNotebooksShowAllLaptopsAndNotebooks() throws InterruptedException {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.clickOnShowAllLaptopsAndNotebooksLinkText(d);
		Assert.assertEquals(d.getTitle(), "Laptops & Notebooks", "Error: Laptops & Notebook page is not display.");
		Reporter.log("Laptops & Notebook page is display", true);
	}

	// Navigate to Components
	@Test
	public void navigateToComponentsMiceAndTrackballs() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToMiceAndTrackballsComponents(d);
		Assert.assertEquals(d.getTitle(), "Mice and Trackballs", "Error: Mice and Trackballs page is not display");
		Reporter.log("Mice and Trackballs page is display.", true);
	}

	@Test
	public void navigateToComponentsMonitors() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToMonitorsComponents(d);
		Assert.assertEquals(d.getTitle(), "Monitors", "Error: Monitors page is not display");
		Reporter.log("Monitors page is display.", true);
	}

	@Test
	public void navigateToComponentsPrinters() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToPrintersComponents(d);
		Assert.assertEquals(d.getTitle(), "Printers", "Error: Printers page is not display");
		Reporter.log("Printers page is display.", true);
	}

	@Test
	public void navigateToComponentsScanners() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToScannersComponents(d);
		Assert.assertEquals(d.getTitle(), "Scanners", "Error: Scanners page is not display");
		Reporter.log("Scanners page is display.", true);
	}

	@Test
	public void navigateToComponentsWebCameras() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToWebCamerasComponents(d);
		Assert.assertEquals(d.getTitle(), "Web Cameras", "Error: Web Cameras page is not display");
		Reporter.log("Web Cameras page is display.", true);
	}

	@Test
	public void navigateToComponentsShowAllComponents() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToShowAllComponentsComponents(d);
		Assert.assertEquals(d.getTitle(), "Components", "Error: Show all components page is not display");
		Reporter.log("Show all components page is display.", true);
	}

	// Navigate to Tablets
	@Test
	public void navigateToTablets() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToTables();
		Assert.assertEquals(d.getTitle(), "Tablets", "Error: Tablets page is not display");
		Reporter.log("Tablets page is display.", true);
	}

	// Navigate to Software
	@Test
	public void navigateToSoftware() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToSoftware();
		Assert.assertEquals(d.getTitle(), "Software", "Error: Software page is not display");
		Reporter.log("Software page is display.", true);
	}

	// Navigate to Phones & PDAs
	@Test
	public void navigateToPhonesAndPDAs() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToPhonesAndPDAs();
		Assert.assertEquals(d.getTitle(), "Phones & PDAs", "Error: Phones & PDAs page is not display");
		Reporter.log("Phones & PDAs page is display.", true);
	}

	// Navigate to Cameras
	@Test
	public void navigateToCameras() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToCameras();
		Assert.assertEquals(d.getTitle(), "Cameras", "Error: Cameras page is not display");
		Reporter.log("Cameras page is display.", true);
	}

	// Navigate to MP3 Players
	@Test
	public void navigateToMP3Players() {
		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");
		uhp.navigateToMP3Players();
		Assert.assertEquals(d.getTitle(), "MP3 Players", "Error: MP3 Players page is not display");
		Reporter.log("MP3 Players page is display.", true);
	}

}
