package org.moedelo.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageObject {

    @FindBy(css = "button.style-m__button--square___15sEv")
    private WebElement profileButton;

    public String getProfileButtonText() {
        return profileButton.getText();
    }
}
