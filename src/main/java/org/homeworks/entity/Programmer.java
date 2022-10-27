package org.homeworks.entity;

import lombok.Getter;
import lombok.ToString;
import org.homeworks.enums.Post;

@Getter
@ToString
public class Programmer extends Employee {
    private int hours;
    private int award;
    private int salary;

    public Programmer(String name) {
        super(name);
    }

    @Override
    public Post getPost() {
        return Post.PROGRAMMER;
    }

    public int getHours() {
        for (int i = 0; i < getDays_in_month(); i++) {
            int random_num = (int) (Math.random() * 8);
            if (random_num != 0) {
                hours += random_num;
            } else {
                hours -= 2;
            }
        }
        return hours;
    }

    @Override
    public int getAward() {
        double random = Math.random() * 10;
        if ((random) > 5.0) {
            award = salary / 10;
        }
        return award;
    }

    @Override
    public int getSalary() {
        return salary = hours * getPost().getHourlyRate();
    }
}