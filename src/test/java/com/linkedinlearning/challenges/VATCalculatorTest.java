package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VATCalculatorTest {
  
  @Test
  void firstTest() {
    
    var vatCalculator = new VATCalculator(0.19, "€");
    var price = 100.00;
    var expected = """
            Netto: 100.00€
            VAT (0.19): 19.00€
            Total: 119.00€""";
    var actual = vatCalculator.outputTotal(price);
    Assertions.assertEquals(expected, actual);
  }
}
