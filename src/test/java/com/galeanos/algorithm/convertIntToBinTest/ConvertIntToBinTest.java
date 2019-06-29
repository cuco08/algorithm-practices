package com.galeanos.algorithm.convertIntToBinTest;

import com.galeanos.algorithm.convertIntToBin.ConverterIntToBin;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.After;

import java.util.Map;
import java.util.HashMap;
import static org.hamcrest.CoreMatchers.is;


public class ConvertIntToBinTest {

    private ConverterIntToBin converter1;
    Map<String,Integer> result = new HashMap<>();
    Map<String,Integer> comprarResultado = new HashMap<>();

@BeforeClass
public static void setUp(){
    System.out.println("Set up before class");
    //Map<String,Integer> result = new HashMap<>();
}

@Before
    public void preRequisitos(){
    converter1 = new ConverterIntToBin();
    //Map<String,Integer> result = new HashMap<>();

}

@Test
    public void testConvertidorFor1515(){
    result = converter1.convertidor("10111101011");
    comprarResultado.put("ContadorZeros",3);
    comprarResultado.put("ContadorUnos",8);
    Assert.assertThat(result, is(comprarResultado));
}

@Test
    public void testConvertidorFor1(){
    result = converter1.convertidor("1");
    comprarResultado.put("ContadorZeros",0);
    comprarResultado.put("ContadorUnos",1);
    Assert.assertThat(result, is(comprarResultado));
}

    @After
    public void tearDown(){
        System.out.println("After test Methods");
        result.clear();
        comprarResultado.clear();
    }

    @AfterClass
    public static void bye(){
        System.out.println("After Class");
    }
}
