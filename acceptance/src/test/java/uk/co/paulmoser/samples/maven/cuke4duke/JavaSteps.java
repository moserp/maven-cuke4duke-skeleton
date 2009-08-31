package uk.co.paulmoser.samples.maven.cuke4duke;

import cuke4duke.Given;
import cuke4duke.Then;
import cuke4duke.When;

public class JavaSteps {

    @Given("we setup the scenario")
    public void setup() {
      System.out.println("setup");
    }

    @When("we do something")
    public void weDoSomething() {
    }

    @Then("something happens")
    public void somethingHappens() {
    }

    @Then("so does something else")
    public void somethingElseHappens() {
    }
}
