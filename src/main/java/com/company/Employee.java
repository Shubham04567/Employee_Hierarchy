package com.company;

/**
 * Represents an employee with ID, name, age, salary, and date of birth.
 */
public class Employee {

    /** Employee ID. */
    private int employeeId;

    /** Employee name. */
    private String employeeName;

    /** Employee age. */
    private int employeeAge;

    /** Employee salary. */
    private double employeeSalary;

    /**
     * Constructs an Employee with the given details.
     *
     * @param idParam Employee ID.
     * @param nameParam Employee name.
     * @param ageParam Employee age.
     * @param salaryParam Employee salary.
     */
    public Employee(final int idParam, final String nameParam, final int ageParam,
                    final double salaryParam) {
        employeeId = idParam;
        employeeName = nameParam;
        employeeAge = ageParam;
        employeeSalary = salaryParam;
    }

    /**
     * Gets the employee's ID.
     * @return Employee ID.
     */
    public int getId() {
        return employeeId;
    }

    /**
     * Gets the employee's Name.
     * @return Employee name.
     */
    public String getName() {
        return employeeName;
    }

    /**
     * Gets the employee's Age.
     * @return Employee age.
     */
    public int getAge() {
        return employeeAge;
    }

    /**
     * Gets the employee's Salary.
     * @return Employee salary.
     */
    public double getSalary() {
        return employeeSalary;
    }

    /**
     * all detail in form of string separated by ",".
     * @return all employee detail.
     */
    public String displayDetails() {
        return "ID: " + employeeId
                + ", Name: " + employeeName
                + ", Age: " + employeeAge
                + ", Salary: " + employeeSalary;
    }

}
