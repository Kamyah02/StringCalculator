package com.example.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        if (numbers.startsWith("//")) {
            delimiter = String.valueOf(numbers.charAt(2));
            numbers = numbers.substring(4);
        }

        String[] nums = numbers.split("[\n" + delimiter + "]");
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();
        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (n < 0) {
                negativeNumbers.add(n);
            }
            sum += n;
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed " + negativeNumbers);
        }
        return sum;
    }
}
