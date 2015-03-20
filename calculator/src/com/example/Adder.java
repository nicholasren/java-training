package com.example;

class Adder {
  public static void main(String [] args) {
    int a = Integer.valueOf(args[0]);
    int b = Integer.valueOf(args[1]);

    System.out.println("The result is: " + add(a, b));
  }

  public static int add(int a, int b) {
    return a + b ;
  }
}
