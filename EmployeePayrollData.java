package com.bridgelabz.emppayroll;

import java.io.File;
import java.util.Scanner;

public class EmployeePayrollData {
    private int empId;
    private String empName;
    private double empSalary;

    public EmployeePayrollData(int id, String name, double salary) {
        // TODO Auto-generated constructor stub
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
    }

    public String toString() {
        return "id= " + empId + " name: " + empName + " salary: " + empSalary;
    }
}
