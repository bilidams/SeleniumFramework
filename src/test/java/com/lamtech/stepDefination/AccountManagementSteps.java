package com.lamtech.stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementSteps {

    WebDriver driver;
    @Given("^User on create an account page$")
    public void userOnCreateAnAccountPage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // open mercury website
        driver.get("https://demo1-m2.mage.direct/");



        // click on register link
        //driver.findElement(By.linkText("Create New Customer Account")).click();

    }

    @When("^user enters first name$")
    public void userEntersFirstName() {
    }

    @And("^user enters last name$")
    public void userEntersLastName() {
    }

    @And("^user enters an email$")
    public void userEntersAnEmail() {
    }

    @And("^user enter password$")
    public void userEnterPassword() {
    }

    @And("^user enetr confirm password$")
    public void userEnetrConfirmPassword() {
    }

    @Then("^user create account successful$")
    public void userCreateAccountSuccessful() {
    }
}
