package com.thoughtworks.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static List<String> long_words(String[] words) {

        ArrayList<String> strings = new ArrayList<>(0);
        for (String word : words) {
            if (word.length()>4)
                strings.add(word);
        }
        return strings;
    }

    public static List<Integer> word_length(String[] words) {
        ArrayList<Integer> length = new ArrayList<>(0);
        for (String word : words) {
             length.add(word.length());
        }
        return length;

    }

    public static Integer sum(List<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static Integer multiple(List<Integer> nums) {
        int product = 1;
        for (int i : nums) {
            product *= i;
        }
        return product;
    }

    static class Functional {

        public static List<String> long_words(String[] words) {
            return Arrays.asList(words).stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        }

        public static List<Integer> word_length(String[] words) {
            return Arrays.asList(words).stream().map(x -> x.length()).collect(Collectors.toList());
        }

        public static Integer sum(List<Integer> nums) {
            return nums.stream().collect(Collectors.reducing(0, (x, y) -> x + y));
        }

        public static Integer multiple(List<Integer> nums) {
            return nums.stream().collect(Collectors.reducing(1, (x, y) -> x * y));
        }
    }


}
