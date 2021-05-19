package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PageBase;
import pages.ProductPage;

public class BasketPageTests extends TestBase{
    HomePage homePage;
    ProductPage productPage;
    PageBase pageBase;


    @BeforeMethod
    public void pageInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        productPage = PageFactory.initElements(driver, ProductPage.class);
        pageBase = PageFactory.initElements(driver, PageBase.class);

    }

    @Test
    public void userCanGoToTheProductPageThroughTheBasket() throws InterruptedException {
        homePage.selectCategory();
        homePage.selectProduct();
        homePage.clickAddToBasket();
        homePage.clickViewBasket();
        homePage.clickNameOfTheProduct();
        Thread.sleep(3000);
        Assert.assertTrue(productPage.isItProductPage());


    }


    @Test
    public void goToPageProceedToCheckoutFromBasket () throws InterruptedException {
        homePage.selectCategory();
        homePage.selectProduct();
        homePage.clickAddToBasket();
        homePage.clickViewBasket();
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        Thread.sleep(3000);
        homePage.clickProceedToCheckout();
        Thread.sleep(3000);
    }

    @Test
     public void changeTheQuantityOfItemsInTheBasket() throws InterruptedException {
        homePage.selectCategory();
        homePage.selectProduct();
        homePage.clickAddToBasket();
        homePage.clickViewBasket();
        homePage.ChangeAmountOfItem();
        homePage.inputText("2");
        homePage.clickUpdate();
        Thread.sleep(3000);
        Assert.assertTrue(productPage.isItProductPage());

    }
}
