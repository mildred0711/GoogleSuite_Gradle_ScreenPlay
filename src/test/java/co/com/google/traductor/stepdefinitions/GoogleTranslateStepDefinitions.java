package co.com.google.traductor.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.google.traductor.tasks.Goto;
import co.com.google.traductor.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
	    susan.wasAbleTo(OpenTheBrowser.on(),
	    		        Goto.theApp());
	}

	@When("^she translate the word cheese from English to Spanish$")
	public void sheTranslateTheWordCheeseFromEnglishToSpanish() throws Exception {
	    
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
	    
	}
}