package ro.sci.task1;

import ro.sci.task1.calculator.Calculator;

import ro.sci.task1.dayofmonth.Dom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");

        Calculator calculator = new Calculator();
        calculator.calc();

        System.out.println();

        Dom dom = new Dom();
        dom.numardezile();

    }
}




