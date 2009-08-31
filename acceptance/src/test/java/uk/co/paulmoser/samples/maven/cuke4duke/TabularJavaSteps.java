package uk.co.paulmoser.samples.maven.cuke4duke;

import cuke4duke.Given;
import cuke4duke.Then;
import cuke4duke.When;
import cuke4duke.Table;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.List;

public class TabularJavaSteps {

    private Table tabularData;

    @Given("we have tabular data")
    public void setupTabularData(Table table) {
      this.tabularData = table; // is it safe to store a reference to tha passed in table?
    }

    @Then("the values of row (\\d+), column (\\d+) should be '(.*)'")
    public void checkRowValues(int row, int column, String expectedValue) {
      // Note if we use the raw table we don't have to adjust rows/columns for zero based indexes as the
      // row and column titles in the input count as the zero row/column
      List<String> wantedRow = tabularData.raw().get(row);
      assertThat(wantedRow.get(column), is(expectedValue));
    }
}
