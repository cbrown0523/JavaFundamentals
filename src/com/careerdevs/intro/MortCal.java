package com.careerdevs.intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortCal {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you want to borrow ? : ");
        int amount = scanner.nextInt();
        String resultAmount = currency.format(amount);
        System.out.println("Principal: " + resultAmount);
        System.out.println("Amount of annual interest");
        double interest = scanner.nextDouble();
        NumberFormat percent = NumberFormat.getPercentInstance();
        //mosh 440 line 9
        String resultInterest = percent.format(interest);
        System.out.println("Annual interest will be: " + resultInterest);
        System.out.println("How many years to hold the loan? :");
        byte numOfYears = scanner.nextByte();
        System.out.println("You will hold the loan for " + numOfYears + "years");
        int mortgage = (amount * (int)interest) * (12 * numOfYears);
        System.out.println("Your mortgage will be: " + mortgage);
    }
}

