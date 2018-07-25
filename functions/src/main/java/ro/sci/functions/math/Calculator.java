package ro.sci.functions.math;


public class Calculator {

    public int aduna(int x, int y) {
        return x + y;
        //System.out.println("ijrifj"); - tot ce este dupa return nu va fi compilat deaia nu poti
        //da afisare dupa return;

    }

    //vrem sa facem sirul lui Fibonacci;
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
