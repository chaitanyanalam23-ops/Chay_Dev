package com.lambda.practice;

import java.time.LocalDate;
import java.util.function.*;

public class BuiltInInterfacesDemo {

  static void main(String[] args) {
    Predicate<String> isNotEmpty = str -> !str.isEmpty();
    System.out.println(isNotEmpty.test("Hello"));

    Function<String, Integer> strLength = str -> str.length();
    System.out.println(strLength.apply("Chaitanya"));

    Consumer<String> logger = msg -> System.out.println("[LOG]: " + msg);
    logger.accept("This is Log message");

    Supplier<LocalDate> todaySupplier = () -> LocalDate.now();
    System.out.println(todaySupplier.get());

    BiFunction<String, Integer, String> formatItem = (item, price) ->
      item + " cost: ₹" + price;
    System.out.println(formatItem.apply("pen", 10));
  }
}
