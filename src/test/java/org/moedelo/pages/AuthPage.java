package org.moedelo.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class AuthPage extends PageObject {

    @FindBy(css = "[type=email]")
    private WebElement emailInput;

    @FindBy(css = "[type=password]")
    private WebElement passwordInput;

    @FindBy(css = "button")
    private WebElement submitButton;

    private String authPageUrl = "https://oauth.moedelo.org/Authorize";

    public void enterEmail(String email) {
        typeInto(emailInput, email);
    }

    public void enterPassword(String password) {
        typeInto(passwordInput, password);
    }

    public void submitForm() {
        clickOn(submitButton);
    }

    public void popToTop(String url) {
        Set<String> tabsList = getDriver().getWindowHandles();
        for (String tab : tabsList) {
            if (getDriver().switchTo().window(tab).getCurrentUrl().equals(url)) break;
        }
    }

    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    public String getAuthPageUrl() {
        return authPageUrl;
    }

}
