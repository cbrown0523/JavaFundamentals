package com.careerdevs.intro;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = scan.nextInt();
        if (num % 5 == 0) {
            System.out.print("Fizz");
        } else if (num % 3 == 0) {
            System.out.print("Buzz");
        }
    }
}
