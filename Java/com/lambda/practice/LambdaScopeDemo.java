package com.lambda.practice;

import java.util.function.Consumer;

public class LambdaScopeDemo {

  private int instanceCounter = 0; // Stored on the heap

  public void testScope() {
    String localPrefix = "Result: "; // Effectively final (never reassigned)

    Consumer<Integer> processor = number -> {
      // Allowed: Modifying instance variable
      this.instanceCounter++;

      // Allowed: Reading effectively final local variable
      System.out.println(localPrefix + (number + this.instanceCounter));

      // COMPILE ERROR if uncommented: Local variable must be effectively final
      //localPrefix = "New Prefix: ";
    };

    processor.accept(10); // Output: Result: 11
  }

  public static void main(String[] args) {
    new LambdaScopeDemo().testScope();
  }
}
