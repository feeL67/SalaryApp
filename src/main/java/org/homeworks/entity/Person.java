package org.homeworks.entity;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}