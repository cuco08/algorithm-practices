package com.galeanos.algorithm.algorithm;

import com.galeanos.algorithm.multipliedarray.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTest {
    public static ArrayOperations operations = new ArrayOperations();

    @Test
    public void testMultipliedArray_HappyPath() {
        int[]input = new int[]{1, 2, 3, 4, 5};
        int[]output = operations.transformArrayWithDivision(input);
        int[]twinOutput = operations.transformArrayWithoutDivision(input);

        Assert.assertArrayEquals(output, twinOutput);
        Assert.assertEquals(120, output[0]);
        Assert.assertEquals( 60, output[1]);
        Assert.assertEquals( 40, output[2]);
        Assert.assertEquals( 30, output[3]);
        Assert.assertEquals( 24, output[4]);
    }

    @Test
    public void testMultipliedArray_NegativeNumbers() {
        int[]input = new int[]{-1, 2, -3, 4, -5};
        int[]output = operations.transformArrayWithDivision(input);
        int[]twinOutput = operations.transformArrayWithoutDivision(input);

        Assert.assertArrayEquals(output, twinOutput);
        Assert.assertEquals(120, output[0]);
        Assert.assertEquals( -60, output[1]);
        Assert.assertEquals( 40, output[2]);
        Assert.assertEquals( -30, output[3]);
        Assert.assertEquals( 24, output[4]);
    }

    @Test
    public void testMultipliedArray_EmptyArray() {
        int[]input = new int[]{};
        int[]output = operations.transformArrayWithDivision(input);
        int[]twinOutput = operations.transformArrayWithoutDivision(input);

        Assert.assertArrayEquals(output, twinOutput);
        Assert.assertEquals(0, output.length);
    }

    @Test
    public void testMultipliedArray_SingleElement() {
        int[]input = new int[]{8};
        int[]output = operations.transformArrayWithDivision(input);
        int[]twinOutput = operations.transformArrayWithoutDivision(input);

        Assert.assertArrayEquals(output, twinOutput);
        Assert.assertEquals(1, output.length);
        Assert.assertEquals(8, output[0]);
    }

    @Test
    public void testMultipliedArray_SingleElement_Zero() {
        int[]input = new int[]{0};
        int[]output = operations.transformArrayWithDivision(input);
        int[]twinOutput = operations.transformArrayWithoutDivision(input);

        Assert.assertArrayEquals(output, twinOutput);
        Assert.assertEquals(1, output.length);
        Assert.assertEquals(0, output[0]);
    }

    @Test
    public void testMultipliedArray_ManyZeros() {
        int[]input = new int[]{0, 2, 0, 4, 5};
        int[]output = operations.transformArrayWithDivision(input);
        int[]twinOutput = operations.transformArrayWithoutDivision(input);

        Assert.assertArrayEquals(output, twinOutput);
        for (int element : output) {
            Assert.assertEquals(0, element);
        }
    }
}
