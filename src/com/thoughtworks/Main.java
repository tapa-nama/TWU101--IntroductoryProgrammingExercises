package com.thoughtworks;

public class Main {

    public static void main(String[] args) {
        System.out.println("Triangle Exercises:");
        TriangleExercises triangleExercises = new TriangleExercises();
        triangleExercises.easiestExercise();
        System.out.println();
        triangleExercises.drawAHorizontalLine(8);
        System.out.println();
        triangleExercises.drawAVerticalLine(3);
        System.out.println();
        triangleExercises.drawARightTriangle(3);
        System.out.println();

        System.out.println("Diamond Exercises:");
        DiamondExercises diamondExercises = new DiamondExercises();
        diamondExercises.isoscelesTriangle(4);
        System.out.println();
        diamondExercises.diamond(4);
        System.out.println();
        diamondExercises.diamondWithName(4);
        System.out.println();

        System.out.println("FizzBuzz Exercise:");
        new FizzBuzzExercise().fizzBuzz(100);
        System.out.println();

        System.out.println("Prime Factors Exercise:");
        new PrimeFactorsExercise().generate(30);
    }
}
