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

    @Step("Click on authorization button")
    public void clicksTheAuthButton() {
        homePage.clickAuthButton();
    }

    @Step("Switch to the tab with opened authorization page")
    public void switchesToOpenedAuthTab() {
        authPage.popToTop(authPage.getAuthPageUrl());
    }

    @Step("Check if we are on the authorization page")
    public void isOnTheAuthPageWhichUrlIs() {
        assertThat(authPage.getPageUrl())
                .isEqualTo(authPage.getAuthPageUrl());
    }

    @Step("Enter the email \"{0}\"")
    public void entersEmail(String email) {
        authPage.enterEmail(email);
    }

    @Step("Enter the password \"{0}\"")
    public void entersPassword(String password) {
        authPage.enterPassword(password);
    }

    @Step("Submit authorization form")
    public void submitsAuthForm() {
        authPage.submitForm();
    }

    @Step("Check if we have authorized in the profile \"{0}\"")
    public void shouldSeeItsProfilePageWithName(String name) {
        assertThat(profilePage.getProfileButtonText()).containsIgnoringCase(name);
    }
}
