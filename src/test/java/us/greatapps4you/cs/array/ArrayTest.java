package us.greatapps4you.cs.array;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayTest {

    @Test
    void initArrayShorthand(){
        int[] actual = {10,20,30};
        int[] expected = new int[3];
        expected[0] = 10;
        expected[1] = 20;
        expected[2] = 30;

        int expectedLength = 3;
        int actualLength = actual.length;

        System.out.println("actual: " + Arrays.toString(actual) + " | length: " + actual.length);

        Assertions.assertArrayEquals(expected, actual);
        Assertions.assertEquals(expectedLength, actualLength);
    }

}