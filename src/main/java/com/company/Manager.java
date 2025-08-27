package com.company;

/**
 * Represents a Manager, which is a specialized type of Employee.
 * It inherits all attributes and methods from the Employee class.
 */
public class Manager extends Employee {

    /** The size of the team the manager oversees. */
    private int teamSize;

    /**
     * Constructs a Manager with the given details, including team size.
     *
     * @param idParam Employee ID.
     * @param nameParam Employee name.
     * @param ageParam Employee age.
     * @param salaryParam Employee salary.
     * @param teamSizeParam The size of the team.
     */
    public Manager(final int idParam, final String nameParam, final int ageParam,
                   final double salaryParam, final int teamSizeParam) {

        // Call the parent (Employee) class constructor using the super keyword.
        super(idParam, nameParam, ageParam, salaryParam);
        this.teamSize = teamSizeParam;
    }

    /**
     * Overrides the displayDetails method to include the team size.
     */
    @Override
    public String displayDetails() {
        return super.displayDetails()
                + ", Team Size: " + teamSize;
    }

    /**
     * Assigns a task to a developer.
     * @param task The task description.
     * @param developer The developer to whom the task is assigned.
     * @return Confirmation message.
     */
    public boolean assignTask(final String task, final Developer developer) {
        if (!developer.getCurrProject().isEmpty()) {
            return false;
        }
        developer.setCurrProject(task);
        return true;
    }

}
