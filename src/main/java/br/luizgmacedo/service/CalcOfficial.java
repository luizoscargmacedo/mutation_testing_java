package br.luizgmacedo.service;

import java.util.Date;
import java.util.Scanner;

public class CalcOfficial {
        public static void main(String[] args){
            Scanner ent = new Scanner(System.in);
            int year;
            int value1;

            System.out.println("Leap Year verification, type and check which year has 366 days: ");
            year = ent.nextInt();

            // Validation; only if it is also evenly divisible by 400
            if(year % 400 == 0){
                System.out.println(" It is a Leap Year!");
            }
            // Validation; Any year that is evenly divisible by 4
            else if((year % 4 == 0) && (year % 100 != 0)){
                System.out.println(" Successfully, It is a Leap Year!");
            }
            else {
                System.out.println("It is not a Leap Year!");
            }
        }
}
