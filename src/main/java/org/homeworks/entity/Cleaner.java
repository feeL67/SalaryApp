package org.homeworks.entity;

import lombok.Getter;
import lombok.ToString;
import org.homeworks.enums.Post;

@Getter
@ToString
public class Cleaner extends Employee {
    public Cleaner(String name) {
        super(name);
    }

    @Override
    public Post getPost() {
        return Post.CLEANER;
    }
}