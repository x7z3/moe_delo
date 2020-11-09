package org.moedelo.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.moedelo.org/")
public class HomePage extends PageObject {

    @FindBy(id="login_auth")
    private WebElement authButton;

    public void clickAuthButton() {
        clickOn(authButton);
    }
}
