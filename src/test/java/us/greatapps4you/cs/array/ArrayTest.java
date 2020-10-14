package us.greatapps4you.cs.array;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayTest {

    Array array;

    @BeforeEach
    void setUp(){
        array = new Array();
        array.insert(10);//0
        array.insert(20);//1
        array.insert(30);//2
        array.insert(40);//3
        array.insert(50);//4
        array.insert(60);//5
        array.insert(70);//6
    }

    @Test
    void removeAtRandom() {
        array.removeAt(3);
        System.out.println("actual: " + Arrays.toString(array.getData()) + " | length: " + array.size());
        Assertions.assertEquals(50, array.getAt(3));
        Assertions.assertEquals(70, array.getAt(5));
        Assertions.assertEquals(6, array.size());

        array.removeAt(2);
        System.out.println("actual: " + Arrays.toString(array.getData()) + " | length: " + array.size());
        Assertions.assertEquals(50, array.getAt(2));
        Assertions.assertEquals(60, array.getAt(3));
        Assertions.assertEquals(5, array.size());

    }

    @Test
    void removeAtTheBegining() {
        array.removeAt(0);
        Assertions.assertEquals(20, array.getAt(0));
        Assertions.assertEquals(6, array.size());

        array.removeAt(0);
        Assertions.assertEquals(30, array.getAt(0));
        Assertions.assertEquals(5, array.size());

        array.removeAt(0);
        Assertions.assertEquals(40, array.getAt(0));
        Assertions.assertEquals(4, array.size());

        System.out.println("actual: " + Arrays.toString(array.getData()) + " | length: " + array.size());

    }

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