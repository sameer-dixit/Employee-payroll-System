
# Employee Payroll System

## Overview

This Java program implements a simple Employee Payroll System. It allows the addition, removal, and display of employee details, supporting both full-time and part-time employees. The system calculates the salary based on the type of employment (full-time or part-time) and the corresponding parameters.

## Classes

### Main
The Main class contains the main method, initializing the payroll system and demonstrating its functionality with sample employee data.

### Employee
The Employee class is an abstract class serving as the base class for both full-time and part-time employees. It includes common attributes like name and ID, and an abstract method for calculating the salary.

### FulltimeEmp
The FulltimeEmp class extends Employee and represents a full-time employee with a monthly salary.

### ParttimeEmp
The ParttimeEmp class extends Employee and represents a part-time employee with working hours and an hourly rate.

### PayrollSystem
The PayrollSystem class manages the list of employees, providing methods for adding, removing, and displaying employee details.

## How to Use

1. Create instances of full-time and part-time employees using the FulltimeEmp and ParttimeEmp classes.
2. Initialize the PayrollSystem to manage employee data.
3. Add employees to the system using the `addemp` method.
4. Display the initial employee details using the `displayemp` method.
5. Remove employees by their ID using the `removeemp` method.
6. Display the remaining employee details after removal.

## Example Usage

```java
payrollSystem prsystem = new payrollSystem();
fulltimeEmp emp1 = new fulltimeEmp("John Doe", 1, 50000);
parttimeEmp emp2 = new parttimeEmp("Jane Smith", 2, 77, 250);
prsystem.addemp(emp1);
prsystem.addemp(emp2);
System.out.println("<-------Initial Employee Details------->");
prsystem.displayemp();
System.out.println("Removing Employee with ID 2....");
prsystem.removeemp(2);
System.out.println("Remaining Employee Details");
prsystem.displayemp();
