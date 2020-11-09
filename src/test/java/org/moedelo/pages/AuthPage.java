package org.moedelo.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthPage extends PageObject {

    @FindBy(css = "[type=email]")
    private WebElement emailInput;

    @FindBy(css = "[type=password]")
    private WebElement passwordInput;

    @FindBy(css = "button")
    private WebElement submitButton;

    public void enterEmail(String email) {
        typeInto(emailInput, email);
    }

    public void enterPassword(String password) {
        typeInto(passwordInput, password);
    }

    public void submitForm() {
        clickOn(submitButton);
    }
}
