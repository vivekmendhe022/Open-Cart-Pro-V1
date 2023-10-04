package UserModule.ProductDetailsPage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.utility.BaseClass_User;
import com.object.repository.UserHomePage;
import com.object.repository.products.ProductDetailPage;
import com.object.repository.products.SearchProductPage;

public class ProductDetailPageTest extends BaseClass_User {

	@Test
	public void productDetailPageTest() {

		String PRODUCTNAME = "Apple";

		UserHomePage uhp = new UserHomePage(d);
		uhp.clickOnHomeLookIUpIcon();
		Assert.assertEquals(d.getTitle(), "Your Store", "Error: Home page is not display.");

		// Search the product
		uhp.searchProduct(PRODUCTNAME);
		Assert.assertEquals(d.getTitle(), "Search - " + PRODUCTNAME, "Error: Search product page is not display.");
		Reporter.log("Search product page is display", true);

		// Click on search product
		SearchProductPage spp = new SearchProductPage(d);
		spp.clickOnProductTextLink(d);
		Assert.assertEquals(d.getTitle(), "Apple Cinema 30", "Error: Apple Cinema 30 page is not display.");
		Reporter.log("Apple Cinema 30 page is display.", true);

		// Validate Product Details Page
		ProductDetailPage pdp = new ProductDetailPage(d);
		String productHeaderText = pdp.getProductHeaderText();
		Assert.assertTrue(productHeaderText.contains("Apple Cinema 30"));
		Reporter.log("Apple Cinema 30 Title display", true);
	}
}
