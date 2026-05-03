# Employee Management System

A Java-based Object-Oriented Programming (OOP) project that models a corporate employee hierarchy. This project demonstrates core Java concepts such as inheritance, constructor overloading, and state management.

## Project Overview

The system simulates a company structure where different types of employees have different rules for salaries, bonuses, and check-in statuses. It uses a single file structure (`Employee.java`) to manage the entire application.

## Key Java Concepts Demonstrated

* **Inheritance:** Uses a parent-child class structure to share logic across different employee types.
* **Constructor Overloading:** Provides multiple ways to create an employee (e.g., specifying a check-in status or letting it default to false).
* **Method Overriding:** Child classes (like `Manager`) customize how payroll is calculated using the `@Override` annotation and the `super` keyword.
* **Access Modifiers & Keywords:** Utilizes `protected` variables, `final` methods (to enforce company-wide clock-in rules), and `static` methods (for shared company policies).

## Class Hierarchy

The project includes the following classes:
* `Employee` - The base class that handles names, base salaries, and clocking in.
* `Manager` - Extends `Employe` to add bonuses to the payroll calculation.
* `Intern` - Extends `Employe` with a fixed base salary.
* `Director` - Extends `Manager` and includes project direction status.
* `CEO` - A `final` class that extends `Manager` with locked-in salary and bonus figures.

## How to Run

1. Open a terminal and navigate to the project directory.
2. Compile the Java file using the following command:
   ```bash
   javac Employee.java