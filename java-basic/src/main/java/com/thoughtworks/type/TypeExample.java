package com.thoughtworks.type;

import com.thoughtworks.type.annotation.Tool;
import com.thoughtworks.type.clazz.Circle;
import com.thoughtworks.type.clazz.Shape;
import com.thoughtworks.type.clazz.Square;

import java.util.Arrays;
import java.util.List;

public class TypeExample {

    private static List<Shape> shapes = Arrays.asList(new Circle(1), new Square(1, 2));

    public static void main(String[] args) {
//        runtime_type_info();
//        polymorphism();
        runtime_annotation_info();
    }


    private static void polymorphism() {

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private static void runtime_type_info() {
        for (Shape shape : shapes) {
            if (shape.getClass().getSimpleName().equals("Square")) {
                System.out.println("==========================================");
                System.out.print("|");
                shape.draw();
                System.out.println("|");
                System.out.println("==========================================");
            } else {
                shape.draw();
                System.out.println("");
            }
        }
    }

    private static void runtime_annotation_info() {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("with " + tool_for(shape).value());
        }
    }

    private static Tool tool_for(Shape shape) {
        Tool[] tools = shape.getClass().getAnnotationsByType(Tool.class);
        return tools[0];
    }

}
