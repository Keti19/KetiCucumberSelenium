package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends BasePage{


    @FindBy(css = "#post-form-btn")
    public WebElement submitBtn;

    @FindBy(id = "post-form-title")
    public WebElement titleInput;

    @FindBy(id = "post-form-textarea")
    public WebElement postInput;

    @FindBy(xpath = "//*[contains(text(),'Created')]")
    public WebElement postCreatedMessage;



    public void postComment(){

       String  title = "POM";
       String  post = "According to the Page Object Model, you should keep the tests and element locators separately. " +
               "This will keep the code clean and easy to understand and maintain. ";

        titleInput.sendKeys(title);
        postInput.sendKeys(post);
        submitBtn.click();
    }

    public void post2(String title, String post){
        titleInput.sendKeys(title);
        postInput.sendKeys(post);
        submitBtn.click();
    }

}
