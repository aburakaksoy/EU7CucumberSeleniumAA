package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }



    //driver.findElement(By.id("prependedInput"));
    @FindBy(id="prependedInput")
    public WebElement usernameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    @FindBy(id="_submit")
    public WebElement loginBtn;

    @FindAll({
        @FindBy(id="prependedInput"), //if one of them is correct find it
        @FindBy(name="_username")
    })
    public WebElement UsserNme;

    @FindBys({
            @FindBy(id="prependedInput"), //if both of locators true;
            @FindBy(name="_username")
    })
    public WebElement getUsernameInput;


    @FindBy(css=".btn.btn-primary")
    public List<WebElement> buttons;         //if more than one(for example we have 6 buttons)

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsStoreManager(){
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);                                                      //most shortest way
        loginBtn.click();
    }

    public void loginAsDriver(){
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username);                                                      //most shortest way
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsSalesManager(){
        usernameInput.sendKeys(ConfigurationReader.get("salesmanager_username"));
        passwordInput.sendKeys(ConfigurationReader.get("salesmanager_password"));
        loginBtn.click();
    }
}
