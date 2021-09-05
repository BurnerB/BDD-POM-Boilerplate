package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;


//create the page's object and also to make sure that the same object should not be created again and again. But to use a single object for all the step definition files
public class PageObjectManager {
    private WebDriver driver;
    private ProductListingPage productListingPage;
    private CartPage cartPage;
    private HomePage homePage;
    private CheckoutPage checkoutPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

//    To create an Object of Page Class only if the object is null.
//    To supply the already created object if it is not null
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }


    public ProductListingPage getProductListingPage() {
        return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;
    }


    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public CheckoutPage getCheckoutPage() {
        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }
}