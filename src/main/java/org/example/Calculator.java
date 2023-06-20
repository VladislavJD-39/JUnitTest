package org.example;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
   public BinaryOperator<Integer> minus = (x, y) -> x - y;
   public BinaryOperator<Integer> multiply = (x, y) -> x * y;
   public BinaryOperator<Integer> devide = (x, y) -> x / y;
   public UnaryOperator<Integer> pow = x -> x * x;
  public   UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
   public Predicate<Integer> isPositive = x -> x > 0;
    /*
     * При реализации деления через данную лямбду BinaryOperator<Integer> devide = (x, y) -> x / y;
     * Java не знает что делать с нулем.
     * Решение:
     * Проверить Y на 0, если равен, то делить нельзя.
     * Если Y > 0, то  произвести деление.
     * */

 //  public BinaryOperator<Integer> devide = (x, y) -> {
 //      if (y != 0) {
 //         return x / y;
 //     } else System.out.println("На ноль делить нельзя! Y = " + y);
 //       return y;
 //   };
    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    Consumer<Integer> print = x -> System.out.println("Результат расчета калькулятора: " + x);
}
