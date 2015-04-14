package com.thoughtworks.type.clazz;

import com.thoughtworks.type.annotation.Tool;

@Tool(value = "compasses")
public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle with r: " + r;
    }
}
