package com.thoughtworks.type.clazz;

public abstract class Shape implements Drawable {

    public void draw() {
        System.out.println("drawing a " + this.toString());
    }

    public abstract String toString();
}
