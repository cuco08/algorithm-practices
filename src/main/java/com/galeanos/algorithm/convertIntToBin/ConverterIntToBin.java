package com.galeanos.algorithm.convertIntToBin;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.Map;

public class ConverterIntToBin {

    private String leerNumeroAConvertir(){
        int number,oneCounter = 0, zeroCounter = 0;
        String numBinary = null;

        Scanner scan =new Scanner(System.in);
        System.out.println("Introduce el numero a convertir (Entre 0 y 500) : ");
        number = scan.nextInt();

        numBinary = Integer.toBinaryString(number);
        System.out.println("Binario de: " + number+ " es: " + numBinary);
        return numBinary;
    }

    public Map convertidor(String numBinary){

        int oneCounter = 0, zeroCounter = 0;
        String oneCounter1,zeroCounter1 = null;
        Map<String,Integer> result = new HashMap<>();

        for (int i=0; i<numBinary.length(); i++) {
            if ( numBinary.charAt(i)=='1') {
                oneCounter++;
            } else if (numBinary.charAt(i) == '0') {
                zeroCounter++;
            }
        }
        result.put("ContadorUnos",oneCounter);
        result.put("ContadorZeros",zeroCounter);

    return result;

    }

   private void imprimirResultado(Map resultados)  {
       System.out.println (resultados);
    }


    public static void main(String ... args) {
        ConverterIntToBin convertidor11 = new ConverterIntToBin();
        Map result1 = System.getenv();
        result1 = convertidor11.convertidor(convertidor11.leerNumeroAConvertir());
        convertidor11.imprimirResultado(result1);
    }
}
