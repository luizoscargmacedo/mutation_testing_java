package br.luizgmacedo.service;

import org.junit.Assert;
import org.junit.Test;

public class MutantValidation {
    @Test
    public void DivisibleBy4and100Testing () {
        // The Scenario
        Calc calc = new Calc();
        calc.setYear3(2004);

            /* The Action
            if year3 is divisible by 4 == 0
            and divisible by 100 != 0 P
            Print: " It is a Leap Year!" */

        // The Validation
        Assert.assertEquals(true, calc.getResult3());
    }

    @Test
    public void DivisibleBy400Test () {
        // The Scenario
        Calc calc = new Calc();
        calc.setYear2(2000);

        /* The Action
        if year2 is divisible by 400 == 0
        Print: " It is a Leap Year!" */

        // The Validation
        Assert.assertEquals(true, calc.getResult());
    }

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
