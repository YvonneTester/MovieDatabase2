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
    @Given("My cursor is in the search bar")
    public void cursor_search_bar() {
        // Zoek het input-element op basis van de ID
        WebElement searchInput = webDriver.findElement(By.cssSelector("input#inner_search_v4"));

// Voer tekst in het zoekveld in
        searchInput.sendKeys("Jouw zoektekst hier");
    }
    @Given("There is a search button")
    public void there_is_a_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I enter a movie name")
    public void i_enter_a_movie_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click the search button")
    public void i_click_the_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After // runs after all tests, we clean up stuff here
    public void CleanUp(){
        //always close your web driver
        webDriver.close();
    }
}