package com.eurotech.step_definitions;


import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTest.xlsx","Test Data");
    List<Map<String, String>> dataList = excelUtil.getDataList();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        loginPage.loginAsTeacher();


    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains("Welcome"));

    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {

        loginPage.loginAsStudent();
    }
    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {

        loginPage.loginAsDeveloper();
    }


    @When("The user logs in using {string} and {string} credentials")
    public void theUserLogsInUsingAndCredentials(String username, String password) {

        loginPage.login(username, password);

    }

    @Then("The welcome message contains {string}")
    public void theWelcomeMessageContains(String expectedMessage) {
        System.out.println("expected Message "+expectedMessage);
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(expectedMessage));
    }

    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userCredentials) {
        String username = userCredentials.get("username");
        String password = userCredentials.get("password");
        loginPage.login(username, password);

        String expectedMessage = userCredentials.get("message");
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(expectedMessage));
    }

    @Then("The user should not be able to login")
    public void theUserShouldNotBeAbleToLogin() {
        Assert.assertTrue(loginPage.warningMessage1.isDisplayed());

    }

    @Then("Verify if the user can see the message {string}")
    public void verifyIfTheUserCanSeeTheMessage(String expectedMessage) {
        Assert.assertTrue(loginPage.warningMessage1.getText().contains(expectedMessage));
    }

    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {
//        String actualMessage= loginPage.getWarningMessage(expectedMessage);
//        Assert.assertEquals(expectedMessage,actualMessage);
        String validationMessage = loginPage.passwordInput.getAttribute("validationMessage");
        System.out.println("validationMessage = " + validationMessage);

    }

    @When("The user enters {string} and row number {int}")
    public void the_user_enters_and_row_number(String sheetName, Integer rowNumber) {


        System.out.println("dataList.get(0) Username = " + dataList.get(0).get("Username"));
        System.out.println("Gulcan's Password  " + dataList.get(2).get("Password"));
        System.out.println("Seyit's Company  = " + dataList.get(4).get("Company"));
        System.out.println("dataList = " + dataList);

        loginPage.login(dataList.get(rowNumber).get("Username"),dataList.get(rowNumber).get("Password"));

    }
    @Then("The welcome message contains in excel {int}")
    public void the_welcome_message_contains_in_excel(Integer rowNumberForName) {

        String actualMessage = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualMessage.contains(dataList.get(rowNumberForName).get("Name")));
    }
    @Then("The user verify that company name {int}")
    public void the_user_verify_that_company_name(Integer rowNumberForCompany) {

        //1 way
        String actualCompanyName= dashboardPage.getCompanyName(dataList.get(rowNumberForCompany).get("Company"));
        //   Assert.assertEquals(dataList.get(rowNumberForCompany).get("Company"),actualCompanyName);

        //2 way
        //  String actualCompanyName= dashboardPage.companyName.getText();
        Assert.assertEquals(dataList.get(rowNumberForCompany).get("Company"),actualCompanyName);


        excelUtil.setCellData(dashboardPage.welcomeMessage.getText(),"Date",rowNumberForCompany);

    }
    @Then("The date of the user experience is added to excel file with {int}")
    public void the_date_of_the_user_experience_is_added_to_excel_file_with(Integer rowNumberForDate) {

        excelUtil.setCellData(dashboardPage.experienceDate.getText(),"Date",rowNumberForDate);

    }

}

