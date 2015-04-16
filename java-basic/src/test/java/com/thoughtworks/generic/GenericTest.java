package com.thoughtworks.generic;

import com.thoughtworks.type.clazz.Circle;
import com.thoughtworks.type.clazz.Shape;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class GenericTest {

    @Test
    public void non_generic_list() {
        Circle circle = new Circle(1);

        IntList intList = new IntList();
        ShapeList shapeList = new ShapeList();

        intList.add(1);

        shapeList.add(circle);

        assertThat(intList.get(0), is(1));
        assertThat(shapeList.get(0), is(circle));
    }

    @Test
    public void generic_list() {
        Circle circle = new Circle(1);

        MyGenericList<Integer> intList = new MyGenericList<>();
        MyGenericList<Shape> shapeList = new MyGenericList<>();

        intList.add(1);
        shapeList.add(circle);
//        shapeList.add(1); //compile failed

        assertThat(intList.get(0), is(1));
        assertThat(shapeList.get(0), is(circle));
    }

    @Test
    public void type_erase() {
        Class c1 = new MyGenericList<String>().getClass();
        Class c2 = new MyGenericList<Integer>().getClass();

        assertEquals(c1, c2);
    }
}
