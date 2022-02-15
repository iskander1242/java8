package com.ss;

import java.util.HashSet;
import java.util.Set;

class SumDecomposer {

    /**
     * Finds the components of the sum, returns null
     * if there are no or invalid input parameters
     *
     * @param numbers array of distinct numbers
     * @param sum     target sum
     * @return array of sum components
     */
    public static int[] getComponentsTheSum(int[] numbers, int sum) {
        int[] result = new int[]{};

        if (numbers == null || numbers.length < 2) {
            return result;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            int difference = sum - numbers[i];
            if (set.contains(difference)) {
                result = new int[2];
                result[0] = numbers[i];
                result[1] = difference;
                break;
            }
            set.add(numbers[i]);
        }

        return result;
    }
}
