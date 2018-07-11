package com.thoughtworks;

import java.util.HashSet;
import java.util.Set;

class PrimeFactorsExercise {
    void generate(int n) {
        Set<Integer> ans = new HashSet<>();
        int factor = 2;
        while (factor <= n) {
            if (n % factor == 0) {
                ans.add(factor);
                n /= factor;
            } else {
                factor++;
            }
        }

        for (Integer num : ans) {
            System.out.print(num + " ");
        }
    }
}
