package com.galeanos.algorithm.palyndrome;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palyndrome {
    public boolean isPalyndrome(String str) {
        boolean result = false;

        if (str != null && !str.trim().isEmpty()) {
            // Clean up the string
            List<Character> strAsList = str.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList()).stream()
                    .filter(c -> !Character.isSpaceChar(c))
                    .map(c -> Character.toUpperCase(c))
                    .collect(Collectors.toList());

            int size = strAsList.size();
            result = IntStream.range(0, size/2)
                    .allMatch(i -> strAsList.get(i).equals(strAsList.get(size-1-i)));
        }

        return result;
    }

    public static void main(String ... args) {
        final Palyndrome palyndrome = new Palyndrome();
        palyndrome.isPalyndrome("           Anita 4654654 ///&&&&&&      lava la tina   ");
        palyndrome.isPalyndrome("a");
        palyndrome.isPalyndrome("");
        palyndrome.isPalyndrome(null);
        palyndrome.isPalyndrome("      ANITA lava la tiNA");
        palyndrome.isPalyndrome("      12345654321");
        palyndrome.isPalyndrome("      ANA   12345       654321 ANA");
    }
}
