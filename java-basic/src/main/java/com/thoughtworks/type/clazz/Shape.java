package com.thoughtworks.type.clazz;

import com.thoughtworks.type.annotation.Tool;

public abstract class Shape {

    public void draw() {
        System.out.println("drawing a " + this.toString());
    }

    public abstract String toString();
}
