package com.bridgelabz.emppayroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRoll {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Enter the ID :");
        String id = consoleInput.nextLine();
        System.out.println("Enter the Name :");
        String name = consoleInput.nextLine();
        System.out.println("Enter the Salary :");
        String salary = consoleInput.nextLine();

        try(FileWriter fileWriter = new FileWriter("Static/EmployeePayRoll.txt");) {
            fileWriter.write("ID :"+id+" \n"+"Name :"+name+" \n"+"Salary :"+salary);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("Static/EmployeePayRoll.txt");

        try(Scanner consoleRead = new Scanner(file);) {
            while (consoleRead.hasNextLine()){
                System.out.println(consoleRead.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
