package com.thoughtworks.generic;

import com.thoughtworks.type.clazz.Drawable;
import com.thoughtworks.type.clazz.Shape;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {


    public static void main(String[] args) {
        type_erase();
    }

    private static void type_erase() {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();

        //true or false?
        System.out.println(c1 == c2);
    }

}


//only suitable to integers
class IntList {
    private List<Integer> els = new ArrayList<>();

    public void add(Integer el) {
        els.add(el);
    }

    public Integer get(Integer idx) {
        return els.get(idx);
    }
}

//suitable to all subclass of Shape
class ShapeList {
    private List<Shape> els = new ArrayList<>();

    public void add(Shape el) {
        els.add(el);
    }

    public Shape get(Integer idx) {
        return els.get(idx);
    }
}

//suitable to all types
class MyGenericList<T> {
    private List<T> els = new ArrayList<>();

    public void add(T el) {
        els.add(el);
    }

    public T get(Integer idx) {
        return els.get(idx);
    }
}