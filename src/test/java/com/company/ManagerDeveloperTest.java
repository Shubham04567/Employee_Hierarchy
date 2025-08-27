package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests Manager assigning tasks to Developers,
 * and checking Developer's current project.
 */
public class ManagerDeveloperTest {

    private Manager manager;
    private Developer developer;

    @BeforeEach
    public void setup() {
        manager = new Manager(1, "Shubham", 40, 120000.0, 10);
        developer = new Developer(2, "Rahul", 28, 95000.0, "Java");
    }

    @Test
    public void testAssignTaskWhenDeveloperIsFree() {
        boolean result = manager.assignTask("Login Feature", developer);

        assertTrue(result, "Task should be assigned successfully");
        assertEquals("Login Feature", developer.getCurrProject(),
                "Developer should be assigned with new project when initially not assigned");
    }

    @Test
    public void testAssignTaskWhenDeveloperAlreadyHasProject() {
        developer.setCurrProject("Payment feature");

        boolean result = manager.assignTask("Build Dashboard", developer);

        assertFalse(result, "Task should not be assigned");
        assertEquals("Payment feature", developer.getCurrProject(),
                "Developer should not be assigned with new project when already have project");
    }

}
