package br.luizgmacedo.service;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearNegativeScenarioTest {
    @Test
    public void LeapYearNegativeScenarioTesting (){
        // The Scenario
        Calc calc = new Calc();
        calc.setYear3(2009);

        /* The Action
        if year3 is not approved by "Divisible Tests scenarios"
        then  "It is not a Leap Year!" */

        // The Validation
        Assert.assertEquals(false, calc.getResult3());
    }
}
