package org.moedelo.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.moedelo.steps.WebSiteUser;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SingInTheUserProfile {

    @Managed
    WebDriver driver;

    @Steps
    WebSiteUser user;

    @Test
    public void shouldBeAbleToLoginTheProfilePage () {

        user.isOnHomePage();

        user.clicksTheAuthButton();

        user.switchesToOpenedAuthTab();

        user.isOnTheAuthPageWhichUrlIs();

        user.entersEmail("test_acc_ip@testemail.org");

        user.entersPassword("890890");

        user.submitsAuthForm();

        user.shouldSeeItsProfilePageWithName("ИП Бородач Александр Радионович");

    }

}

