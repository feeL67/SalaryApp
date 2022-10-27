package org.homeworks.entity;

import lombok.Getter;
import lombok.ToString;
import org.homeworks.enums.Post;

@Getter
@ToString
public class Employee extends Person {
    private int days_in_month = 22;
    private int award;
    private int salary;
    private Post post;
    private int hours;

    public Employee(String name) {
        super(name);
    }

    public int getHours() {
        return hours = 8 * days_in_month;
    }

    public int getSalary() {
        return salary = hours * getPost().getHourlyRate();
    }

    public int getAward() {
        double random = Math.random() * 10;
        if ((random) > 5.0) {
            award = salary / 10;
        }
        return award;
    }
}