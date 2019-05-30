package com.galeanos.algorithm.convertIntToBin;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class ConverterIntToBin {

    public void convertidor(){
        int number,oneCounter = 0, zeroCounter = 0;
        String numBinary;

        Scanner scan =new Scanner(System.in);
        System.out.println("Introduce el numero a convertir (Entre 0 y 500) : ");
        number = scan.nextInt();

        numBinary = Integer.toBinaryString(number);
        System.out.println("Binario de: " + number+ " es: " + numBinary);

        for (int i=0; i<numBinary.length(); i++) {
            if ( numBinary.charAt(i)=='1') {
                oneCounter++;
            } else if (numBinary.charAt(i) == '0') {
                zeroCounter++;
            }
        }

        System.out.println("Total de Zeros: "  + zeroCounter);
        System.out.println("Total de unos: "  + oneCounter);
    }

    public static void main(String ... args) {
        ConverterIntToBin convertidor11 = new ConverterIntToBin();
        convertidor11.convertidor();
    }


}
