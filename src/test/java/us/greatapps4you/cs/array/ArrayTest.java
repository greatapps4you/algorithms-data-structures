package us.greatapps4you.cs.array;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayTest {

    @Test
    void insert() {
        Array array = new Array();
        array.insert(10);
        array.insert(20);
        array.insert(30);

        int expectedSize = 3;

        Assertions.assertEquals(expectedSize, array.size());
        Assertions.assertEquals(10, array.getAt(0));
        Assertions.assertEquals(20, array.getAt(1));
        Assertions.assertEquals(30, array.getAt(2));
    }

    @Test
    void initArrayShorthand() {
        int[] actual = {10, 20, 30};
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