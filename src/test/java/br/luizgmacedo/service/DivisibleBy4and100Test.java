package br.luizgmacedo.service;

import org.junit.Assert;
import org.junit.Test;

public class DivisibleBy4and100Test {
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
}
