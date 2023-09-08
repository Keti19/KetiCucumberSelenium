package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExperiencePage extends BasePage{
    @FindBy(xpath = "//*[text()='Add An Experience']")
    public WebElement header;

    @FindBy(xpath = "//*[contains(@placeholder, 'Job Title')]")
    public WebElement jobTitle;

    @FindBy(xpath = "//*[contains(@placeholder, 'Company')]")
    public WebElement company;

    @FindBy(xpath = "//*[contains(@placeholder, 'Location')]")
    public WebElement location;

    @FindBy(xpath = "//*[contains(text(), 'From Date')]/../input")
    public WebElement fromDate;

    @FindBy(xpath = "//*[contains(text(), 'To Date')]/../input")
    public WebElement toDate;

    @FindBy(xpath = "//*[contains(@placeholder, 'Job Description')]")
    public WebElement jobDescription;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;
}
