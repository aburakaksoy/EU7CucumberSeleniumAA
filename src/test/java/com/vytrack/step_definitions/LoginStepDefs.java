package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
        //Login method has click inside so we dont need to add it
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("--", "Dashboard", actualTitle);

    }

    @When("the user enters the sales menager information")
    public void the_user_enters_the_sales_driver_information() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
        //Login method has click inside so we dont need to add it

    }

    @When("the user enters the store manager information")
    public void theUserEntersTheStoreManagerInformation() {
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
        //Login method has click inside so we dont need to add it
    }


    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {

        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);

        BrowserUtils.waitFor(2);

        LoginPage loginPage = new LoginPage();
        if (userType.toLowerCase().contains("sales")) {
            loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        } else if (userType.toLowerCase().contains("store")) {
            loginPage.login(ConfigurationReader.get("store_manager_username"), ConfigurationReader.get("store_manager_password"));
        } else if (userType.toLowerCase().contains("driver")) {
            loginPage.login(ConfigurationReader.get("driver_username"), ConfigurationReader.get("driver_password"));
        }else{
            System.out.println("invalid usertype");
        }


    }
}
