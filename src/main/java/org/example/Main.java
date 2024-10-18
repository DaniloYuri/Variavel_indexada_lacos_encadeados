package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] m = new int[5][10];

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 10; y++) {
                m[x][y] = (x + 1) * (y + 1);
            }
        }
        System.out.println("Tabuada de 1 a 5:");
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.printf("%d\t", m[x][y]);
            }
            System.out.println();
        }
    }
}

