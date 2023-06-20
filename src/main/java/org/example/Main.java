package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        int pow = calc.pow.apply(8);
        int abs = calc.abs.apply(2);
        int multiply = calc.multiply.apply(5, 4);

        calc.print.accept(pow);

        System.out.println("Проверка на целое число: " + calc.isPositive.test(5));

    }

    private static class get extends Calculator {
    }
}