package org.example.tests;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySteps {

    WebDriver webDriver = new FirefoxDriver();

    @Given("I am on the movie database website")
    public void on_the_website() {
        // Write code here that turns the phrase above into concrete actions
        webDriver.get("https://www.themoviedb.org/");
    }
    @Given("I search for Titanic")
    public void search_titanic() {
        // Zoek het input-element op basis van de ID
        WebElement searchInput = webDriver.findElement(By.cssSelector("input#inner_search_v4"));

// Voer tekst in het zoekveld in
        searchInput.sendKeys("Titanic");
    }
    @When("I click the search button")
    public void i_click_search_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement searchInput2 = webDriver.findElement(By.cssSelector("input[type='submit'][value='Search']"));
        searchInput2.click();
    }

    @Then("The first search result should be Titanic")
    public void first_search_should_be_titanic() {
        // Write code here that turns the phrase above into concrete actions
        WebElement firstSearch = webDriver.findElement(By.xpath("//h2[contains(text(),'Titanic')]"));
    }

}