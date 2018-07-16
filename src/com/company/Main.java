package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }
        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i == 0){
            return false;
        }else if(i == 1) {
            return true;
        }else {
            return false;
        }
    }

    private double getArgument() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }
}
