package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDef {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {

        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expectedList, actualList);

    }

    @When("The user clicks {string}")
    public void theUserClicks(String menuName) {
        dashboardPage.navigateMenu(menuName);
    }


    @Then("The user should see the experience added message")
    public void theUserShouldSeeTheExperienceAddedMessage() {
        Assert.assertTrue(dashboardPage.experienceAddedMessage.isDisplayed());
}}
