package com.thoughtworks;

class TriangleExercises {
    void easiestExercise() {
        System.out.println("*");
    }

    void drawAHorizontalLine(int n) {
        while (n != 0) {
            System.out.print("*");
            n--;
        }
        System.out.println();
    }

    void drawAVerticalLine(int n) {
        while (n != 0) {
            System.out.println("*");
            n--;
        }
    }

    void drawARightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
