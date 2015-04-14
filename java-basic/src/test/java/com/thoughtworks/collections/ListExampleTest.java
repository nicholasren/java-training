package com.thoughtworks.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.thoughtworks.collections.ListExample.*;
import static com.thoughtworks.support.Constants.__;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ListExampleTest {

    private List<String> xs;

    private static String[] words = new String[]{"hello", "java", "I", "love", "java"};
    private static List<Integer> nums = Arrays.asList(new Integer[]{1, 3, 5, 6, 7, 9});

    @Before
    public void before() {
        xs = new LinkedList<>();
    }

    @Test
    public void supported_operations() {
        assertThat(xs.size(), is(__));
        xs.add("1");
        assertThat(xs.get(0), is(__));
        assertThat(xs.size(), is(__));
        assertThat(xs.contains("1"), is(__));
        assertThat(xs.indexOf("1"), is(__));
        assertThat(xs.indexOf("1"), is(__));
        xs.remove("1");
        assertThat(xs.size(), is(__));

    }


    @Test
    public void type_safe() {
        //won't compile
        //xs.add(1);
    }


    @Test
    public void filtering() {
        System.out.println(long_words(words));
    }

    @Test
    public void mapping() {
        System.out.println(word_length(words));
    }

    @Test
    public void reduction() {
        System.out.println(sum(nums));
        System.out.println(multiple(nums));
    }
}
