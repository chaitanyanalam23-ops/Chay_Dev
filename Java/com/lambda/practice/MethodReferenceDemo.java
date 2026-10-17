package com.lambda.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceDemo {

  static void main(String[] args) {
    Function<String, Integer> parser = Integer::parseInt;
    System.out.println(parser.apply("23") + 8);

    List<String> names = Arrays.asList("Amma", "Babu", "Chaitu");
    names.stream().map(String::toUpperCase).forEach(System.out::println);
  }
}
