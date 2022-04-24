package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // В результате предыдущих операций мы получили ноль в a и ноль в b и пытаемся делить на ноль: ": / by zero"


        calc.println.accept(c);
    }

}

