package com.lambda.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        // Wrapping a checked IOException inside a standard Consumer
        Consumer<Path> fileReader = path -> {
            try {
                String content = Files.readString(path);
                System.out.println(content);
            } catch (IOException e) {
                throw new RuntimeException("Failed to read file: " + path, e);
            }
        };
    }
}