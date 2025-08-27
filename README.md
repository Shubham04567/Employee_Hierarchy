# Employee Hierarchy Project

A simple Java project that demonstrates **inheritance, method overriding, and polymorphism** using an employee management system.  
This project is built using **Java 17** and **Maven**.

---

## Specification

The system models a company with employees, where:
- Every **Employee** has common attributes like `id`, `name`, `age`, and `salary`.
- A **Manager** is an employee with a `teamSize` and the ability to **assign tasks** to developers.
- A **Developer** is an employee with a `programmingLanguage`, a `currProject`, and the ability to **fix bugs**.
- Task assignment is **controlled**: a developer can only take one project at a time.

The aim is to show **real-world application of inheritance**.

---

## Architecture

- **Layered Structure**
    - `Employee` → Base class (generalized abstraction)
    - `Manager` & `Developer` → Derived classes with specialized roles
- **Object-Oriented Principles Used**
    - **Encapsulation** → Private fields, getters/setters
    - **Inheritance** → Manager and Developer inherit from Employee
    - **Polymorphism** → Common interface (`displayDetails()`) behaves differently

---

##  Design

- **Employee**
    - Attributes: `id`, `name`, `age`, `salary`
    - Method: `displayDetails()`

- **Manager** (extends Employee)
    - Extra attribute: `teamSize`
    - Overrides: `displayDetails()`
    - Unique behavior: `assignTask(Developer, task)`

- **Developer** (extends Employee)
    - Extra attributes: `programmingLanguage`, `currProject`
    - Overrides: `displayDetails()`
    - Unique behaviors: `fixBug(bugId)`, `getCurrProject()`, `setCurrProject()`

---

## How To Run

``` bash 
   git clone https://github.com/your-username/employee-hierarchy.git
```




