package com.galeanos.algorithm.multipliedarray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperations {
    public int[] transformArrayWithDivision(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        final int total = Arrays.stream(array).reduce((l, r) -> l * r).getAsInt();
        final int subTotal = Arrays.stream(array).filter(e -> e != 0).reduce((l, r) -> l * r).getAsInt();
        final boolean manyZeros = Arrays.stream(array).filter(e -> e == 0).count() > 1;

        return Arrays.stream(array).map(e -> {
            int mappedValue = 0;
            if (!manyZeros) {
                mappedValue = e != 0? total / e: subTotal;
            }
            return mappedValue;
        }).toArray();
    }

    public int[] transformArrayWithoutDivision(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        final int[] result = new int[array.length];
        IntStream.range(0, array.length).forEach( i -> {
            int aux = array[i];
            array[i] = 1;
            result[i] = Arrays.stream(array).reduce((l, r) -> l * r).getAsInt();
            array[i] = aux;
        });

        return result;
    }


    public static void main(String... args) {
        int[] result = calculateProducts(0);
        for (int r: result) {
            System.out.print(r + ",");
        }

    }

    public static int[] calculateProducts(int... numbers) {
        int size = numbers.length;
        int last = size - 1;

        int[] left = new int[size];
        int[] right = new int[size];

        for (int e = 0, r = last; e < size; e++, r --) {
            left[e] = numbers[e] * extractNumber(left, e - 1);
            right[r] = numbers[r] * extractNumber(right, r + 1);
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = extractNumber(left, i - 1) * extractNumber(right, i + 1);
        }

        return result;
    }

    private static int extractNumber(int[] numbers, int index) {
        return index == -1 || index == numbers.length ? 1 : numbers[index];
    }
}
