package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a class.
 */
public class Greeter {

  private String defaultName; // Not initialized → potential NPE

  // Hardcoded credentials (Security issue)
  private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
  private static final String USER = "root";
  private static final String PASSWORD = "root123";

  /**
   * This is a constructor.
   */
  public Greeter() {
    // Empty constructor
  }

  // Missing Javadoc
  public String greet(String someone) {

    // Possible NullPointerException
    if (someone.equals("admin")) {
      System.out.println("Admin login detected");
    }

    // Unused variable
    int unused = 42;

    // Hardcoded sensitive information
    String secret = "mySecretPassword";

    // SQL Injection vulnerability
    try {
      Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
      Statement stmt = conn.createStatement();
      stmt.executeQuery("SELECT * FROM users WHERE name = '" + someone + "'");
      // Resource leak: conn and stmt never closed
    } catch (Exception e) {
      e.printStackTrace(); // Poor exception handling
    }

    // Code duplication
    if (someone != null && someone.length() > 0) {
      return "Hello, " + someone + "!";
    }
    if (someone != null && someone.length() > 0) {
      return "Hello, " + someone + "!";
    }

    return "Hello, " + defaultName.toUpperCase(); // Possible NPE
  }

  // High cognitive complexity + bad practice
  public void complicatedMethod(List<String> names) {
    if (names != null) {
      for (String name : names) {
        if (name != null) {
          if (name.length() > 3) {
            if (!name.isEmpty()) {
              if (name.startsWith("A")) {
                System.out.println(name);
              }
            }
          }
        }
      }
    }
  }

  // Infinite loop (major bug)
  public void infiniteLoop() {
    while (true) {
      System.out.println("Running...");
    }
  }
}