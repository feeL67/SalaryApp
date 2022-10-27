package org.homeworks.enums;

import lombok.Getter;

@Getter
public enum Post {
    DIRECTOR(1),
    PROGRAMMER(10),
    SELLER(5),
    CLEANER(2);

    private final int hourlyRate;

    Post(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}