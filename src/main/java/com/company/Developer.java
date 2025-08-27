package com.company;

/**
 * Represents a Developer, a specialized type of Employee.
 * It inherits all attributes and methods from the Employee class.
 */
public class Developer extends Employee {

    /** Developer primary Progm language. */
    private String programmingLanguage;

    /** Developer current project. */
    private String currProject;

    /**
     * Constructs a Developer with the given details, including their language.
     *
     * @param idParam Employee ID.
     * @param nameParam Employee name.
     * @param ageParam Employee age.
     * @param salaryParam Employee salary.
     * @param languageParam The programming language.
     */
    public Developer(final int idParam, final String nameParam, final int ageParam,
                     final double salaryParam,  final String languageParam) {

        // Call the parent (Employee) class constructor using the super keyword.
        super(idParam, nameParam, ageParam, salaryParam);
        this.programmingLanguage = languageParam;
        this.currProject = "";
    }

    /**
     * Override the displayDetails of employee to include programming lang.
     */
    @Override
    public String displayDetails() {
        // Call the parent's displayDetails method to reuse code.
        return super.displayDetails() + ", Programming Language: " + programmingLanguage;
    }

    /** Get developer current project.
     * @return currProject.
     */
    public String getCurrProject() {
        return currProject;
    }

    /** Set developer current project.
     * @param newProject developer current project.
     */
    public void setCurrProject(final String newProject) {
        this.currProject = newProject;
        return;
    }

    /**
     * Fixes a bug identified by its ID.
     * @param bugId The bug identifier.
     * @return Confirmation message.
     */
    public String fixBug(final String bugId) {
        return "Developer " + getName() + " fixed bug #" + bugId;
    }

}



