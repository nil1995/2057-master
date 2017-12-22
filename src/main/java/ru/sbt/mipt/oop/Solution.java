package main.java.ru.sbt.mipt.oop;

import java.util.*;

public class Solution {
    public static void  main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer a, v, min;

        List<Integer> numbers = new ArrayList<>();

        for (Integer i = 0; i < n; i++) {
            a = in.nextInt();
            if (a == 1) {
                v = in.nextInt();
                numbers.add(v);

            } else {
                min = Collections.min(numbers);
                numbers.remove(min);
                System.out.println(min);
            }
        }
    }
}
