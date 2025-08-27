package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Employee hierarchy classes (Employee, Manager, and Developer).
 * Ensure all data get inherited by manager and developer.
 */
public class EmployeeObjectTest {

    // Define instances of each class to be tested.
    private Employee regularEmployee;
    private Manager manager;
    private Developer developer;

    /**
     * This setup method is run before each test method and ensures a fresh instance of each object.
     */
    @BeforeEach
    public void setup() {
        regularEmployee = new Employee(303, "Akshay", 35, 60000.00);
        manager = new Manager(101, "Anoop", 45, 120000.00,  15);
        developer = new Developer(202, "Chirag", 28, 95000.00,  "Java");
    }

    /**
     * Tests the constructor and all getter methods of the base Employee class.
     * This verifies that the object is instantiated correctly with the provided data.
     */
    @Test
    public void testEmployeeGetters() {
        assertEquals(303, regularEmployee.getId(), "Employee ID should match.");
        assertEquals("Akshay", regularEmployee.getName(), "Employee name should match.");
        assertEquals(35, regularEmployee.getAge(), "Employee age should match.");
        assertEquals(60000.00, regularEmployee.getSalary(), 0.001, "Employee salary should match.");
    }

    /**
     * Tests the constructor and all getter methods of the Manager class.
     * This includes inherited getters as well as the unique team size property.
     */
    @Test
    public void testManagerGetters() {
        assertEquals(101, manager.getId(), "Manager ID should match.");
        assertEquals("Anoop", manager.getName(), "Manager name should match.");
        assertEquals(45, manager.getAge(), "Manager age should match.");
        assertEquals(120000.00, manager.getSalary(), 0.001, "Manager salary should match.");
    }

    /**
     * Tests the constructor and all getter methods of the Developer class.
     * This includes inherited getters and the unique programming language property.
     */
    @Test
    public void testDeveloperGetters() {
        assertEquals(202, developer.getId(), "Developer ID should match.");
        assertEquals("Chirag", developer.getName(), "Developer name should match.");
        assertEquals(28, developer.getAge(), "Developer age should match.");
        assertEquals(95000.00, developer.getSalary(), 0.001, "Developer salary should match.");
    }

}

