package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for checking the displayDetails() method of Employee, Manager, and Developer classes.
 */
public class EmployeeDisplayTest {

    // Instances of the classes to be tested
    private Employee regularEmployee;
    private Manager manager;
    private Developer developer;

    /**
     * It creates fresh instances of Employee, Manager, and Developer.
     */
    @BeforeEach
    public void setup() {
        regularEmployee = new Employee(303, "Shubham", 35, 60000.00);
        manager = new Manager(101, "Rahul", 45, 120000.00, 15);
        developer = new Developer(202, "Sandeep", 28, 95000.00, "Java");
    }

    /**
     * Test that Employee's displayDetails().
     */
    @Test
    public void testEmployeeDisplayDetails() {
        String expected = "ID: 303, Name: Shubham, Age: 35, Salary: 60000.0";
        assertEquals(expected, regularEmployee.displayDetails());
    }

    /**
     * Test that Manager's displayDetails() includes the team size.
     */
    @Test
    public void testManagerDisplayDetails() {
        String expected = "ID: 101, Name: Rahul, Age: 45, Salary: 120000.0, Team Size: 15";
        assertEquals(expected, manager.displayDetails());
    }

    /**
     * Test that Developer's displayDetails() includes the programming language.
     */
    @Test
    public void testDeveloperDisplayDetails() {
        String expected = "ID: 202, Name: Sandeep, Age: 28, Salary: 95000.0, Programming Language: Java";
        assertEquals(expected, developer.displayDetails());
    }
}
