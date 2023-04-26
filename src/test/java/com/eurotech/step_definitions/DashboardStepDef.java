package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDef {
DashboardPage dashboardPage = new DashboardPage();
    @Then("The user should be able see following menu")
    public void the_user_should_be_able_see_following_menu(List<String>expectedList) {
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expectedList, actualList);



    }

}
