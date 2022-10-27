package org.homeworks.entity;

import lombok.Getter;
import org.homeworks.enums.Post;

import java.util.List;

@Getter
public class Director extends Employee {
    private List<Employee> employees;
    private int salary;
    private int award;

    @Override
    public Post getPost() {
        return Post.DIRECTOR;
    }

    public Director(String name, List<Employee> employees) {
        super(name);
        this.employees = employees;
    }

    @Override
    public int getSalary() {
        int employeesSumSalary = 0;
        for (Employee employee : employees) {
            employeesSumSalary += (employee.getHours() * employee.getPost().getHourlyRate());
        }
        return salary = employeesSumSalary / 10;
    }

    @Override
    public int getAward() {
        double random = Math.random() * 10;
        if ((random) > 5.0) {
            award = salary / 10;
            return award;
        } else return award;
    }
}