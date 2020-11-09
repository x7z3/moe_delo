package org.moedelo.steps;

import net.thucydides.core.annotations.Step;
import org.moedelo.pages.AuthPage;
import org.moedelo.pages.HomePage;
import org.moedelo.pages.ProfilePage;

import static org.assertj.core.api.Assertions.assertThat;

public class WebSiteUser {

    HomePage homePage;
    AuthPage authPage;
    ProfilePage profilePage;

    @Step("Open Home Page")
    public void isOnHomePage() {
        homePage.open();
    }

    @Step("Click on sing in button")
    public void clicksTheAuthButton() {
        homePage.clickAuthButton();
    }

    @Step("Check if it's on the sing in page")
    public void isOnTheAuthPage() {
        assertThat(authPage.getDriver().getCurrentUrl())
                .isEqualTo("https://oauth.moedelo.org/Authorize");
    }

    @Step("Enter an email")
    public void entersEmail(String email) {
        authPage.enterEmail(email);
    }

    @Step("Enter the password")
    public void entersPassword(String password) {
        authPage.enterPassword(password);
    }

    @Step("Submit sing in form")
    public void submitsAuthForm() {
        authPage.submitForm();
    }

    @Step("Check if it is signed in right profile")
    public void shouldSeeItsProfilePageWithName(String name) {
        assertThat(profilePage.getProfileButtonText()).containsIgnoringCase(name);
    }
}
