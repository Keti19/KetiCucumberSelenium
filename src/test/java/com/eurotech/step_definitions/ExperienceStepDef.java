package com.eurotech.step_definitions;

import com.eurotech.pages.ExperiencePage;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Map;

public class ExperienceStepDef {
    ExperiencePage experiencePage = new ExperiencePage();
    @Then("The user should land on Add An Experience page")
    public void theUserShouldLandOnAddAnExperiencePage() {
        String expectedHeader = "Add An Experience";
        String actualHeader = experiencePage.header.getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @And("The user fills {string} field as {string}")
    public void theUserFillsFieldAs(String experienceTextField, String experienceTextFieldValue) {
        Driver.get().findElement(By.xpath("//*[contains(@placeholder, '" + experienceTextField + "')]")).sendKeys(experienceTextFieldValue);
    }


    @And("The user picks {string} as {string}")
    public void theUserPicksAs(String experienceDateField, String experienceDateFieldValue) {
        Driver.get().findElement(By.xpath("//h4[text()='" + experienceDateField + "']/../input")).sendKeys(experienceDateFieldValue);
    }

    @And("The user submits the experience form")
    public void theUserSubmitsTheExperienceForm() {
        experiencePage.submitButton.click();
    }

    @When("The user fills the experience form and submits")
    public void theUserFillsTheExperienceFormAndSubmits(Map<String, String> experienceForm) {
        experiencePage.jobTitle.sendKeys(experienceForm.get("Job Title"));
        experiencePage.company.sendKeys(experienceForm.get("Company"));
        experiencePage.location.sendKeys(experienceForm.get("Location"));
        experiencePage.fromDate.sendKeys(experienceForm.get("From Date"));
        experiencePage.toDate.sendKeys(experienceForm.get("To Date"));
        experiencePage.jobDescription.sendKeys(experienceForm.get("Job Description"));

        experiencePage.submitButton.click();
    }
}
