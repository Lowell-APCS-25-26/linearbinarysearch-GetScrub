

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class LinearBinarySearchTester {

   @Test
   public void linear1 () {
      int[] tests = {0, 183, 184, 2370, 15320, 19967, 19968};
        Item[] store = 
            {
            new Item(184, 14), 
            new Item(196, 60), 
            new Item(206, 31), 
            new Item(2370, 65), 
            new Item(7282, 73), 
            new Item(8303, 90), 
            new Item(12328, 63), 
            new Item(12705, 14), 
            new Item(13066, 8), 
            new Item(14088, 92), 
            new Item(15320, 82), 
            new Item(15814, 60), 
            new Item(15917, 51), 
            new Item(17911, 96), 
            new Item(18061, 3), 
            new Item(18410, 56), 
            new Item(18465, 27), 
            new Item(18618, 64), 
            new Item(18871, 69), 
            new Item(19967, 45)
        }; 
        Sketch test = new Sketch();
        assertEquals(-1, test.linearSearch(tests[0]));
        assertEquals(-1, test.linearSearch(tests[1]));
        assertEquals(14, test.linearSearch(tests[2]));
        assertEquals(65, test.linearSearch(tests[3]));
        assertEquals(82, test.linearSearch(tests[4]));
        assertEquals(45, test.linearSearch(tests[5]));
        assertEquals(-1, test.linearSearch(tests[6]));
   }

   @Test
   public void recursivelinear(){
      int[] tests = {0, 183, 184, 2370, 15320, 19967, 19968};
        Item[] store = 
            {
            new Item(184, 14), 
            new Item(196, 60), 
            new Item(206, 31), 
            new Item(2370, 65), 
            new Item(7282, 73), 
            new Item(8303, 90), 
            new Item(12328, 63), 
            new Item(12705, 14), 
            new Item(13066, 8), 
            new Item(14088, 92), 
            new Item(15320, 82), 
            new Item(15814, 60), 
            new Item(15917, 51), 
            new Item(17911, 96), 
            new Item(18061, 3), 
            new Item(18410, 56), 
            new Item(18465, 27), 
            new Item(18618, 64), 
            new Item(18871, 69), 
            new Item(19967, 45)
        }; 
        Sketch test = new Sketch();
        
        assertEquals(-1, test.recursiveLinearSearch(tests[0], 0));
        assertEquals(-1, test.recursiveLinearSearch(tests[1], 0));
        assertEquals(14, test.recursiveLinearSearch(tests[2], 0));
        assertEquals(65, test.recursiveLinearSearch(tests[3], 0));
        assertEquals(82,test.recursiveLinearSearch(tests[4], 0));
        assertEquals(45, test.recursiveLinearSearch(tests[5], 0));
        assertEquals(-1, test.recursiveLinearSearch(tests[6], 0));
   }

   @Test
   public void binarySearch(){
      int[] tests = {0, 183, 184, 2370, 15320, 19967, 19968};
        Item[] store = 
            {
            new Item(184, 14), 
            new Item(196, 60), 
            new Item(206, 31), 
            new Item(2370, 65), 
            new Item(7282, 73), 
            new Item(8303, 90), 
            new Item(12328, 63), 
            new Item(12705, 14), 
            new Item(13066, 8), 
            new Item(14088, 92), 
            new Item(15320, 82), 
            new Item(15814, 60), 
            new Item(15917, 51), 
            new Item(17911, 96), 
            new Item(18061, 3), 
            new Item(18410, 56), 
            new Item(18465, 27), 
            new Item(18618, 64), 
            new Item(18871, 69), 
            new Item(19967, 45)
        }; 
        Sketch test = new Sketch();

        assertEquals(-1, test.binarySearch(tests[0]));
        assertEquals(-1, test.binarySearch(tests[1]));
        assertEquals(14, test.binarySearch(tests[2]));
        assertEquals(65, test.binarySearch(tests[3]));
        assertEquals(82, test.binarySearch(tests[4]));
        assertEquals(45, test.binarySearch(tests[5]));
        assertEquals(-1, test.binarySearch(tests[6]));
   }

   @Test
   public void recursiveBinary(){
int[] tests = {0, 183, 184, 2370, 15320, 19967, 19968};
        Item[] store = 
            {
            new Item(184, 14), 
            new Item(196, 60), 
            new Item(206, 31), 
            new Item(2370, 65), 
            new Item(7282, 73), 
            new Item(8303, 90), 
            new Item(12328, 63), 
            new Item(12705, 14), 
            new Item(13066, 8), 
            new Item(14088, 92), 
            new Item(15320, 82), 
            new Item(15814, 60), 
            new Item(15917, 51), 
            new Item(17911, 96), 
            new Item(18061, 3), 
            new Item(18410, 56), 
            new Item(18465, 27), 
            new Item(18618, 64), 
            new Item(18871, 69), 
            new Item(19967, 45)
        }; 
        Sketch test = new Sketch();

        assertEquals(-1, test.recursiveBinarySearch(tests[0], 0, store.length - 1));
        assertEquals(-1, test.recursiveBinarySearch(tests[1], 0, store.length - 1));
        assertEquals(14,test.recursiveBinarySearch(tests[2], 0, store.length - 1));
        assertEquals(65, test.recursiveBinarySearch(tests[3], 0, store.length - 1));
        assertEquals(82, test.recursiveBinarySearch(tests[4], 0, store.length - 1));
        assertEquals(45, test.recursiveBinarySearch(tests[5], 0, store.length - 1));
        assertEquals(-1, test.recursiveBinarySearch(tests[6], 0, store.length - 1));
   }
}
