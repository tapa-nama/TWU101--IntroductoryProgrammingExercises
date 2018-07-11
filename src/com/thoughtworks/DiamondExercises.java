package com.thoughtworks;

class DiamondExercises {
    void isoscelesTriangle(int n) {
        topDiamond(n);
        for (int i = 0; i < (2 * n - 1); i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    private void topDiamond(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void diamond(int n) {
        isoscelesTriangle(n);
        bottomDiamond(n);
    }

    private void bottomDiamond(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void diamondWithName(int n) {
        topDiamond(n);
        System.out.println("ZhouTian");
        bottomDiamond(n);
    }
}
