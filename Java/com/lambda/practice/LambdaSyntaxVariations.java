package com.lambda.practice;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaSyntaxVariations {

  public static void main(String[] args) {
    Runnable noParams = () -> System.out.println("Hello from a Lambda");
    noParams.run();

    Consumer<String> oneParam = message -> System.out.println(message);
    oneParam.accept("Single Params need no paranthesis.");

    BinaryOperator<Integer> add = (a, b) -> a + b;
    System.out.println("Sum: " + add.apply(23, 8));

    BinaryOperator<Double> multiply = (Double a, Double b) -> a * b;
    System.out.println("Multiply: " + multiply.apply(2.5, 3.5));

    Function<Integer, String> checkNumber = num -> {
      if (num > 0) {
        return "Positive";
      } else if (num < 0) {
        return "Negative";
      }
      return "Zero";
    };
    System.out.println(checkNumber.apply(-5));
  }
}
