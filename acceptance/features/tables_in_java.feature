Feature: demonstrating tables with Java steps

  Scenario: demonstrating tables
    Given we have tabular data:
      |       | column 1 | column 2 |
      | row 1 | r1, c1   | r1, c2   |
      | row 2 | r2, c1   | r2, c2   |
    Then the values of row 1, column 1 should be 'r1, c1' 
    Then the values of row 1, column 2 should be 'r1, c2' 
    Then the values of row 2, column 1 should be 'r2, c1' 
    Then the values of row 2, column 2 should be 'r2, c2' 
