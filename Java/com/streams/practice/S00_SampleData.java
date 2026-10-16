package com.streams.practice;

import java.util.*;

// Sample data preparation class for stream practice exercises
public class S00_SampleData {

  public record Employee(
    int id,
    String name,
    String department,
    double salary,
    int age,
    boolean active,
    List<String> skills
  ) {}

  public static List<Employee> getEmployees() {
    return List.of(
      new Employee(
        101,
        "Aarav",
        "Engineering",
        95000,
        28,
        true,
        List.of("Java", "Spring Boot", "MySQL")
      ),
      new Employee(
        102,
        "Diya",
        "Engineering",
        120000,
        32,
        true,
        List.of("Java", "Kafka", "Docker", "AWS")
      ),
      new Employee(
        103,
        "Rohan",
        "Sales",
        65000,
        26,
        true,
        List.of("CRM", "Negotiation")
      ),
      new Employee(
        104,
        "Sneha",
        "Engineering",
        120000,
        30,
        true,
        List.of("Python", "Docker", "Kubernetes")
      ),
      new Employee(
        105,
        "Vikram",
        "HR",
        58000,
        29,
        false,
        List.of("Recruiting", "Onboarding")
      ),
      new Employee(
        106,
        "Meera",
        "Finance",
        88000,
        35,
        true,
        List.of("Excel", "SAP", "Risk Analysis")
      ),
      new Employee(
        107,
        "Karthik",
        "Sales",
        72000,
        31,
        true,
        List.of("CRM", "B2B", "Cold Calling")
      ),
      new Employee(
        108,
        "Ananya",
        "Finance",
        95000,
        38,
        false,
        List.of("SAP", "Auditing")
      ),
      new Employee(
        109,
        "Dev",
        "Engineering",
        78000,
        24,
        true,
        List.of("Java", "React", "SQL")
      )
    );
  }
}
