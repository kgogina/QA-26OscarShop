package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageBase{
    public HomePage (WebDriver driver){
        super(driver);
    }
    @FindBy(className = "dropdown-submenu")
    WebElement submenuBooks;

    @FindBy(className = "product_pod")
    List<WebElement> productList;

    @FindBy(className = "add-to-basket")
    WebElement addToBasket;
    
    @FindBy(className ="btn-group")
    WebElement viewBasket;

    @FindBy (className = "thumbnail")
    WebElement clickOnProductPhoto;

    @FindBy (className = "btn-lg")
    WebElement clickProceedToCheckout;

    @FindBy (className = "form-0-quantity")
    WebElement clickChangeAmountOfItem;


    @FindBy (className = "btn btn-default")
    WebElement clickUpdate;


    public void selectCategory() {
        submenuBooks.click();
    }

    public void selectProduct() {
        productList.get(0).click();
    }

    public void clickAddToBasket() {
        addToBasket.click();

    }

    public void clickViewBasket() {
        viewBasket.click();
    }

    public void clickNameOfTheProduct() {
        clickOnProductPhoto.click();
    }

    public void ChangeAmountOfItem() {
        clickChangeAmountOfItem.click();
    }

    public void clickUpdate() {
        clickUpdate.click();
    }

    public void clickProceedToCheckout() {
        clickProceedToCheckout.click();
    }

    public void inputText(String text){
        clickChangeAmountOfItem.click();
        clickChangeAmountOfItem.clear();
        clickChangeAmountOfItem.sendKeys(text);
    }
}
