package com.example;

public class PlainAppRunner {
    public static void main(String... args) throws Exception {
        while (true) {
            System.out.println("Sleeping for 1s...");
            Thread.sleep(1000);
        }
    }
}
