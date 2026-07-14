package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

/**
 * Provides greeting functionality.
 */
public class Greeter {

    private final String defaultName;

    /**
     * Creates a Greeter with a default name.
     *
     * @param defaultName the default name used when no name is provided
     */
    public Greeter(String defaultName) {
        this.defaultName = Objects.requireNonNull(defaultName, "defaultName must not be null");
    }

    /**
     * Returns a greeting message for the provided name.
     *
     * @param someone the name to greet
     * @return greeting message
     */
    public String greet(String someone) {
        String nameToUse = (someone == null || someone.isBlank())
                ? defaultName
                : someone;

        return String.format("Hello, %s!", nameToUse);
    }

    /**
     * Prints names that start with the letter 'A' and have more than 3 characters.
     *
     * @param names list of names
     */
    public void printValidNames(List<String> names) {
        if (names == null) {
            return;
        }

        names.stream()
                .filter(Objects::nonNull)
                .filter(name -> name.length() > 3)
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }

    /**
     * Demonstrates safe database query usage.
     *
     * Note: In real applications, credentials should come from environment
     * variables or a secure configuration service.
     *
     * @param dbUrl database URL
     * @param user database username
     * @param password database password
     * @param name name to query
     * @throws SQLException if a database error occurs
     */
    public void queryUser(String dbUrl, String user, String password, String name) throws SQLException {

        String sql = "SELECT * FROM users WHERE name = ?";

        try (Connection connection = DriverManager.getConnection(dbUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.executeQuery();
        }
    }
}