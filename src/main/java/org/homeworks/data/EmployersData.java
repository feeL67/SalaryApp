package org.homeworks.data;

import org.homeworks.entity.*;

import java.util.ArrayList;
import java.util.List;

public class EmployersData {
    public void showInfo() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Cleaner("Cleaner1"));
        employees.add(new Cleaner("Cleaner2"));
        employees.add(new Seller("Seller1"));
        employees.add(new Seller("Seller2"));
        employees.add(new Seller("Seller3"));
        employees.add(new Seller("Seller4"));
        employees.add(new Seller("Seller5"));
        employees.add(new Seller("Seller6"));
        employees.add(new Seller("Seller7"));
        employees.add(new Programmer("Programmer1"));
        employees.add(new Programmer("Programmer2"));
        employees.add(new Programmer("Programmer3"));
        employees.add(new Programmer("Programmer4"));
        employees.add(new Programmer("Programmer5"));
        employees.add(new Programmer("Programmer6"));
        employees.add(new Programmer("Programmer7"));
        employees.add(new Programmer("Programmer8"));
        employees.add(new Programmer("Programmer9"));
        employees.add(new Programmer("Programmer10"));
        for (Employee employee : employees) {
            System.out.println("Name:" + employee.getName() + ", Post:" + employee.getPost() + ", Hours:" + employee.getHours() + "h., Salary:" + employee.getSalary() + "$ + " + employee.getAward() + "$ bonus");
        }
        Director director = new Director("Director", employees);
        System.out.println("Name:" + director.getName() + ", Post:" + director.getPost() + ", Salary:" + director.getSalary() + "$ + " + director.getAward() + "$ bonus");
    }
}