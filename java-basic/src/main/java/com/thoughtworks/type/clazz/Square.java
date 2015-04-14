package com.thoughtworks.type.clazz;

import com.thoughtworks.type.annotation.Tool;

@Tool(value = "ruler")
public class Square extends Shape {
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Square with height: " + height + " width: " + width;
    }
}
