package org.homeworks.entity;

import lombok.Getter;
import lombok.ToString;
import org.homeworks.enums.Post;

@Getter
@ToString
public class Seller extends Employee {
    public Seller(String name) {
        super(name);
    }

    @Override
    public Post getPost() {
        return Post.SELLER;
    }
}