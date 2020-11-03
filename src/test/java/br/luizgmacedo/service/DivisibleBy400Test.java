package br.luizgmacedo.service;

import org.junit.Assert;
import org.junit.Test;

public class DivisibleBy400Test {
        @Test
        public void DivisibleBy400Testing () {
            // The Scenario
            Calc calc = new Calc();
            calc.setYear2(2000);

        /* The Action
        if year2 is divisible by 400 == 0
        Print: " It is a Leap Year!" */

            // The Validation
            Assert.assertEquals(true, calc.getResult());
        }
}

