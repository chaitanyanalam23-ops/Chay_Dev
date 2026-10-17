package com.lambda.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class RealWorldLambdaPipeline {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 95000),
                new Employee("Bob", "Sales", 60000),
                new Employee("Charlie", "Engineering", 120000),
                new Employee("Diana", "Engineering", 75000)
        );

        // Goal: Get names of Engineering employees earning over $80,000, sorted by salary descending
        List<String> topEngineers = employees.stream()
                // Predicate: keep only Engineering employees earning over 80k
                .filter(emp -> emp.department.equals("Engineering") && emp.salary > 80000)
                // Comparator: sort highest salary first
                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                // Function: extract just the employee's name
                .map(emp -> emp.name)
                .collect(Collectors.toList());

        // Consumer: print the final list
        topEngineers.forEach(name -> System.out.println("Top Engineer: " + name));
        // Output:
        // Top Engineer: Charlie
        // Top Engineer: Alice
    }
}