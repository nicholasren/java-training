package com.thoughtworks.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.thoughtworks.collections.MapExample.count;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MapExampleTest {
    private Map<String, Integer> wordCount = new HashMap<>();

    private static String scentance = "hello java, I love java";

    @Before
    public void before() {
        wordCount = count(scentance);
    }

    @Test
    public void word_count() {
        assertThat(wordCount.get("java"), is(2));
        assertThat(wordCount.get("hello"), is(1));
        assertThat(wordCount.get("I"), is(1));
    }

    @Test
    public void print() {
        //print all key and values in the wordCount map
    }


}
