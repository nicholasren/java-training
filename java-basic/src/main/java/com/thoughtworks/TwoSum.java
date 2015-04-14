package com.thoughtworks;

public class TwoSum {

    public static void main(String[] args) {

        int [] numbers = new int[] {0,4,3,0};
        int target = 0;
        int[] r = twoSum(numbers, target);
        System.out.println(r.length);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i ++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }

            }
        }
        return null;
    }
}