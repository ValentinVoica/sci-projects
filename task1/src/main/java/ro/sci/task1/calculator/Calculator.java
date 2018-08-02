package ro.sci.task1.calculator;

import java.util.Scanner;

public class Calculator {

    public void calc() {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard //

        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        double result;

        switch (operator) {

            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            //if the operator doesn't match any case constant (+, -, *, /) then the below output will be shown.//

            default:
                System.out.printf("Error! operator is not correct");
                return;

        }
        System.out.printf("%.1f %c %.1f = %.2f", first, operator, second, result);

        //%.1f -the result will be with 1 decimal precision. %.2f -result will be with 2 decimal precision//
        //%c - data type - character//
    }
}


