package com.example;

public class Main {
    public static void fizzBuzz(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
        
    }
    public static void main(String[] args) {
        fizzBuzz(1, 10);
    }
}