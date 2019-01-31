package com.company;

public class nested {
    public static void main(String[] args) {
        for (int j = 0; j < 4; j++) {
            System.out.println("**********");

            for (int i = 5; i >= 1; i--) {
                for (int k = 5; k >= i; k--) {
                    System.out.print("*" + "\t");
                }
                System.out.println("");
            }
        }
    }
}
















