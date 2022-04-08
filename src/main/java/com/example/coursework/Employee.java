package com.example.coursework;

import java.util.Objects;

public class Employee {
    private final String employeeFullName;
    private int department;
    private double salaryMonth;
    static int counter;
    private final int id;

    public Employee(String firstName, String lastName, String middleName, int department, double salaryMonth) {
        this.employeeFullName = lastName + " " + firstName + " " + middleName;
        this.department = department;
        this.salaryMonth = salaryMonth;
        this.id = counter + 1;
        counter++;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salaryMonth;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    public String toString() {
        return getId() + "." + getEmployeeFullName() + ", отдел №: " + getDepartment() + ", заработная плата: " + getSalary() + " рублей";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salaryMonth, salaryMonth) == 0 && id == employee.id && employeeFullName.equals(employee.employeeFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeFullName, department, salaryMonth, id);
    }
}