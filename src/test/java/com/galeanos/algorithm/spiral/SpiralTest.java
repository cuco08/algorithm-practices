package com.galeanos.algorithm.spiral;

//import org.junit.Assert;
import org.junit.*;

public class SpiralTest {
    private Spiral spiral;
    @BeforeClass
    public static void setUp(){
        System.out.println("Before each method using BeforeClass");
    }

    @Before
    public void prerequisites(){
        spiral =new Spiral();
    }

    @Test
    public void testPrintMatrix() {
        int matrix[][] = new int[2][2];
        spiral.printMatrix(matrix);
        // boolean result = method();
        // Assert.assertTrue(result);
    }

    @Test
    public void testPrintMatrix_SizeZeroInvalid() {
        boolean isValidMatrix;
        int matrix[][];
        matrix = spiral.calcMatrix(0,1);
        if (matrix[0][0] == 0){
            isValidMatrix = false;
        } else {
            isValidMatrix = true;
        }
        Assert.assertFalse(isValidMatrix);
    }

   @Test
    public void testPrintMatrix_NegativeValue(){
       int matrix[][] = new int[1][1];
       int matrix2[][];
       matrix[0][0]=0;
       matrix2 = spiral.calcMatrix(-1,-9);
       Assert.assertEquals(matrix[0][0],matrix2[0][0]);
    }

    @Test
    public void testSendingLetters(){
        int matrix[][] = new int[5][5];
        boolean isValidMatrix;
        spiral.calcMatrix('a',9);
        if (matrix[0][0] == 0){
            isValidMatrix = false;
        } else {
            isValidMatrix = true;
        }

        Assert.assertFalse(isValidMatrix);
    }

   @Test
    public void testWhenInitialValidIsNegative(){
        int matrix[][] = new int[5][5];
        boolean isValidMatrix;
       matrix = spiral.calcMatrix(5,-500);
        if (matrix[0][0] == 0){
            isValidMatrix = false;
        } else {
            isValidMatrix = true;
        }
        Assert.assertTrue(isValidMatrix);
    }

    @After
    public void tearDown(){
        System.out.println("After test Methods");
    }
    @AfterClass
    public static void bye(){
        System.out.println("After Class");
    }
}
