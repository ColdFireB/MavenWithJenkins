package pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
	private static CartPage cartpage;
	private static CheckoutPage checkoutpage;
	private static ProductPage productpage;
	private static StorePage storepage;

	public static StorePage getStorePage(WebDriver driver) {
		return storepage == null ? new StorePage(driver) : storepage;
	}

	public static CartPage getCartPage(WebDriver driver) {
		return cartpage == null ? new CartPage(driver) : cartpage;
	}

	public static ProductPage getProductPage(WebDriver driver) {
		return productpage == null ? new ProductPage(driver) : productpage;
	}

	public static CheckoutPage getCheckOutPage(WebDriver driver) {
		return checkoutpage == null ? new CheckoutPage(driver) : checkoutpage;
	}

}
