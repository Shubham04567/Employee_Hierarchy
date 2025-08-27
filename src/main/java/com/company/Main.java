package com.company;

/**
 *  Main class to run Employee examples.
 */
public class Main {

    /**
     * Display employee.
     * @param employee list of employees.
     */
    public static void printEmployee(final Employee[] employee) {
        for (final Employee e : employee) {
            String _result = e.displayDetails();
            System.out.println(_result);
        }
    }

    /**
     * Program entry point.
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {

        final Employee[] employees = new Employee[]{
            new Manager(101, "Shubham", 21, 415, 45),
            new Developer(102, "Rahul", 45, 456, "cpp"),
            new Developer(103, "Rahul", 45, 456, "java"),
            new Developer(104, "Rahul", 45, 456, "c"),
        };

        printEmployee(employees);

    }
}
